/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo0210117043_latihan43_gajipegawai;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class PBO0210117043_latihan43_gajipegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        gajipegawai pegawai = new gajipegawai();
        System.out.println("###Data Gaji Pegawai###");
       
        System.out.println("===========================");
        Scanner scn = new Scanner(System.in);
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
   
        System.out.print("Uang Transport:Rp.");
        pegawai.setUangtransport(scn.nextInt());
        System.out.print("Uang tunjangan: ");
        pegawai.setUangtransport(scn1.nextInt());
        System.out.print("Gaji pokok:Rp. ");
        pegawai.setGajipokok(scn.nextInt());
        System.out.println("Total Gaji: Rp.");
        
        
        
        
    }
    
}
