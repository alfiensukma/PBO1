/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studikasus1;

/**
 *
 * @author alfie
 */
public class Employee extends StaffMember{
    protected String socialSecurityNumber;
    protected double payRate;
    
    //sets up an employee with the specified information
    public Employee (String eName, String eAddress, String ePhone, String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone);
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }
    
    //return information about an employee as a String
    @Override
    public String toString()
    {
        String result = super.toString();
        result += "\nSocial Security Number: " + socialSecurityNumber;
        return result;
    }
    
    //return the  pay rate this employee
    @Override
    public double pay()
    {
        return payRate;
    }
}
