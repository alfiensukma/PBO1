/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studikasuskedua;

/**
 *
 * @author alfie
 */
public class Produk {
    private String[] namaProduk;
    private double[] hargaProduk;
    private int[] idProduk;
    private static int iterasi = 0;
    
    public Produk() {
        namaProduk = new String[100]; 
        hargaProduk = new double[100];
        idProduk = new int[100];
    }
    
    public void tambahMenuMakanan(String nama, double harga){
        this.getNamaProduk()[iterasi] = nama;
        this.getHargaProduk()[iterasi] = harga;
        this.getIdProduk()[iterasi] = iterasi;
        nextId();
    }
    
    public static void nextId(){
        iterasi++;
    }
    
    public void tampilMenuMakanan(){
        int id = 0;
        System.out.println("Daftar Menu Makanan");
        System.out.println("---------------------------");
        for (int i = 0; i < iterasi; i++) {
                System.out.printf("%-2d. %-15s = Rp. %.1f\n", i+1, getNamaProduk()[i], getHargaProduk()[i]);
                id = i + 1;    
        }
        System.out.print("Pilih Menu [1-" + id + "] = ");
        
    }
    
    public int hargaPesan(int harga, int jumlah){
        return harga * jumlah;
    }
    
    public void getPesanan(int input, int jumlah){
        boolean cari = false;
        System.out.println("---------------------------------");
        for (int i = 0; i < iterasi; i++) {
            if (input == getIdProduk()[i]) {
                System.out.printf("%-15s [Rp. %.1f] x %d = %.1f\n", 
                        getNamaProduk()[i-1], getHargaProduk()[i-1], jumlah, getHargaProduk()[i-1] * jumlah);
                cari = true;
            }
        }
        if(!cari){
            System.out.println("Menu tidak ditemukan!");
        }
        System.out.println("---------------------------------");
    }  

    /**
     * @return the namaProduk
     */
    public String[] getNamaProduk() {
        return namaProduk;
    }

    /**
     * @param namaProduk the namaProduk to set
     */
    public void setNamaProduk(String[] namaProduk) {
        this.namaProduk = namaProduk;
    }

    /**
     * @return the hargaProduk
     */
    public double[] getHargaProduk() {
        return hargaProduk;
    }

    /**
     * @param hargaProduk the hargaProduk to set
     */
    public void setHargaProduk(double[] hargaProduk) {
        this.hargaProduk = hargaProduk;
    }

    /**
     * @return the idProduk
     */
    public int[] getIdProduk() {
        return idProduk;
    }

    /**
     * @param idProduk the idProduk to set
     */
    public void setIdProduk(int[] idProduk) {
        this.idProduk = idProduk;
    }

}
