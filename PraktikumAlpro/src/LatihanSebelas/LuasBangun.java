/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanSebelas;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class LuasBangun {
    static void LuasSegitiga(int alas,int tinggi){
        float L_Segitiga =(float)(alas*tinggi)/2;
        System.out.println("Alas = "+alas);
        System.out.println("Tinggi = "+tinggi);
        System.out.println("Luas = "+L_Segitiga);
    }

    static void LuasPersegi(int sisi){
        int L_Persegi = (int)Math.pow(sisi,2);
        System.out.println("Sisi = "+sisi);
        System.out.println("Luas = "+L_Persegi);
    }

    static void LuasLingkaran(float phi,int jarijari){
        float L_Lingkaran = (float)(phi * Math.pow(jarijari, 2));
        System.out.println("Jari-Jari = "+jarijari);
        System.out.println("Luas = "+L_Lingkaran);
    }

    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        int alas,tinggi,sisi,jarijari;
        final float phi = 3.14f;
        //Luas Segitiga
        System.out.println("Luas Segitiga");
        System.out.print("Masukkan Nilai Alas = ");
        alas = input.nextInt();
        System.out.print("Masukkan Nilai Tinggi = ");
        tinggi = input.nextInt();
        System.out.println("==========================");
        LuasSegitiga(alas,tinggi);
        //Luas Persegi
        System.out.println("\nLuas Persegi");
        System.out.print("Masukkan Nilai Sisi = ");
        sisi = input.nextInt();
        System.out.println("========================");
        LuasPersegi(sisi);
        //Luas Lingkaran
        System.out.println("\nLuas Lingkaran");
        System.out.print("Masukkan Nilai Jari-Jari = ");
        jarijari = input.nextInt();
        System.out.println("=============================");
        LuasLingkaran(phi,jarijari);
    }
    
}
