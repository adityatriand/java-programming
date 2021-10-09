/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perulangan;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class cekKondisi {
    
    public static Scanner input = new Scanner(System.in);
    
    public static int inputAngka(){
        int angka;
        System.out.print("\nMasukkan angka : ");
        angka = input.nextInt();
        return angka;
    }
    
    public static void cekGanjil(){
        int angka = inputAngka();
        while(angka%2==1){
            System.out.println("Anda memasukkan angka ganjil");
            System.out.print("\nMasukkan angka : ");
            angka = input.nextInt();
        }
        System.out.println("Anda memasukkan angka genap dan program berhenti");
    }
    
    public static void cekGenap(){
        int angka = inputAngka();
        while(angka%2==0){
            System.out.println("Anda memasukkan angka genap");
            System.out.print("\nMasukkan angka : ");
            angka = input.nextInt();
        }
        System.out.println("Anda memasukkan angka ganjil dan program berhenti");
    }
    
    public static void main(String[] args) {
        int cek;
        do{
            System.out.println("\nCEK ANGKA");
            System.out.println("=========");
            System.out.println("1. Ganjil");
            System.out.println("2. Genap"); 
            System.out.print("\nMasukkan pilihan anda : ");
            cek = input.nextInt();
        }while(cek>2);
        
        if(cek==1){
            cekGanjil();
        }
        else{;
            cekGenap();
        }
    }
}
