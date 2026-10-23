/**
 * @(#)DoWhileLoop.java
 *
 *
 * @author 
 * @version 1.00 2025/12/29
 */


public class DoWhileLoop {
    public static void main (String[] args) {
        int count = 100;
        do {
            System.out.println(count);
            count += 5;
        } while (count <= 200);
        
    }
}