/*
 * @(#)CircleCalculator.java
 *
 * Circle Calculator
 *
 * @author 
 * @version 1.00 2025/12/26
 */

import javax.swing.JOptionPane;

public class CircleCalculator {

    public static void main(String[] args) {

        // declare variable
        String radiusInput, choiceInput;
        double radius, result;
        String resultMessage;

        // ask user to choose area or perimeter
        choiceInput = JOptionPane.showInputDialog(null, 
            "Enter 1 for Area or 2 for Perimeter:");
        int choice = Integer.parseInt(choiceInput);

        // ask user for radius
        radiusInput = JOptionPane.showInputDialog(null, 
            "Enter the radius of the circle in units:");
        radius = Double.parseDouble(radiusInput);

        //calculation based on choice
        if (choice == 1) {
            // area calculation
            result = Math.PI * radius * radius;
            resultMessage = "Area";
        } else if (choice == 2) {
            // perimeter calculation
            result = 2 * Math.PI * radius;
            resultMessage = "Perimeter";
        } else {
            JOptionPane.showMessageDialog(null, 
                "Invalid choice! Please enter 1 or 2.");
            return;
        }

        //display result
        JOptionPane.showMessageDialog(null, 
            "Radius: " + radius + " units\n" + 
            resultMessage + ": " + result + " units");
    }
}
