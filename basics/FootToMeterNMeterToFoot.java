/**
 * @(#)FootToMeterNMeterToFoot.java
 *
 *
 * @author 
 * @version 1.00 2026/1/8
 */

import javax.swing.JOptionPane;
public class FootToMeterNMeterToFoot {

    public static void main(String[] args) {
    	//declare variable
    	String footIn,meterIn,optionIn;
    		double foot,meter;
    		int option;
    		
    		//ask user
    		optionIn = JOptionPane.showInputDialog (null, "Please Enter Conversion" +
    			"\n 1. Foot to Meter \n 2. Meter to Foot");
    	    option = Integer.parseInt(optionIn);
    	    
    	    if (option == 1) {
    	    //ask user to input + conversion + display
    		footIn = JOptionPane.showInputDialog(null,"Enter Foot");
    		foot = Double.parseDouble(footIn);
    		meter = footToMeter(foot);
    		JOptionPane.showMessageDialog(null, "Total Conversion Foot to Meter is" + meter); 
    	    }
    		 
    		else if (option == 2) {
    			//ask user to input + conversion + call n display
    		meterIn = JOptionPane.showInputDialog(null,"Enter Foot");
    		meter = Double.parseDouble(meterIn);
    		foot = meterToFoot(meter);
    		JOptionPane.showMessageDialog(null, "Total Conversion Meter to Foot is" + foot);
    			
    		}
    			else { 
    				JOptionPane.showMessageDialog (null,"Invalid Choice!!");
    			}
    		
    		
    }
    //formal parameter
    public static double footToMeter(double f) {
    	return 0.305 * f;
    }
    public static double meterToFoot(double m) {
    	return 3.279 * m;
    }
}