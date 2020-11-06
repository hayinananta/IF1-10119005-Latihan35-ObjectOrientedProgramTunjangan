/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan35.objectorientedprogramtunjangan;


/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini memunculkan tunjangan
 */
public class Tunjangan {
    private double nominal;
    private double gaji;
    private double total;
    
    private void cekStatus(String status) {
        if (status.toUpperCase().equals("MENIKAH")) {
            nominal = 0.35 * gaji;
        } else {
            nominal = 0.0;
        }
        
    } 
    
   public void hitung(double gajiAwal,String status){ 
       gaji = gajiAwal; 
       cekStatus(status);
       total = gaji + nominal;
       tampil();
   }
    private void tampil(){
        System.out.println("======Hasil Perhitungan Gaji Anda======");
        System.out.println("Gaji Pokok\t\t\t: Rp. " + gaji);
        System.out.printf("Tunjangan\t\t\t: Rp. %.1f%n", nominal);
        System.out.println("Total Gaji\t\t\t: Rp. " + total);
        System.out.println("(Developed by : Hayin Ananta)");
       
   }
}
