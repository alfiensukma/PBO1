/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_week_3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author alfie
 */
public class BigNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String angkaSatu = sc.nextLine();
        String angkaDua = sc.nextLine();
        BigInteger bigAngkaSatu = new BigInteger(angkaSatu);
        BigInteger bigAngkaDua = new BigInteger(angkaDua);
        System.out.println(bigAngkaSatu.add(bigAngkaDua));
        System.out.println(bigAngkaSatu.multiply(bigAngkaDua));
    }
}
