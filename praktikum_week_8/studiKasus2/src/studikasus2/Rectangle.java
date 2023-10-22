/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studikasus2;

/**
 *
 * @author alfie
 */
public class Rectangle extends Shape{
    protected double length;
    protected double width;
    
    public Rectangle (double l, double w){
        super("Rectangle");
        this.length = l;
        this.width = w;
    }
    
    @Override
    public double area(){
        return getLength()*getWidth();
    }
    
    @Override
    public String toString(){
        return super.toString() + " of length " + getLength() + " and width " + getWidth();
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
}
