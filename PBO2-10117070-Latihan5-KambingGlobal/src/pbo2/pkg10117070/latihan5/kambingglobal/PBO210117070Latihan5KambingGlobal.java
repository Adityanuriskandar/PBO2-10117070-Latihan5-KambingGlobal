/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan5.kambingglobal;

/**
 *
 * @author Aditya
 * NAMA     : Aditya Nur Iskandar
 * KELAS    : PBO2/IF2
 * NIM      : 10117070
 * Deskripsi Program : Program ini berisi program untuk mengetahui variabel 
 * instance yang bersifat global.
 */
public class PBO210117070Latihan5KambingGlobal {
//Variabel jumlahkambing menjadi variabel instance
int jumlahKambing = 88;
//Method untuk menampilkan jumlah kambing
public void getJumlahKambing() {
    System.out.println("Jumlah Kambing: " + jumlahKambing);
}
public void tambahKambing() {
    jumlahKambing = jumlahKambing + 5;
    System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PBO210117070Latihan5KambingGlobal kambingSusu = 
                new PBO210117070Latihan5KambingGlobal();
        
        // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        //Menambah satu kambing
        kambingSusu.tambahKambing();
        
        //menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
        
    }
    
}
