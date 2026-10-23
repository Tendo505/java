import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q2 extends JFrame implements ActionListener {

    // Declare labels
    JLabel lblName, lblHours, lblRate, lblFederal, lblState;

    // Declare text fields
    JTextField txtName, txtHours, txtRate, txtFederal, txtState;

    // Declare button
    JButton btnCalculate;

    public Q2() {

        // Frame title
        setTitle("Simple Payroll System");

        // Frame size
        setSize(350, 300);

        // Use AWT layout
        setLayout(new GridLayout(6, 2));

        // Close program when exit
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create labels
        lblName = new JLabel("Employee Name:");
        lblHours = new JLabel("Hours Worked:");
        lblRate = new JLabel("Hourly Pay Rate:");
        lblFederal = new JLabel("Federal Tax Rate:");
        lblState = new JLabel("State Tax Rate:");

        // Create text fields
        txtName = new JTextField();
        txtHours = new JTextField();
        txtRate = new JTextField();
        txtFederal = new JTextField();
        txtState = new JTextField();

        // Create button
        btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(this);

        // Add components to frame
        add(lblName);
        add(txtName);

        add(lblHours);
        add(txtHours);

        add(lblRate);
        add(txtRate);

        add(lblFederal);
        add(txtFederal);

        add(lblState);
        add(txtState);

        add(new JLabel("")); // empty space
        add(btnCalculate);

        // Show frame
        setVisible(true);
    }

    // Button click action
    public void actionPerformed(ActionEvent e) {

        // Get user input
        String name = txtName.getText();
        double hours = Double.parseDouble(txtHours.getText());
        double rate = Double.parseDouble(txtRate.getText());
        double federal = Double.parseDouble(txtFederal.getText());
        double state = Double.parseDouble(txtState.getText());

        // Calculate values
        double grossPay = hours * rate;
        double totalDeduction = (grossPay * federal) + (grossPay * state);
        double netPay = grossPay - totalDeduction;

        // Display result
        JOptionPane.showMessageDialog(this,
                "Payroll Statement\n\n" +
                        "Employee Name: " + name + "\n" +
                        "Gross Pay: RM " + String.format("%.2f", grossPay) + "\n" +
                        "Total Deduction: RM " + String.format("%.2f", totalDeduction) + "\n" +
                        "Net Pay: RM " + String.format("%.2f", netPay)
        );
    }

    public static void main(String[] args) {
        new Q2();
    }
}
