package isp.lab9.exercise1;

class AlarmController implements Observer {

    @Override
    public void update(Object event) {
        System.out.println("Sending SMS message to owner.");

    }

}
