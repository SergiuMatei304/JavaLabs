package isp.lab9.exercise4;

public class Controller {
    private Model model;
    private View view;
    public Controller(Model m, View v) {
        model = m;
        view = v;
        initView();
    }
    public void initView() {
        view.getTemperatureSensorTextField().setText("");
        view.getHumiditySensorTextField().setText("");
        view.getPressureSensorTextFiled().setText("");
    }
    public void initController() {
        view.getTemperatureSensorButton().addActionListener(e -> showTemperature());
        view.getHumiditySensorButton().addActionListener(e -> showHumidity());
        view.getPressureSensorButton().addActionListener(e -> showPressure());
    }
    private void showTemperature(){
        view.getTemperatureSensorTextField().setText(model.getTemperatureSensor().showValue());
    }

    private void showHumidity(){
        view.getHumiditySensorTextField().setText(model.getHumiditySensor().showValue());
    }

    private void showPressure(){
        view.getPressureSensorTextFiled().setText(model.getPressureSensor().showValue());
    }
}
