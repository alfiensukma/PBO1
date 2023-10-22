/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studikasus1;

/**
 *
 * @author alfie
 */
public class Executive extends Employee{
    private double bonus;
    
    //sets up an executive with the specified information
    public Executive (String eName, String eAddress, String ePhone, String socSecNumber, double rate)
    {
        super (eName, eAddress, ePhone, socSecNumber, rate);
        bonus = 0; //bonus has yet to be awarded
    }
    
    //awards the specified bonus to this executive
    public void awardBonus(double execBonus)
    {
        bonus = execBonus;
    }
    
    //computes and returns the pay for an executive, which is the
    //regular employee payment plus a one-time bonus
    @Override
    public double pay()
    {
        double payment = super.pay() + bonus;
        bonus = 0;
        
        return payment;
    }
}
