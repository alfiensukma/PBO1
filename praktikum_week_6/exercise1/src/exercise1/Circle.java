/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1;

/**
 *
 * @author alfie
 */
public class Circle extends Shape{
    // private instance variable, not accessible from outside this class
    private double radius;
    
    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        super(); 
        radius = 1.0;
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        super(); 
        radius = r;
    }
    
    public Circle(double r, String c, boolean f) { // 3nd constructor
        super(c,f);
        radius = r;
    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return getRadius()*getRadius()*Math.PI;
    }
    
    /** Return a self-descriptive string of this instance in the form of
    Circle[radius=?,color=?] */

    @Override
    public String toString() {
        return "A Circle with radius = "+ getRadius() 
                + " which is a subclass of " + super.toString(); 
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

}
