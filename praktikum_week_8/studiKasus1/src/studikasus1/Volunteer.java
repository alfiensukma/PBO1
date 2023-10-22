/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studikasus1;

/**
 *
 * @author alfie
 */
public class Volunteer extends StaffMember{
    //sets up volunteer using the specified information
    public Volunteer (String eName, String eAddress, String ePhone)
    {
        super (eName, eAddress, ePhone);
    }
    
    //returns a zero pay value for this volunteer
    @Override
    public double pay()
    {
        return 0.0;
    }
}
