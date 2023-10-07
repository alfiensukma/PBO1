/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1;

/**
 *
 * @author alfie
 */
public class TestShape {
    public static void main(String[] args) {
        Shape s = new Shape();
        Circle c = new Circle(7);
        Rectangle r = new Rectangle(2,4);
        Square sq = new Square(2);
        
        System.out.println("1. Shape");
        System.out.println("color = " + s.getColor());
        System.out.println("filled = " + s.isFilled());
        System.out.println("string = " + s.toString());
        System.out.println("2. Circle");
        System.out.println("radius = " + c.getRadius());
        System.out.println("area = " + c.getArea());
        System.out.println("perimeter = " + c.getPerimeter());
        System.out.println("string = " + c.toString());
        System.out.println("3. Rectangle");
        System.out.println("width = " + r.getWidth());
        System.out.println("Length = " + r.getLength());
        System.out.println("area = " + r.getArea());
        System.out.println("perimeter = " + r.getPerimeter());
        System.out.println("string = " + r.toString());
        System.out.println("4. Square");
        System.out.println("side = " + sq.getSide());
        System.out.println("area = " + sq.getArea());
        System.out.println("perimeter = " + sq.getPerimeter());
        System.out.println("string = " + sq.toString());
    }
}
