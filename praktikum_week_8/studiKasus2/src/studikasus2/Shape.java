/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studikasus2;

/**
 *
 * @author alfie
 */
abstract public class Shape {
    protected String shapeName;
    
    public Shape(String name) {
        this.shapeName = name;
    }
    
    public abstract double area();
    
    public String toString(){
        String name = "Name of the shape : " + getShapeName();
        return name;
    }

    /**
     * @return the shapeName
     */
    public String getShapeName() {
        return shapeName;
    }

    /**
     * @param shapeName the shapeName to set
     */
    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
}
