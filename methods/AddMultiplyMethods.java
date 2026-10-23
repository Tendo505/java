/**
 * @(#)AddMultiplyMethods.java
 *
 *
 * @author
 * @version 1.00 2026/01/05
 */

import javax.swing.JOptionPane;

public class AddMultiplyMethods {
    //main method
    public static void main(String[] args) {
        //declare variables
        String firstInput, secondInput, operationInput;
        int firstNumber, secondNumber, operation;
        
        //ask user for first number
        firstInput = JOptionPane.showInputDialog(null, "Enter the first number:");
        firstNumber = Integer.parseInt(firstInput);
        
        //ask user for second number
        secondInput = JOptionPane.showInputDialog(null, "Enter the second number:");
        secondNumber = Integer.parseInt(secondInput);
        
        //ask user for operation (Add or Multiply)
        operationInput = JOptionPane.showInputDialog(null, "Enter operation (1 for add or 2 for multiply):");
        operation = Integer.parseInt(operationInput);
        
        
        //check operation and invoke appropriate method and display result
        if (operation == 1) {
            int result = add(firstNumber, secondNumber);
            JOptionPane.showMessageDialog(null, firstNumber + " + " + secondNumber + " = " + result);
        } else if (operation == 2) {
            int result = multiply(firstNumber, secondNumber);
            JOptionPane.showMessageDialog(null, firstNumber + " * " + secondNumber + " = " + result);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid operation. Please enter 'add' or 'multiply'.");
        }
    }
    
    //method to add two integers
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    
    //method to multiply two integers
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
}