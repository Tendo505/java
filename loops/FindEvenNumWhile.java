/**
 * @(#)FindEvenNumWhile.java
 *
 * Cari nombor genap dari 100 hingga 200
 *
 * @author 
 * @version 1.00 2025/12/29
 */


public class FindEvenNumWhile {
    public static void main (String[] args) {
        
        //declare and assign value
        int count = 100;
        while (count <= 200) {
            if (count % 2 == 0) {  
                System.out.println(count + " is even num");
            }
            count++;
        }
    }
}