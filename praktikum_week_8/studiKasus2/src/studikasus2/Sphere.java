/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studikasus2;

/**
 *
 * @author alfie
 */
public class Sphere extends Shape{
    protected double radius;
    
    public Sphere (double r){
        super("Sphere");
        this.radius = r;
    }
    
    @Override
    public double area(){
        return 4*Math.PI*getRadius()*getRadius();
    }
    
    @Override
    public String toString(){
        return super.toString() + " of radius " + getRadius();
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
}
