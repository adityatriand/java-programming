/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal8September2020Method;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class prosedurFungsi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        double P,L;
//        System.out.print("P : ");
//        P = input.nextDouble();
//        System.out.print("L : ");
//        L = input.nextDouble();
//        prosedurLuas(P,L);
//        double luas = fungsiLuas(P,L);
//        System.out.println("Luas : "+luas);
        
//        double angka;
//        System.out.print("Masukkan range nilai (0-100) : ");
//        angka = input.nextDouble();
//        double cek = inputValid(angka);
//        System.out.println(cek);
//        indexRange(cek);
        
//        int angka,pangkat;
//        System.out.print("Masukkan angka : ");
//        angka = input.nextInt();
//        System.out.print("Masukkan pangkat : ");
//        pangkat = input.nextInt();
//        int hasil = pangkat(angka,pangkat);
//        System.out.println(angka+" pangkat "+pangkat+" = "+hasil);
        
          int angka;
          System.out.print("Masukkan angka : ");
          angka = input.nextInt();
          int hasil = faktorial(angka);
          System.out.println("faktorial dari "+angka+" = "+hasil);
          int hasil2 = faktorialRekursif(angka);
          System.out.println("Menggunakan rekursif = "+hasil2);
    }
    
    public static void prosedurLuas(double P, double L){
        double luas = P*L;
        System.out.println("Luas : "+luas);
    }
    
    public static double fungsiLuas(double p, double l){
        double luas = p*l;
        return luas;
    }
    
    public static double inputValid(double cek){
        Scanner input = new Scanner(System.in);
        while(cek<0 || cek>100){
            System.out.print("Masukkan range nilai (0-100) : ");
            cek = input.nextInt();
            return inputValid(cek);
        }
        return cek;
    }
    
    public static void indexRange(double nilai){
        if(nilai>=86 && nilai<=100){
            System.out.println("A");
        }
        else if(nilai>=71 && nilai<86){
            System.out.println("B");
        }
        else if(nilai>=56 && nilai<71){
            System.out.println("C");
        }
        else if(nilai>=41 && nilai<56){
            System.out.println("D");
        }
        else{
            System.out.println("E");
        }
    }
    
    public static int pangkat(int a, int b){
        int jum=1;
        for(int i=1; i<=b ;i++){
            jum*=a;
        }
        return jum;
    }
    
    public static int faktorial(int a){
        int jumlah = 1;
        for(int i=a;i>0;i--){
            jumlah*=a;
            a--;
        }
        return jumlah;
    }
    
    public static int faktorialRekursif(int a){
        if(a==0||a==1){
            return 1;
        }
        else{
            return a*faktorialRekursif(a-1);
        }
    }
}
