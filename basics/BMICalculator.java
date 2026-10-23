/*
 * @(#)BMI Calculator.java
 *
 * BMI Calculator
 *
 * @author 
 * @version 1.00 2025/12/26
 */

import javax.swing.JOptionPane;

public class BMICalculator {

    public static void main(String[] args) {

        //declare variable
        String weightInput, heightInput;
        double weight, height, bmi;
        String weightStatus;

        //ask user in kg
        weightInput = JOptionPane.showInputDialog(null, 
            "Enter your weight in kilograms (kg):");
        weight = Double.parseDouble(weightInput);

        //ask user in meters
        heightInput = JOptionPane.showInputDialog(null, 
            "Enter your height in meters (m):");
        height = Double.parseDouble(heightInput);

        //calculation
        bmi = weight / (height * height);

        //if else statement
        if (bmi < 18.5) {
            weightStatus = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25.0) {
            weightStatus = "Normal";
        } else if (bmi >= 25.0 && bmi < 30.0) {
            weightStatus = "Overweight";
        } else {
            weightStatus = "Obese";
        }

        //display
        JOptionPane.showMessageDialog(null, 
            "Weight: " + weight + " kg\n" + "Height: " + height +
             " m\n" + "BMI: " + bmi + "\n" + "Weight Status: " + weightStatus);
    }
}
