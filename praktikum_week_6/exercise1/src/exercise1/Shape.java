/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1;
    
/**
 *
 * @author alfie
 */
public class Shape {

    private String color;
    private boolean filled;
    
    public Shape(){
        color = "green";
        filled = true;
    }
    
    public Shape(String c, boolean f){
        color = c;
        filled = f;
    }
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the filled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * @param filled the filled to set
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public String toString() {
        return "A Shape with color of " + getColor() 
                + ", and " + (isFilled() ? "filled" : "not filled");
    }
}
