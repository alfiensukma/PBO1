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
public class inputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        String[] words = input.split("[ !,?._'@]+");
        int numWords  =  words.length;
        System.out.println(numWords);
        for (String a : words){
           System.out.println(a);
        }
    }
}
