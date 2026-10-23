/**
 * @(#)exerciseArray1.java
 *
 *
 * @author
 * @version 1.00 2026/1/15
 */

import javax.swing.JOptionPane;
public class exerciseArray1 {
    public static void main (String[] args) {
    	//declare variable
    	String cookieIn;
    	int cookie;

    	//ask user
    	cookieIn = JOptionPane.showInputDialog (null, "Enter how many bags of cookie you ate");
    	cookie = Integer.parseInt(cookieIn);

    	//calculation
    	int totalCal = cookie * 40 / 300;

    	//display
    	JOptionPane.showMessageDialog(null, "You Ate this much " + totalCal + " of calories");
    }
}