/**
 * @(#)CalculatorMethods.java
 *
 *
 * @author
 * @version 1.00 2026/01/05
 */

import javax.swing.JOptionPane;

public class SumProductAverageMethods {
    //main method
    public static void main(String[] args) {
        //declare variables
        String firstInput, secondInput, operationInput;
        int firstNumber, secondNumber, operation;
        
        //ask user for first number
        firstInput = JOptionPane.showInputDialog(null, "Enter the first integer:");
        firstNumber = Integer.parseInt(firstInput);
        
        //ask user for second number
        secondInput = JOptionPane.showInputDialog(null, "Enter the second integer:");
        secondNumber = Integer.parseInt(secondInput);
        
        //ask user for operation (Sum, Product or Average)
        operationInput = JOptionPane.showInputDialog(null, "Enter operation:\n1 for Sum\n2 for Product\n3 for Average:");
        operation = Integer.parseInt(operationInput);
        
        //check operation and invoke appropriate method and display result
        if (operation == 1) {
            int result = sum(firstNumber, secondNumber);
            JOptionPane.showMessageDialog(null, "Sum: " + firstNumber + " + " + secondNumber + " = " + result);
        } else if (operation == 2) {
            int result = product(firstNumber, secondNumber);
            JOptionPane.showMessageDialog(null, "Product: " + firstNumber + " * " + secondNumber + " = " + result);
        } else if (operation == 3) {
            double result = average(firstNumber, secondNumber);
            JOptionPane.showMessageDialog(null, "Average: (" + firstNumber + " + " + secondNumber + ") / 2 = " + result);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid operation. Please enter 1, 2, or 3.");
        }
    }
    
    //method to calculate and return the sum of two integers
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    
    //method to calculate and return the product of two integers
    public static int product(int num1, int num2) {
        return num1 * num2;
    }
    
    //method to calculate and return the average of two integers
    public static double average(int num1, int num2) {
        return (num1 + num2) / 2.0;
    }
}