package isp.lab6.exercise2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EquipmentController {
    List<Equipment> equipments = new ArrayList<Equipment>();
    /**
     * Add new equipment to the list of equipments
     *
     * @param equipment - equipment to be added
     */
    public void addEquipment(final Equipment equipment) {
        equipments.add(equipment);
    }

    /**
     * Get current list of equipments
     *
     * @return list of equipments
     */
    public List<Equipment> getEquipments() {
        return equipments;
    }

    /**
     * Get number of equipments
     *
     * @return number of equipments
     */
    public int getNumberOfEquipments() {
        return equipments.size();
    }

    /**
     * Group equipments by owner
     *
     * @return a dictionary where the key is the owner and value is represented by list of equipments he owns
     */
    public Map<String, List<Equipment>> getEquipmentsGroupedByOwner() {
        Map<String, List<Equipment>> result = new HashMap<String, List<Equipment>>();
        
        for(Equipment e : equipments){
            String currentOwner = e.getOwner();
            List<Equipment> currentListOwnedByOwner = result.get(currentOwner);
            if(currentListOwnedByOwner == null){
                currentListOwnedByOwner = new ArrayList<Equipment>();
                result.put(currentOwner, currentListOwnedByOwner);
            }
            currentListOwnedByOwner.add(e);
        }
        
        return result;
    }

    /**
     * Remove a particular equipment from equipments list by serial number
     * @param serialNumber - unique serial number
     * @return deleted equipment instance or null if not found
     */
    public Equipment removeEquipmentBySerialNumber(final String serialNumber) {
        for(Equipment equip: equipments){
            if(equip.getSerialNumber().equals(serialNumber)){
                equipments.remove(equip);
                return equip;
            }
        }
        return null;
    }
}
