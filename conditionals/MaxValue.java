/**
 * @(#)MaxValue.java
 *
 *
 * @author 
 * @version 1.00 2025/12/29
 */
import javax.swing.JOptionPane;

public class MaxValue {
    public static void main(String[] args) {

        //declare variable
        String maxInput;
        int max;

        //ask user
        maxInput = JOptionPane.showInputDialog(null, "Enter the maximum value:");
        max = Integer.parseInt(maxInput);

        //header
        String result = "Number    Number Squared\n";
        
        //for loop
        for (int count = 1; count <= max; count++) {
            int square = count * count;
            //result
            result = result + count + "                    " + square +"\n";
        }

        //display
        JOptionPane.showMessageDialog(null, result);
    }
}