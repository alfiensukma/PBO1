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
public class gajiAgent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bonus = 0;
        double potongan = 0;
        
        int itemJual = sc.nextInt();
        double totalJual = itemJual * 50000;
        
        if (itemJual >= 80) {
            bonus = 0.35 * totalJual;
        }else if (itemJual >= 40) {
            bonus = 0.25 * totalJual;
        }else if (itemJual >=15) {
            bonus = 0.10 * totalJual;
        }else{
            potongan = (15 * 50000 - totalJual) * 0.15;
        }
 
        double gaji = 500000 + bonus - potongan;
        System.out.println(gaji);
    }
}
