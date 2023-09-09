/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_week_3;

import java.util.Scanner;

/**
 *
 * @author alfie
 */
public class bukaTutupJalan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String platNumber = sc.nextLine();
        String[] platNumberPisah = platNumber.split(" ");
        String platNumberGabung = "";
        for (String temp : platNumberPisah) {
            platNumberGabung += temp;
        }
        
        double number = Double.parseDouble(platNumberGabung);
        if ((number - 999999) % 5 != 0) {
            System.out.println("berhenti");
        }else{
            System.out.println("jalan");
        }
    }
}
