/**
 * @(#)Circle.java
 *
 *
 * @author
 * @version 1.00 2026/4/28
 */

public class Circle {

    //var declaration
    double radius = 1.0;

    //no args cons (default)
    public Circle() {
        radius = 1.0;
    }

    //cons with value
    public Circle(double r) {
        radius = r;
    }

    //method to get value 4 Area
    public double getArea() {
        return 3.142 * radius * radius;
    }
}