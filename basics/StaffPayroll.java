/**
 * @(#)StaffPayroll.java
 *
 *
 * @author 
 * @version 1.00 2025/12/22
 */


import javax.swing.JOptionPane;

public class StaffPayroll {
    public static void main(String[] args) {

        // declare variables
        String name, hours, rate, federal, state;
        String employeeName;

        double hoursWorked, hourlyRate;
        double federalTaxRate, stateTaxRate;
        double grossPay, totalDeduction, netPay;

        // input
        employeeName = JOptionPane.showInputDialog(null, "Enter Employee Name:");
        hours = JOptionPane.showInputDialog(null, "Enter Hours Worked:");
        rate = JOptionPane.showInputDialog(null, "Enter Hourly Pay Rate:");
        federal = JOptionPane.showInputDialog(null, "Enter Federal Tax Rate:");
        state = JOptionPane.showInputDialog(null, "Enter State Tax Rate:");

        // convert input
        hoursWorked = Double.parseDouble(hours);
        hourlyRate = Double.parseDouble(rate);
        federalTaxRate = Double.parseDouble(federal);
        stateTaxRate = Double.parseDouble(state);

        // calculation
        grossPay = hoursWorked * hourlyRate;
        totalDeduction = grossPay * federalTaxRate + grossPay * stateTaxRate;
        netPay = grossPay - totalDeduction;

        // display payroll statement
        JOptionPane.showMessageDialog(
            null,"Employee Name: " + employeeName +"\nGross Pay: RM " + grossPay + "\nTotal Deduction: RM " + totalDeduction + "\nNet Pay: RM " + netPay
        );
    }
}