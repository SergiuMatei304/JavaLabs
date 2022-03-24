package isp.lab10.exercise1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AtcCommandUI extends JFrame implements ActionListener {
    JLabel labelForAircraftId = null;
    JTextField textFieldForAircraftId = null;
    JLabel labelForAircraftStatus = null;
    JTextField textFieldForAircraftStatus = null;
    JButton addAircraftButton = null;
    JButton addCommandButton = null;
    JButton showAircraftList = null;
    JDialog dialogForAddAircraft = null;
    JDialog dialogForAddCommand = null;
    JDialog dialogForShowAircraftList = null;
    JLabel dialogLabelForAircraftId = null;
    JTextField dialogTextFieldForAircraftId = null;
    JButton dialogAddAircraftButton = null;
    JLabel dialogLabelForAddCommand = null;
    JTextField dialogTextFieldForAddCommand = null;
    JLabel helpfulLabelForAddCommand = null;
    JButton dialogAddCommandButton = null;
    JLabel dialogAltitudeLabel = null;
    JTextField dialogAltitudeTextField = null;
    JScrollPane scrollPaneForAircraftList = null;
    JTextArea aircraftListTextArea = null;
    ATC atc = new ATC();
    Aircraft aircraft = new Aircraft("0");
    String id ="0";

    public AtcCommandUI(){
        setSize(600,200);
        setTitle("ATC");
        setVisible(true);
        getContentPane().setLayout(null);
        Initializer();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void Initializer() {

        // Initialize the label for aircraft id
        this.labelForAircraftId = new JLabel("Aircraft ID");
        this.labelForAircraftId.setVisible(true);
        this.labelForAircraftId.setBounds(300,10,60,25);
        add(labelForAircraftId);

        //Initialize the text field for aircraft id
        this.textFieldForAircraftId = new JTextField();
        this.textFieldForAircraftId.setVisible(true);
        this.textFieldForAircraftId.setBounds(400,10,150,25);
        this.textFieldForAircraftId.setEditable(false);
        add(textFieldForAircraftId);

        //Initialize the label for aircraft status
        this.labelForAircraftStatus = new JLabel("Aircraft status");
        this.labelForAircraftStatus.setVisible(true);
        this.labelForAircraftStatus.setBounds(300,50,100,25);
        add(labelForAircraftStatus);

        //Initialize the text filed fot aircraft status
        this.textFieldForAircraftStatus = new JTextField();
        this.textFieldForAircraftStatus.setVisible(true);
        this.textFieldForAircraftStatus.setBounds(400,50,150,25);
        this.textFieldForAircraftStatus.setEditable(false);
        add(textFieldForAircraftStatus);

        //Initialize the button that open dialog box for adding an aircraft
        this.addAircraftButton = new JButton("Add an aircraft");
        this.addAircraftButton.setVisible(true);
        this.addAircraftButton.setBounds(20,10,150,25);
        this.addAircraftButton.addActionListener(this);
        add(addAircraftButton);

        //Initialize the button that open the dialog box for adding a command
        this.addCommandButton = new JButton("Add a command");
        this.addCommandButton.setVisible(true);
        this.addCommandButton.setBounds(20,60,150,25);
        this.addCommandButton.addActionListener(this);
        add(addCommandButton);

        //Initialize the button that open the dialog box for aircraft list
        this.showAircraftList = new JButton("Show aircraft list");
        this.showAircraftList.setVisible(true);
        this.showAircraftList.setBounds(20,110,150,25);
        this.showAircraftList.addActionListener(this);
        add(showAircraftList);
    }

        public void InitializeAddAircraftDialog() {

            //Initialize the dialog box for adding aircraft
            this.dialogForAddAircraft = new JDialog();
            this.dialogForAddAircraft.setTitle("Add Aircraft");
            this.dialogForAddAircraft.setResizable(false);
            this.dialogForAddAircraft.setSize(400,255);
            this.dialogForAddAircraft.getContentPane().setLayout(null);
            this.dialogForAddAircraft.setLocationRelativeTo(null);
            this.dialogForAddAircraft.setVisible(true);

            //Initialize label for aircraft id
            this.dialogLabelForAircraftId = new JLabel("Enter aircraft ID");
            this.dialogLabelForAircraftId.setVisible(true);
            this.dialogLabelForAircraftId.setBounds(10,65,100,25);
            dialogForAddAircraft.add(dialogLabelForAircraftId);

            //Initialize text field for aircraft id
            this.dialogTextFieldForAircraftId = new JTextField();
            this.dialogTextFieldForAircraftId.setVisible(true);
            this.dialogTextFieldForAircraftId.setBounds(120,65,150,25);
            dialogForAddAircraft.add(dialogTextFieldForAircraftId);

            //Initialize the button for adding aircraft
            this.dialogAddAircraftButton = new JButton("Add an aircraft");
            this.dialogAddAircraftButton.setBounds(110,140,150,25);
            this.dialogAddAircraftButton.setVisible(true);
            dialogForAddAircraft.add(dialogAddAircraftButton);

            //Action listener for the add aircraft button
            dialogAddAircraftButton.addActionListener(actionEvent -> {
                try {
                    aircraft = new Aircraft(dialogTextFieldForAircraftId.getText());
                    atc.addAircraft(aircraft);
                    Thread thread = new Thread(aircraft);
                    thread.start();
                    id=dialogTextFieldForAircraftId.getText();
                    this.textFieldForAircraftStatus.setText(atc.getStatusById(id));
                    this.textFieldForAircraftId.setText(id);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                dialogForAddAircraft.setVisible(false);
            });
        }


        public void InitializeAddCommandDialog(){

            //Initialize the dialog box for the command
            this.dialogForAddCommand = new JDialog();
            this.dialogForAddCommand.setTitle("Add command");
            this.dialogForAddCommand.setResizable(false);
            this.dialogForAddCommand.setSize(400, 255);
            this.dialogForAddCommand.getContentPane().setLayout(null);
            this.dialogForAddCommand.setLocationRelativeTo(null);
            this.dialogForAddCommand.setVisible(true);

            //Initialize the label for aircraft id
            this.dialogLabelForAircraftId = new JLabel("Enter aircraft ID");
            this.dialogLabelForAircraftId.setVisible(true);
            this.dialogLabelForAircraftId.setBounds(10, 10, 100, 25);
            dialogForAddCommand.add(dialogLabelForAircraftId);

            //Initialize the text field for aircraft id
            this.dialogTextFieldForAircraftId = new JTextField();
            this.dialogTextFieldForAircraftId.setVisible(true);
            this.dialogTextFieldForAircraftId.setBounds(110, 10, 100, 25);
            dialogForAddCommand.add(dialogTextFieldForAircraftId);

            //Initialize the label for command
            this.dialogLabelForAddCommand = new JLabel("Command");
            this.dialogLabelForAddCommand.setVisible(true);
            this.dialogLabelForAddCommand.setBounds(10, 45, 100, 25);
            dialogForAddCommand.add(dialogLabelForAddCommand);

            //Initialize the text field for the command
            this.dialogTextFieldForAddCommand = new JTextField();
            this.dialogTextFieldForAddCommand.setVisible(true);
            this.dialogTextFieldForAddCommand.setBounds(110, 45, 100, 25);
            dialogForAddCommand.add(dialogTextFieldForAddCommand);

            //Initialize the label for altitude
            this.dialogAltitudeLabel = new JLabel("Altitude");
            this.dialogAltitudeLabel.setVisible(true);
            this.dialogAltitudeLabel.setBounds(10, 80, 100, 25);
            dialogForAddCommand.add(dialogAltitudeLabel);

            //Initialize the text field for altitude
            this.dialogAltitudeTextField = new JTextField();
            this.dialogAltitudeTextField.setVisible(true);
            this.dialogAltitudeTextField.setBounds(110, 80, 100, 25);
            dialogForAddCommand.add(dialogAltitudeTextField);

            //Initialize the text field for helpful label
            this.helpfulLabelForAddCommand = new JLabel("Commands: TAKEOFF & LAND");
            this.helpfulLabelForAddCommand.setVisible(true);
            this.helpfulLabelForAddCommand.setBounds(210, 45, 180, 25);
            dialogForAddCommand.add(helpfulLabelForAddCommand);


            //Initialize the button for sending command
            this.dialogAddCommandButton = new JButton("Send");
            this.dialogAddCommandButton.setVisible(true);
            this.dialogAddCommandButton.setBounds(140, 150, 100, 25);
            dialogForAddCommand.add(dialogAddCommandButton);

            //action listener for sending command button
            dialogAddCommandButton.addActionListener(actionEvent -> {
                if (dialogTextFieldForAddCommand.getText().equals("TAKEOFF")) {
                    AtcCommand takeoff = new TakeoffCommand(Integer.parseInt(dialogAltitudeTextField.getText()));
                    atc.sendCommand(dialogTextFieldForAircraftId.getText(), takeoff);
                    dialogForAddCommand.setVisible(false);
                    id = dialogTextFieldForAircraftId.getText();
                    this.textFieldForAircraftId.setText(id);
                } else if (dialogTextFieldForAddCommand.getText().equals("LAND")) {
                    AtcCommand land = new LandCommand();
                    atc.sendCommand(dialogTextFieldForAircraftId.getText(), land);
                    dialogForAddCommand.setVisible(false);
                    id = dialogTextFieldForAircraftId.getText();
                    this.textFieldForAircraftId.setText(id);
                }
            });
        }
        public void InitializerShowAircraftListDialog(){

            //Initialize the dialog for aircraft list
            this.dialogForShowAircraftList = new JDialog();
            this.dialogForShowAircraftList.setTitle("Show Aircraft List");
            this.dialogForShowAircraftList.setResizable(false);
            this.dialogForShowAircraftList.setSize(400, 255);
            this.dialogForShowAircraftList.getContentPane().setLayout(null);
            this.dialogForShowAircraftList.setLocationRelativeTo(null);
            this.dialogForShowAircraftList.setVisible(true);

            //Initialize the text area for aircraft list
            this.aircraftListTextArea = new JTextArea();

            //Initialize the scroll panel
            this.scrollPaneForAircraftList = new JScrollPane(aircraftListTextArea);
            this.scrollPaneForAircraftList.setBounds(10,20,300,180);
            this.scrollPaneForAircraftList.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            dialogForShowAircraftList.getContentPane().add(scrollPaneForAircraftList);
            this.aircraftListTextArea.setText(atc.showAircraft().toString());
            this.aircraftListTextArea.setEditable(false);

        }
        public void  start(){
            while(aircraft.getAircraftStatus()) {
                this.textFieldForAircraftStatus.setText(atc.getStatusById(id));
                System.out.println(atc.getStatusById(id));
            }
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addAircraftButton){
            InitializeAddAircraftDialog();
        }else if(e.getSource()==addCommandButton){
            InitializeAddCommandDialog();
        }else if(e.getSource()==showAircraftList){
            InitializerShowAircraftListDialog();
        }
    }
}
