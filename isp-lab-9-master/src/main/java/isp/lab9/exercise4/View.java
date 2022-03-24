package isp.lab9.exercise4;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private JFrame frame;
    private JButton temperatureSensorButton;
    private JButton humiditySensorButton;
    private JButton pressureSensorButton;
    private JLabel temperatureLabel;
    private JLabel humidityLabel;
    private JLabel pressureLabel;
    private JTextField temperatureSensorTextField;
    private JTextField humiditySensorTextField;
    private JTextField pressureSensorTextFiled;

    public View(String title){
        frame = new JFrame(title);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        temperatureLabel = new JLabel("Temperature");
        temperatureLabel.setVisible(true);
        temperatureSensorButton = new JButton("Show Temperature");
        temperatureSensorButton.setVisible(true);
        temperatureSensorTextField = new JTextField("");
        temperatureSensorTextField.setVisible(true);

        humidityLabel = new JLabel("Humidity");
        humidityLabel.setVisible(true);
        humiditySensorButton = new JButton("Show Humidity");
        humiditySensorButton.setVisible(true);
        humiditySensorTextField = new JTextField("");
        humiditySensorTextField.setVisible(true);

        pressureLabel = new JLabel("Pressure");
        pressureLabel.setVisible(true);
        pressureSensorButton = new JButton("Show Pressure");
        pressureSensorButton.setVisible(true);
        pressureSensorTextFiled = new JTextField("");
        pressureSensorTextFiled.setVisible(true);

        GroupLayout layout = new GroupLayout(frame.getContentPane());
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(temperatureLabel)
                        .addComponent(humidityLabel).addComponent(pressureLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(temperatureSensorTextField)
                        .addComponent(humiditySensorTextField).addComponent(pressureSensorTextFiled))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(temperatureSensorButton)
                        .addComponent(humiditySensorButton).addComponent(pressureSensorButton)));
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(temperatureLabel)
                        .addComponent(temperatureSensorTextField).addComponent(temperatureSensorButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(humidityLabel)
                        .addComponent(humiditySensorTextField).addComponent(humiditySensorButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(pressureLabel)
                .addComponent(pressureSensorTextFiled).addComponent(pressureSensorButton)));
        layout.linkSize(SwingConstants.HORIZONTAL, temperatureSensorButton, humiditySensorButton,pressureSensorButton );
        frame.getContentPane().setLayout(layout);
    }
    public JFrame getFrame() {
        return frame;
    }
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public void setTemperatureSensorButton(JButton temperatureSensorButton) {
        this.temperatureSensorButton = temperatureSensorButton;
    }

    public void setHumiditySensorButton(JButton humiditySensorButton) {
        this.humiditySensorButton = humiditySensorButton;
    }

    public void setPressureSensorButton(JButton pressureSensorButton) {
        this.pressureSensorButton = pressureSensorButton;
    }

    public void setTemperatureLabel(JLabel temperatureLabel) {
        this.temperatureLabel = temperatureLabel;
    }

    public void setHumidityLabel(JLabel humidityLabel) {
        this.humidityLabel = humidityLabel;
    }

    public void setPressureLabel(JLabel pressureLabel) {
        this.pressureLabel = pressureLabel;
    }

    public void setTemperatureSensorTextField(JTextField temperatureSensorTextField) {
        this.temperatureSensorTextField = temperatureSensorTextField;
    }

    public void setHumiditySensorTextField(JTextField humiditySensorTextField) {
        this.humiditySensorTextField = humiditySensorTextField;
    }

    public void setPressureSensorTextFiled(JTextField pressureSensorTextFiled) {
        this.pressureSensorTextFiled = pressureSensorTextFiled;
    }

    public JButton getTemperatureSensorButton() {
        return temperatureSensorButton;
    }

    public JButton getHumiditySensorButton() {
        return humiditySensorButton;
    }

    public JButton getPressureSensorButton() {
        return pressureSensorButton;
    }

    public JLabel getTemperatureLabel() {
        return temperatureLabel;
    }

    public JLabel getHumidityLabel() {
        return humidityLabel;
    }

    public JLabel getPressureLabel() {
        return pressureLabel;
    }

    public JTextField getTemperatureSensorTextField() {
        return temperatureSensorTextField;
    }

    public JTextField getHumiditySensorTextField() {
        return humiditySensorTextField;
    }

    public JTextField getPressureSensorTextFiled() {
        return pressureSensorTextFiled;
    }
}
