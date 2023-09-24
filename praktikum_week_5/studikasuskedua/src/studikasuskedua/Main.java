/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studikasuskedua;

import java.io.BufferedReader;
import java.util.Scanner;

/**
 *
 * @author alfie
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char cobaLagi;      
        Produk menu = new Produk();
        do{     
            menu.tambahMenuMakanan("Batagor",5000);
            menu.tambahMenuMakanan("Roti Bakar",12000);
            menu.tambahMenuMakanan("Indomie-Telor",10000);
            menu.tambahMenuMakanan("Kwetiaw",12000);
            menu.tambahMenuMakanan("Nasi Goreng",12000);
            menu.tambahMenuMakanan("Air Mineral",3000);
            menu.tambahMenuMakanan("Teh Manis",4000);
            menu.tambahMenuMakanan("Jus Alpukat",8000);
            menu.tambahMenuMakanan("Teh Botol",5000);
            menu.tambahMenuMakanan("Kopi",3000);
            menu.tambahMenuMakanan("Susu",500);
            menu.tampilMenuMakanan();

            int pilihMenu = input.nextInt();
            System.out.print("Masukkan jumlah pesanan = ");
            int jumlah = input.nextInt();
            menu.getPesanan(pilihMenu, jumlah);
            
            System.out.print("Coba Lagi: ");
            cobaLagi = input.next().charAt(0);
            input.nextLine();
        }while(cobaLagi == 'Y' || cobaLagi == 'y');
    }
}
