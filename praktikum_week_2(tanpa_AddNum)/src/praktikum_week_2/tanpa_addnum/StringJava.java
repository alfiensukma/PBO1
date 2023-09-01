/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_week_2.tanpa_addnum;

import java.util.Scanner;

/**
 *
 * @author alfien
 */
public class StringJava {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        int lenghtA = a.length();
        int lengthB = b.length();
        int sum = lenghtA + lengthB;
        System.out.println(sum);
        
        System.out.println((a.compareTo(b) > 0) ? "Yes" : "No");
        System.out.println(a.compareTo(b));
        
        System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1) + " " 
                + b.substring(0, 1).toUpperCase() + b.substring(1));
    }
}
