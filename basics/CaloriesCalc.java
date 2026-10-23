/**
 * @(#)CaloriesCalc.java
 *
 *
 * @author
 * @version 1.00 2025/12/22
 */


import javax.swing.JOptionPane;

public class CaloriesCalc {
    public static void main(String[] args) {

        // declare variables
        String kg1,weight;
        double kg,bodyWeight,TotalCalories;

        // ask user to input radius
        kg1 = JOptionPane.showInputDialog(null, "Enter KG: ");
        weight = JOptionPane.showInputDialog(null, "Enter Weight: ");
        // convert String to double
        TotalCalories = Integer.parseInt(kg1);
        TotalCalories = Integer.parseInt(weight);

        // calculate volume of sphere
        TotalCalories = bodyWeight * 19;

        // display result
        JOptionPane.showMessageDialog( null,"Your Total Calories: " + TotalCalories
        );
    }
}
