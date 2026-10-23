/*
 * @(#)ThreeNumbers.java
 *
 * Three Numbers Calculator
 *
 * @author 
 * @version 1.00 2025/12/26
 */

import javax.swing.JOptionPane;

public class ThreeNumbers {

    public static void main(String[] args) {

        //declare variable
        String num1Input, num2Input, num3Input;
        int num1, num2, num3;
        int sum, product, minimum, maximum;
        double average;

        //ask user for first number
        num1Input = JOptionPane.showInputDialog(null, 
            "Enter the first integer:");
            //convert string to int
        num1 = Integer.parseInt(num1Input);

        //ask user for second number
        num2Input = JOptionPane.showInputDialog(null, 
            "Enter the second integer:");
            //convert string to int
        num2 = Integer.parseInt(num2Input);

        //ask user for third number
        num3Input = JOptionPane.showInputDialog(null, 
            "Enter the third integer:");
            //convert string to int
        num3 = Integer.parseInt(num3Input);

        //calculation
        sum = num1 + num2 + num3;
        average = sum / 3.0;
        product = num1 * num2 * num3;
        
        //find minimum
        if(num1 <= num2 && num1 <= num3) {
            minimum = num1;
        }
        else if(num2 <= num1 && num2 <= num3) {
            minimum = num2;
        }
        else {
            minimum = num3;
        }
        
        //find maximum
        if(num1 >= num2 && num1 >= num3) {
            maximum = num1;
        }
        else if(num2 >= num1 && num2 >= num3) {
            maximum = num2;
        }
        else {
            maximum = num3;
        }

        //display
        JOptionPane.showMessageDialog(null, 
            "Number 1: " + num1 + "\n" + 
            "Number 2: " + num2 + "\n" + 
            "Number 3: " + num3 + "\n\n" +
            "Sum: " + sum + "\n" + 
            "Average: " + average + "\n" + 
            "Product: " + product + "\n" + 
            "Minimum: " + minimum + "\n" + 
            "Maximum: " + maximum);
    }
}