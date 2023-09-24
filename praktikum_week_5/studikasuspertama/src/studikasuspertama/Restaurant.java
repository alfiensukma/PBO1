/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studikasuspertama;

/**
 *
 * @author alfie
 */

import java.util.logging.Level;
import java.util.logging.Logger;

public class Restaurant {
    private static final Logger logger = Logger.getLogger(Restaurant.class.getName());
    private String[] namaMakanan;
    private double[] hargaMakanan;
    private int[] stok;
    private static int idMakanan = 0;

    public Restaurant () {
        namaMakanan = new String[10]; 
        hargaMakanan = new double[10];
	stok = new int[10];
    }
    
    public void tambahMenuMakanan(String nama, double harga, int stok){
        this.getNamaMakanan()[idMakanan] = nama;
        this.getHargaMakanan()[idMakanan] = harga;
        this.getStok()[idMakanan] = stok;
        nextId();
    }
    
    public void tampilMenuMakanan(){
        for (int i = 0; i < idMakanan; i++) {
            if (!isOutOfStock(i)) {
                logger.log(Level.INFO, "{0}[{1}]\tRp. {2}", 
                        new Object[]{namaMakanan[i], getStok()[i], hargaMakanan[i]});
            }
        }
    }
    
    public boolean isOutOfStock(int id){
        return getStok()[id] == 0;
    }
    
    public int hargaPesan(int harga, int jumlah){
        return harga * jumlah;
    }
    
    public void pesanMakanan(String namaMakananPesan, int jumlahPesan){
        for (int i = 0; i < idMakanan; i++) {
            if (namaMakananPesan.equals(namaMakanan[i])) {
                logger.log(Level.INFO, "Menu yang dipesan : {0} x {1}\t= Rp. {2}",
                        new Object[]{namaMakanan[i], jumlahPesan, hargaPesan((int) hargaMakanan[i], jumlahPesan)});
                stok[i]-=jumlahPesan;
            }
        }
    }

    public static void nextId(){
        idMakanan++;
    }

    /**
     * @return the namaMakanan
     */
    public String[] getNamaMakanan() {
        return namaMakanan;
    }

    /**
     * @return the hargaMakanan
     */
    public double[] getHargaMakanan() {
        return hargaMakanan;
    }

    /**
     * @return the stok
     */
    public int[] getStok() {
        return stok;
    }
}
