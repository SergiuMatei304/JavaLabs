package isp.lab10.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ATC {

    List<Aircraft> aircraftList = new ArrayList<>();

    synchronized void addAircraft(Aircraft aircraft) throws InterruptedException {
        for(Aircraft aircrafttemp : aircraftList){
            if(Objects.equals(aircrafttemp.getAircraftId(),aircraft.getAircraftId())){
                return;
            }
        }
        aircraftList.add(aircraft);
    }

    public void sendCommand(String aircraftId,AtcCommand cmd){
        for(Aircraft aircraft : aircraftList){
            if(aircraft.getAircraftId().equals(aircraftId)){
                aircraft.receiveAtcCommand(cmd);
            }
        }
    }

    public List<Aircraft> showAircraft() {
        return aircraftList;
    }

    public String getStatusById(String id){
        for(Aircraft aircraft :aircraftList){
            if(aircraft.getAircraftId().equals(id))
                return aircraft.showStatus();
        }
        return null;
    }
}