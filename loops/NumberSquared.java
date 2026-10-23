/**
 * @(#)NumberSquared.java
 *
 *
 * @author 
 * @version 1.00 2025/12/29
 */


public class NumberSquared {
    public static void main (String [] args) {
    	
        //header
        System.out.println("Number\t\tNumber Squared");
    
        //for loop
        for (int num = 1; num <= 10; num++) {
        	//declare square of num and num
            int squared = num * num;
            System.out.println(num + "\t\t\t" + squared);
        }
    }
}