/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan35.objectorientedprogramtunjangan;

import java.util.Scanner;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini memunculkan tunjangan
 */
public class IF110119005Latihan35ObjectOrientedProgramTunjangan {
    private static double gajiAwal;
    static Scanner scanner = new Scanner (System.in);
    private static String status;
    private static void inputTunjangan(){
              
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        gajiAwal = scanner.nextDouble();
        System.out.print("Status Anda?(Menikah/Belum)\t: ");
        status = scanner.next();
    }
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tunjangan tunjangan = new Tunjangan();
        inputTunjangan();
        tunjangan.hitung(gajiAwal, status);
        
    }
    
}
