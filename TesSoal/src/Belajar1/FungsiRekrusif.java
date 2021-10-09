/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Belajar1;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class FungsiRekrusif {
    static Scanner input = new Scanner(System.in);
    public static void main(String[]args){
        System.out.print("Masukkan tinggi bola = ");
        int tinggi = input.nextInt();
        Pantul(tinggi);
        System.out.println("tinggi 0, tidak mantul");
        
        System.out.print("\nMasukkan banyak nilai = ");
        int banyak = input.nextInt();
        int jumlah = Deret(banyak);
        System.out.println("Banyak nilai 1-"+banyak+" adalah "+jumlah);
        
        System.out.print("\nMasukkan nilai faktorial = ");
        int nilai = input.nextInt();
        int faktor = Faktorial(nilai);
        System.out.println("Faktorial dari "+nilai+" adalah "+faktor);
    }
    
    static void Pantul(int n){
        if(n>=1){
            System.out.println("tinggi "+n+", mantul turun menjadi "+(n-1));
            Pantul(--n);
        }
    }
    
    static int Deret(int nilai){
        if(nilai==0){
            return nilai;
        }
        return nilai + Deret(nilai-1);
    }
    
    static int Faktorial(int nilai){
        if(nilai==1){
            return nilai;
        }
        return nilai *Faktorial(--nilai);
    }
}
