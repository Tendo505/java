/**
 * @(#)Calculator.java
 *
 *
 * @author dozle
 * @version 1.00 2026/01/03
 */

import javax.swing.JOptionPane;

public class Calculator {
    //main method
    public static void main(String[] args) {
        //declare variables
        String firstInput, secondInput, operationInput;
        int firstNumber, secondNumber;
        int result;
        
        //ask user for first number
        firstInput = JOptionPane.showInputDialog(null, "Enter the first number:");
        firstNumber = Integer.parseInt(firstInput);
        
        //ask user for second number
        secondInput = JOptionPane.showInputDialog(null, "Enter the second number:");
        secondNumber = Integer.parseInt(secondInput);
        
        //ask user for operation
        operationInput = JOptionPane.showInputDialog(null, "Enter operation (add or multiply):");
        
        //check operation and call appropriate method
        if (operationInput.equalsIgnoreCase("add")) {
            result = add(firstNumber, secondNumber);
            JOptionPane.showMessageDialog(null, firstNumber + " + " + secondNumber + " = " + result);
        } else if (operationInput.equalsIgnoreCase("multiply")) {
            result = multiply(firstNumber, secondNumber);
            JOptionPane.showMessageDialog(null, firstNumber + " * " + secondNumber + " = " + result);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid operation. Please enter 'add' or 'multiply'.");
        }
    }
    
    //method to add two numbers
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    
    //method to multiply two numbers
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
}