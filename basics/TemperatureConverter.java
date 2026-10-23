/**
 * @(#)Temperature Converter.java
 *
 *
 * @author 
 * @version 1.00 2025/12/23
 */

import javax.swing.JOptionPane;
public class TemperatureConverter {

	public static void main (String[] args) {

		//declare variable
		String Fahrenheit, Celsius, option;
		int option1;
		Double fahrenheit, celsius;

		//ask user
		option = JOptionPane.showInputDialog
				(null, "Welcome to Celsius and Fahrenheit Converter\n" +
						"1. Convert Fahrenheit to Celsius\n" +
						"2. Convert Celsius to Fahrenheit");
		//parse option to int
		option1 = Integer.parseInt(option);

		//if statement
		if (option1 == 1) {
			JOptionPane.showMessageDialog(null, "Converting Fahrenheit to Celsius");
			//input user
			Fahrenheit = JOptionPane.showInputDialog(null, "Enter Temperature in Fahrenheit");
			//convert string
			fahrenheit = Double.parseDouble(Fahrenheit);
			//calculation: C = (5/9)*(F - 32)
			celsius = (5.0 / 9.0) * (fahrenheit - 32.0);
			//display
			JOptionPane.showMessageDialog(null, "Temperature in Celsius: " + celsius);
		}

		else if (option1 == 2) {
			JOptionPane.showMessageDialog(null, "Converting Celsius to Fahrenheit");
			//input user
			Celsius = JOptionPane.showInputDialog(null, "Enter Temperature in Celsius");
			//convert string
			celsius = Double.parseDouble(Celsius);
			//calculation: F = (9/5)*C + 32
			fahrenheit = (9.0 / 5.0) * celsius + 32.0;
			//Display
			JOptionPane.showMessageDialog(null, "Temperature in Fahrenheit: " + fahrenheit);
		}

		else {
			JOptionPane.showMessageDialog(null, "Invalid Option");
		}
    	
    		
    	}
    	
    }