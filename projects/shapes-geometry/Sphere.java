/**
 * @(#)Sphere.java
 *
 *
 * @author
 * @version 1.00 2026/4/28
 */


public class Sphere extends Circle {

    //var declaration
    final double PI = 3.142;

    //no args cons (default)
    public Sphere() {
        super();
    }

    //cons with value
    public Sphere(double r) {
        super(r);
    }

    //methods to get value 4 Area and Vol
    public double getArea() {
        return 4 * PI * radius * radius;
    }

    public double getVolume() {
        return 4.0/3.0 * PI * radius * radius * radius;
    }
}