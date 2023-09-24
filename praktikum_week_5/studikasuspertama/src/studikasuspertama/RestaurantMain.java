/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studikasuspertama;

/**
 *
 * @author alfie
 */
public class RestaurantMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        menu.tampilMenuMakanan();
        menu.pesanMakanan("Bala-Bala", 7);
        menu.pesanMakanan("Molen", 17);
        menu.tampilMenuMakanan();
    }
    
}
