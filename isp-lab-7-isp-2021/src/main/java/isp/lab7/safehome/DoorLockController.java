/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab7.safehome;

import java.time.LocalDateTime;
import java.util.*;

/**
 *
 * @author Sergiu
 */
public class DoorLockController implements ControllerInterface{
    private Map<Tenant,AccessKey> validAccess;
    private List<AccessLog> accessLogs;
    private Door door = new Door();
    private int attempts = 0;

    public List<AccessLog> getAccessLogs() {
        return accessLogs;
    }

    public DoorLockController() {
        this.validAccess= new HashMap<>();
        this.accessLogs = new ArrayList<>();
    }

    @Override
    public DoorStatus enterPin(String pin) throws Exception {
        if(Objects.equals(pin,MASTER_KEY)){
            attempts=0;
            door.unlockDoor();
            accessLogs.add(new AccessLog(MASTER_TENANT_NAME, LocalDateTime.now(), "Opening the door with the master key", door.getStatus(), "Too many attempts with incorrect pin"));
            return door.getStatus();
        }
        else if(attempts >= 2){
            accessLogs.add(new AccessLog("Unknown Person",LocalDateTime.now(),"Too many attempts with incorrect pin",door.getStatus(),"Locking the door"));
            door.lockDoor();
            throw new TooManyAttemptsException("Enter MASTER_KEY TO CONTINUE");
        }
        else if(validAccess.values().stream().anyMatch(accessKey -> accessKey.getPin().equals(pin))){
            if(door.getStatus().equals(DoorStatus.OPEN)){
                door.lockDoor();
                System.out.println("Door successfully locked");
                accessLogs.add(new AccessLog("Tenant",LocalDateTime.now(),"Locking the door",door.getStatus(),""));
            }
            else{
                door.unlockDoor();
                System.out.println("Door successfully unlocked");
                accessLogs.add(new AccessLog("Tenant",LocalDateTime.now(),"Unlocking the door",door.getStatus(),""));
            }
            attempts=0;
            return door.getStatus();
        }
        else{
            attempts++;
            accessLogs.add(new AccessLog("Unknown Person", LocalDateTime.now(), "Trying to open the door with invalid pin", door.getStatus(), "Invalid pin"));
            throw new InvalidPinException("Wrong PIN! Try again !");
        }
    }

    public void addTenant(String pin, String tenantName) throws Exception{
        for(Map.Entry<Tenant,AccessKey> tenantAccessKeyEntry : validAccess.entrySet()) {
            if(Objects.equals(tenantName,tenantAccessKeyEntry.getKey().getName())){
                accessLogs.add(new AccessLog(tenantName,LocalDateTime.now(),"Trying to add an existing tenant",door.getStatus(),"Tenant already in the system"));
                throw new TenantAlreadyExistsException("Tenant already in the system");
            }
        }
        System.out.println("Tenant successfully added");
        accessLogs.add(new AccessLog(tenantName,LocalDateTime.now(),"Adding tenant in system",door.getStatus(),""));
        validAccess.put(new Tenant(tenantName),new AccessKey(pin));
    }
    
    public void removeTenant(String name) throws Exception{
        if(validAccess.keySet().stream().noneMatch(tenant -> tenant.getName().equals(name))){
            accessLogs.add(new AccessLog(name,LocalDateTime.now(),"Not founding in system",door.getStatus(),"Tenant not found"));
            throw new TenantNotFoundException("Tenant not found in the system");
        }
        validAccess.keySet().stream().filter(tenant -> tenant.getName().equals(name)).findFirst().ifPresent(validAccess::remove);
        System.out.println("Tenant successfully removed");
        accessLogs.add(new AccessLog(name,LocalDateTime.now(),"Removed from system",door.getStatus(),""));
    }

}
