/**
 * @(#)ConvertTemperatureMethods.java
 *
 *
 * @author 
 * @version 1.00 2026/1/8
 */

import javax.swing.JOptionPane;
public class ConvertTemperatureMethods {
    //actual parameter
    public static void main (String[] args) {
    	//declare variables
    	String CelsiusIn;
    	double celsius;
    	
    	//ask user
        CelsiusIn = JOptionPane.showInputDialog (null, "Enter Celsius: ");
        celsius = Double.parseDouble(CelsiusIn);
        
        //call and display methods
        double fahrenheit = ConvTemp(celsius);
        JOptionPane.showMessageDialog(null,"Your Temperature in Fahrenheit is: " + fahrenheit);
    }
    //formal parameter
    public static double ConvTemp(double c) {
    	return 1.8 * c + 32;
    }
    
    
}