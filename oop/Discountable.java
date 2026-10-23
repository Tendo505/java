/**
 * @(#)Discountable.java
 *
 * Interface for discount functionality
 * @author
 * @version 1.00 2026/2/15
 */

public interface Discountable {
    
    //check if eligible for discount
    boolean isStudentDiscount();
    
    //get discount percentage
    double getDiscountPercentage();
    
    //calculate discounted price
    double applyDiscount(double originalPrice);
}
