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
public class dataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int a=1; a<=6; a++){
            try{
                System.out.print("Masukkan Nilai : ");
                long input = sc.nextLong();
                System.out.println(input+" can be fitted in: ");
                if(input >= Byte.MIN_VALUE && input <=Byte.MAX_VALUE){
                    System.out.println("* byte");
                }
                if(input >= Short.MIN_VALUE && input <=Short.MAX_VALUE){
                    System.out.println("* short");
                }
                if(input >= Integer.MIN_VALUE && input <=Integer.MAX_VALUE){
                    System.out.println("* integer");
                }
                if(input >= Long.MIN_VALUE && input <=Long.MAX_VALUE){
                    System.out.println("* long");
                }
            }catch(Exception e){
                System.out.println(sc.next()+" can't be fitted anywhere");
            }
        }
    }
}
