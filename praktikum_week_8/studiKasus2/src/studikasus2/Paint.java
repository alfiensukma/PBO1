/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studikasus2;

/**
 *
 * @author alfie
 */
public class Paint {
    protected double coverage;
    
    public Paint(double c){
        this.coverage = c;
    }
    
    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        return s.area() / getCoverage();
}

    /**
     * @return the coverage
     */
    public double getCoverage() {
        return coverage;
    }

    /**
     * @param coverage the coverage to set
     */
    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }
}
