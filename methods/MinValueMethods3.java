/**
 * @(#)MinValue.java
 *
 *
 * @author
 * @version 1.00 2026/01/03
 */

import javax.swing.JOptionPane;

public class MinValueMethods3 {
    //main method (actual parameter)
    public static void main(String[] args) {
        //declare variables
        String firstInput, secondInput, thirdInput;
        int firstNumber, secondNumber, thirdNumber;
        
        //ask user first int
        firstInput = JOptionPane.showInputDialog(null, "Enter the first integer:");
        firstNumber = Integer.parseInt(firstInput);
        
        //ask user second int
        secondInput = JOptionPane.showInputDialog(null, "Enter the second integer:");
        secondNumber = Integer.parseInt(secondInput);
        
        //ask user third int
        thirdInput = JOptionPane.showInputDialog(null, "Enter the third integer:");
        thirdNumber = Integer.parseInt(thirdInput);
        
        //invoke method with two integers and display result
        int minValue = checkMin(firstNumber, secondNumber);
        JOptionPane.showMessageDialog(null, "The minimum of " + firstNumber + " and " + secondNumber + " is: " + minValue);
        
        //invoke method with three integers and display result
        int minValueThree = checkMin(firstNumber, secondNumber, thirdNumber);
        JOptionPane.showMessageDialog(null, "The minimum of " + firstNumber + ", " + secondNumber + ", and " + thirdNumber + " is: " + minValueThree);
    }
    
    //method to find and return the minimum of two integers (formal parameter)
    public static int checkMin(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
    
    //method to find and return the minimum of three integers (formal parameter)
    public static int checkMin(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num3) {
            return num2;
        } else {
            return num3;
        }
    }
}