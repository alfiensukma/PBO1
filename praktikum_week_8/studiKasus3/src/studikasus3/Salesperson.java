/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studikasus3;

/**
 *
 * @author alfie
 */
public class Salesperson implements Comparable<Salesperson>{
    protected String firstName;
    protected String lastName;
    protected int totalSales;
    
    public Salesperson (String first, String last, int sales){
        this.firstName = first;
        this.lastName = last;
        this.totalSales = sales;
    }
    
    public String toString(){
        return getLastName() + ", " + getFirstName() + ": \t" + getTotalSales();
    }
    
    public boolean equals(Object other){
        return (getLastName().equals(((Salesperson)other).getLastName()) &&
                getFirstName().equals(((Salesperson)other).getFirstName()));
    }
    
    
    @Override
    public int compareTo(Salesperson other){
        int salesCompare = Integer.compare(this.totalSales, other.getTotalSales());
        return (salesCompare == 0) 
                ? this.lastName.compareTo(other.getLastName()) : salesCompare;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the totalSales
     */
    public int getTotalSales() {
        return totalSales;
    }

    /**
     * @param totalSales the totalSales to set
     */
    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }
}
