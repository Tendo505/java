/**
 * @(#)OddOrZero.java
 *
 *
 * @author 
 * @version 1.00 2025/12/23
 */

import javax.swing.JOptionPane;
public class OddOrZero {

    public static void main(String[] args) {

        //declare variables
        String Num;
        int num;

        //ask user
        Num = JOptionPane.showInputDialog(null, "Enter a Number");

        //convert string to int
        num = Integer.parseInt(Num);

        //if zero
        if (num == 0) {
            JOptionPane.showMessageDialog(null, "Your Number is Zero");}
            
        //if even 
        else if (num % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Your Number is Even");}
            
            //if odd 
        else {
            JOptionPane.showMessageDialog(null, "Your Number is Odd");
        }
    }
}
