/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studikasus2;

/**
 *
 * @author alfie
 */
public class Cylinder extends Shape{
    protected double radius;
    protected double height;
    
    public Cylinder (double r, double h){
        super("Cylinder");
        this.radius = r;
        this.height = h;
    }
    
    @Override
    public double area(){
        return Math.PI*getRadius()*getRadius()*getHeight();
    }
    
    @Override
    public String toString(){
        return super.toString() + " of radius " + getRadius() + " and height " + getHeight();
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
}
