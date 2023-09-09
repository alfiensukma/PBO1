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
public class berhitung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka[] = new int[2];
        int hasil = 0;
        
        String input = sc.nextLine();
        String[] parts = input.split(" ");
        angka[0] = Integer.parseInt(parts[0]);
        angka[1] = Integer.parseInt(parts[2]);
        
        switch (parts[1]){
            case "+" -> hasil = angka[0] + angka [1];
            case "-" -> hasil = angka[0] - angka [1];
            case "*" -> hasil = angka[0] * angka [1];
            case "/" -> hasil = angka[0] / angka [1];
            case "%" -> hasil = angka[0] % angka [1];
            default -> System.out.println("Invalid Operator");
        }
        System.out.println(hasil);     
    }
}
