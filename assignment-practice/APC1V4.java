/**
 * @(#)APC1V4.java
 *
 * Basic Using Methods
 *
 * @author
 * @version 1.00 2026/5/12
 */

import javax.swing.JOptionPane;
public class APC1V4 {
    public static void main (String[] args){
    	//Tells user to key in input
    	String num1 = JOptionPane.showInputDialog(null,"Enter first number: ");
    	int n1 = Integer.parseInt(num1);
    		String num2 = JOptionPane.showInputDialog(null, "Enter sec number: ");
    		int n2 = Integer.parseInt(num2);
    		String num3 = JOptionPane.showInputDialog(null, "Enter third number: ");
    		int n3 = Integer.parseInt(num3);

    		//Call Method
    		LARGEST(n1, n2, n3);
    		LOWEST (n1, n2, n3);
    		SUMnAVERAGE (n1,n2,n3);
    		PosAndNeg (n1,n2, n3);
    		Above80(n1,n2,n3);
    		Below20(n1, n2, n3);

    	}
        //formal method for largest (processes)
    	public static void LARGEST (int no1, int no2, int no3) {

    		int	LARGEST = no1;


    			if (no2 > LARGEST) {
    				LARGEST = no2;
    			}

    			if (no3 > LARGEST) {
    				LARGEST = no3;
    			}


    			//Display
    			JOptionPane.showMessageDialog (null, "The Largest number is " + LARGEST);
    		}


  			//formal method for lowest (processes)
  			public static void LOWEST(int no1, int no2, int no3){
  				 int LOWEST = no1;

  				if (no2 < LOWEST){
  					LOWEST = no2;
  				}
  				if (no3 < LOWEST) {
  					LOWEST = no3;
  				}

  				//Display
  				JOptionPane.showMessageDialog(null, "This is your lowest: " + LOWEST);
  			}

         //for total And average
         public static void SUMnAVERAGE(int no1,int no2, int no3){
         	int Total = no1 + no2 + no3;
         	int Average = (no1 + no2 + no3) / 3;

          JOptionPane.showMessageDialog (null,"The sum of 3 num is: " + Total);
          JOptionPane.showMessageDialog (null,"The average of 3 num is: " + Average);

         }

         //to check postive and negative number
         public static void PosAndNeg(int no1, int no2, int no3){
         	int Positive = 0;
         	int Negative = 0;

         if (no1 > 0) {
         Positive = no1;
         }

         if (no2 > 0 ) {
         	Positive = no2;
         }

         if (no3 > 0) {
         	Positive = no3;
         }
         if (no1 < 0) {
         	Negative = no1;
         }
         if (no2 < 0) {
         	Negative = no2;
         }
         if (no3 < 0) {
         	Negative = no3;
         }

         //Display
         JOptionPane.showMessageDialog(null, "Your Positive number is: " + Positive);
         JOptionPane.showMessageDialog(null, "Your Negative number is: " + Negative);
         }

         //for above80
         public static void Above80(int no1, int no2, int no3) {
         	int Above80 = 0;

         	if (no1 > 80){
         		Above80++;
         	}
         	if (no2 > 80){
         		Above80++;
         	}
         	 if (no3 > 80){
         		Above80++;
         	}
         	if (Above80 > 0) //akan check berapa nombor above 80
         	{
         	JOptionPane.showMessageDialog(null,"This is total of num above 80: " + Above80);
            }

         	else {
         		JOptionPane.showMessageDialog(null,"Thats not above 80");
         	}
         }


         //for below20
         public static void Below20(int no1, int no2, int no3) {
         	int Below20 = 0;

         	if (no1 < 20){
         		Below20++;
         	}
         	if (no2 > 20){
         		Below20++;
         	}
         	 if (no3 > 20){
         		Below20++;
         	}
         	if (Below20 > 0)//akan check berapa nombor yang below 20
         	{
         	JOptionPane.showMessageDialog(null,"This is total of num below20 : " + Below20);
            }

         	else {
         		JOptionPane.showMessageDialog(null,"Thats not below 20");
         	}
         }


    	}//class closed
