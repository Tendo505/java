/**
 * @(#)Cone.java
 *
 *
 * @author
 * @version 1.00 2026/4/28
 */


public class Cone extends Circle {

    //var declaration
    final double PI = 3.142;
    double height = 1.0;

    //no args cons (default)
    public Cone() {
        super();
        height = 1.0;
    }

    //cons with value
    public Cone(double r, double h) {
        super(r);
        height = h;
    }

    //methods to get value 4 Area and Vol
    public double getArea() {
        return PI * radius * (radius + Math.sqrt(height*height + radius*radius));
    }

    public double getVolume() {
        return PI * radius * radius * (height / 3);
    }
}