/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASoalPertama;
import java.util.Scanner;
/**
 *
 * @author Adit
 */
public class SatuScan {
    public static void main(String[] args){
        //Library
        float P,L,luas;
        Scanner keyboard = new Scanner(System.in);
        //Outputnya
        System.out.print("Masukan Panjang Persegi Panjang  = ");
        P=keyboard.nextFloat();
        System.out.print("Masukan Lebar Persegi Panjang    = ");
        L=keyboard.nextFloat();
        System.out.println("=====================================");
        luas = P*L;
        System.out.println("Panjang Persegi Panjang = "+P+" Cm");
        System.out.println("Lebar Persegi Panjang   = "+L+" Cm");
        System.out.println("Luas Persegi Panjangnya adalah = "+luas+" Cm");    
    }   
}
