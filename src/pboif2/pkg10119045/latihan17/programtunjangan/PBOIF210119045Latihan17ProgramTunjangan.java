/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119045.latihan17.programtunjangan;
import java.util.Scanner;
/**
 *
 * @author Legion
 * NAMA                 : Fahma Maulana
 * KELAS                : PBOIF2
 * NIM                  : 10119045
 * Deskripsi Program    : Program Tunjangan
 */
public class PBOIF210119045Latihan17ProgramTunjangan {

public static double inputUserGaji() {
        Scanner scanner = new Scanner(System.in);
        /** mendapatkan gaji pokok user */
       System.out.print("Berapa gaji pokok anda perbulan?: ");
       double gajiPokok = scanner.nextInt();
       return gajiPokok;
    } 
    
    public static String inputUserStatus() {
        Scanner scanner = new Scanner(System.in);
        /** mendapatkan status user */
       System.out.print("Status anda? (Menikah/Belum): ");
       String status = scanner.nextLine();
       return status;
    } 
    
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("===== Program Tunjangan =====");
           double gajiPokok = inputUserGaji();
       String status = inputUserStatus();
           double tunjangan,gajiTotal;
       
       /** menghitung tunjangan */
       if (status.equals("Menikah")) {
           tunjangan = 0.35 * gajiPokok;
        } else {
            tunjangan = 0;
       }
       
       /** menghitung gaji total */
       gajiTotal=tunjangan + gajiPokok;
       
            System.out.println("===== Hasil Perhitungan Gaji Anda =====");
            System.out.println("Gaji Pokok\t:" + gajiPokok);
            System.out.println("Tunjangan\t:" + tunjangan);
            System.out.println("Gaji Total\t:" + gajiTotal);
       System.out.println("-----------------------------");
       System.out.println("Developed bye : Fahma Maulana"); 
    }
}