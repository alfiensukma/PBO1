/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1;

/**
 *
 * @author alfie
 */
public class Rectangle extends Shape{
    private double width;
    private double length;
    
    public Rectangle(){
        super();
        width = 1.0;
        length = 1.0;
    }
    
    public Rectangle(double w, double l){
        super();
        width = w;
        length = l;
    }
    
    public Rectangle(double w, double l, String c, boolean f){
        super(c,f);
        width = w;
        length = l;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea(){
        return getLength() * getWidth();
    }
    
    public double getPerimeter(){
        return 2*(getLength() + getWidth());
    }
    
    @Override
    public String toString(){
        return "A Rectangle with width = " + getWidth() 
                + " and length = " + getLength() 
                + " which is a subclass of " + super.toString();
    }
}
