/**
 * @(#)FindEvenNumDoWhile.java
 *
 * 
 *
 * @author 
 * @version 1.00 2025/12/29
 */


public class FindEvenNumDoWhile {
    public static void main (String [] args) {
        // declare and assign value to count
        int count = 100;
        do {
            if (count % 2 == 0) {
                System.out.println(count + " is even num");
            }
            count++;
        } while (count <= 200);
    }
}