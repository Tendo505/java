/**
 * @(#)PositiveOrNegativeMethods.java
 *
 *
 * @author 
 * @version 1.00 2026/1/5
 */

import javax.swing.JOptionPane;

public class PositiveOrNegativeMethods {
    //actual parameter main function
    public static void main(String[] args) {
        
        //declare variable
        String firstInput;
        int firstInt;
        
        //ask user
        firstInput = JOptionPane.showInputDialog(null, "Enter a number (Positive or Negative):");
        firstInt = Integer.parseInt(firstInput);
        
        //invoke statement
        boolean answer = isNegative(firstInt);
        
        //display
        if (answer) {
            JOptionPane.showMessageDialog(null, "Your number " + firstInt + " is Negative");
        } else {
            JOptionPane.showMessageDialog(null, "Your number " + firstInt + " is Positive");
        }
        
    }
    
    //method to return true if negative, false if positive (formal parameter)
    public static boolean isNegative(int num1) {
        if (num1 < 0) {
            return true;
        } else {
            return false;
        }
    }
}