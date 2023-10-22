/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise3;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author alfie
 */
interface Sortable{ 
    public int compare(Sortable b);
}

public class Manager extends Employee implements Sortable{
    
    public Manager (String n, double s, int d, int m, int y){
        super(n, s, d, m, y);
        secretaryName = "";
    }
    
    public void raiseSalary(double byPercent){
        // add 1/2% bonus for every year of service
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }
    
    public String getSecretaryName(){
        return secretaryName;
    }
    
    private String secretaryName;
    
    @Override
    public int compare(Sortable b){
        Manager eb = (Manager) b;
        if (getSalary()<eb.getSalary()) return -1;
        if (getSalary()>eb.getSalary() )return +1;
        return 0;
    }
    
     public static void shell_sort(Sortable[] a){
    //Shell sort body
    }
}
