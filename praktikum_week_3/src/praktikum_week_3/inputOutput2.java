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
public class inputOutput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kata[] = new String[3];
        int angka[] = new int[3];
        
        for (int i = 0; i < 3; i++) {
            String input_line = sc.nextLine();
            String[] parts = input_line.split(" ");
            kata[i] = parts[0];
            angka[i] = Integer.parseInt(parts[1]);
        }
        
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s", kata[i]);
            System.out.printf("%03d%n", angka[i]);
        }
        System.out.println("================================");
    }

}
