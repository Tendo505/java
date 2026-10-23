/**
 * @(#)TemperatureConverter.java
 *
 *
 * @author
 * @version 1.00 2026/6/12
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends JFrame implements ActionListener {

    //labels
    JLabel title      = new JLabel("Temperature Conversion System", SwingConstants.CENTER);
    JLabel lblEnter   = new JLabel("Enter Temperature :");
    JLabel lblConvert = new JLabel("Conversion Type   :");
    JLabel lblResult  = new JLabel("Result            :");

    //text field
    JTextField tfTemperature = new JTextField(20);

    //combobox
    Object[] options = {"Celsius to Fahrenheit", "Fahrenheit to Celsius"};
    JComboBox cboConversion  = new JComboBox(options);

    //buttons
    JButton btnConvert = new JButton("Convert");
    JButton btnExit    = new JButton("Exit");

    TemperatureConverter() {
        Container con = getContentPane();
        con.setLayout(new GridLayout(4, 2, 0, 0));

        con.add(lblEnter);
        con.add(tfTemperature);
        con.add(lblConvert);
        con.add(cboConversion);
        con.add(lblResult);
        con.add(new JLabel());
        con.add(btnConvert);
        con.add(btnExit);

        btnConvert.addActionListener(this);
        btnExit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == btnConvert) {
            double inputTemp = Double.parseDouble(tfTemperature.getText());
            double result;

            if (cboConversion.getSelectedIndex() == 0) {
                result = inputTemp * (9.0 / 5.0) + 32;
                lblResult.setText("Result : " + result + " F");
            } else {
                result = (5.0 / 9.0) * (inputTemp - 32);
                lblResult.setText("Result : " + result + " C");
            }
        }

        if (source == btnExit) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        TemperatureConverter frame = new TemperatureConverter();
        frame.setTitle("Temperature Conversion System");
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}