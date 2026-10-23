/* 
 * @(#)MinimumNumberSwitch.java
 *
 * Minimum Number Finder using Switch Case
 *
 * @author 
 * @version 1.00 2025/12/26
 */

import javax.swing.JOptionPane;

public class MinimumNumberSwitch {

    public static void main(String[] args) {

        //declare variable
        String choiceInput, num1Input, num2Input;
        int choice, num1, num2, minimum;

        //ask user for language
        choiceInput = JOptionPane.showInputDialog(null, 
            "For Malay Press 1, For English Press 2");
        choice = Integer.parseInt(choiceInput);

        switch(choice) {
            case 1:
                //Malay
                num1Input = JOptionPane.showInputDialog(null, 
                    "Masukkan nombor pertama:");
                    //convert string to int
                num1 = Integer.parseInt(num1Input);

                num2Input = JOptionPane.showInputDialog(null, 
                    "Masukkan nombor kedua:");
                    //convert string to int
                num2 = Integer.parseInt(num2Input);

                minimum = Math.min(num1, num2);

                JOptionPane.showMessageDialog(null, 
                    "Nombor minimum ialah: " + minimum);
                break;

            case 2:
                //English
                num1Input = JOptionPane.showInputDialog(null, 
                    "Enter first number:");
                    //convert string to int
                num1 = Integer.parseInt(num1Input);

                num2Input = JOptionPane.showInputDialog(null, 
                    "Enter second number:");
                    //convert string to int
                num2 = Integer.parseInt(num2Input);

                minimum = Math.min(num1, num2);

                JOptionPane.showMessageDialog(null, 
                    "The minimum number is: " + minimum);
                break;

            default:
                JOptionPane.showMessageDialog(null, 
                    "Invalid choice! Please enter 1 or 2");
        }
    }
}
