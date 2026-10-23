/**
 * @(#)Cylinder.java
 *
 *
 * @author
 * @version 1.00 2026/4/28
 */


public class Cylinder extends Circle {

    //var declaration
    final double PI = 3.142;
    double height = 1.0;

    //no args cons (default)
    public Cylinder() {
        super();
        height = 1.0;
    }

    //cons with value
    public Cylinder(double r, double h) {
        super(r);
        height = h;
    }

    //methods to get value 4 Area and Vol
    public double getArea() {
        return 2 * PI * radius * height + 2 * PI * radius * radius;
    }

    public double getVolume() {
        return PI * radius * radius * height;
    }
}