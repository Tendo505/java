/**
 * @(#)MinValue.java
 *
 *
 * @author
 * @version 1.00 2026/01/03
 */

import javax.swing.JOptionPane;

public class MinValueMethods {
    //main method (actual parameter)
    public static void main(String[] args) {
        //declare variables
        String firstInput, secondInput;
        int firstNumber, secondNumber;
        
        //ask user first int
        firstInput = JOptionPane.showInputDialog(null, "Enter the first integer:");
        firstNumber = Integer.parseInt(firstInput);
        
        //ask user second int
        secondInput = JOptionPane.showInputDialog(null, "Enter the second integer:");
        secondNumber = Integer.parseInt(secondInput);
        
        //invoke method and display result
        int minValue = checkMin(firstNumber, secondNumber);
        JOptionPane.showMessageDialog(null, "The minimum of " + firstNumber + " and " + secondNumber + " is: " + minValue);
    }
    
    //method to find and return the minimum of two integers (formal parameter)
    public static int checkMin(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}