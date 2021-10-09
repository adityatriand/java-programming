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
public class AdityaTriAnanda_09021181924019 {
    
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        //no1
        System.out.println("Bilangan dari 0 -100 yang habis dibagi 7");
        System.out.println("========================================");
        for(int i=0;i<=100;i++){
            if(i%7==0){
                System.out.print(i+" ");
            }
        }
        
        //no2
        System.out.println("");
        System.out.println("\nDeteksi masukkan valid");
        System.out.println("======================");
        double angka;
        System.out.print("Masukkan range nilai (10-20) : ");
        angka = input.nextDouble();
        double cek = untilValid(angka);
        System.out.println(cek);
        
        //no3
        System.out.println("\nProgram Anak Ayam");
        System.out.println("=================");
        int banyak;
        System.out.print("n : ");
        banyak = input.nextInt();
        // memilih void karena tidak ada nilai penting yang dikembalikan, hanya menampilkan kata kata saja
        anakAyam(banyak);
        
        //no4
        int gp,status,anak = 0;
        System.out.println("\nForm Hitung Penghasilan Gaji Per Bulan");
        System.out.println("           Perusahaan XYZ             ");
        System.out.println("======================================");
        System.out.print("Masukan Gaji Anda = ");
        gp = input.nextInt();
        System.out.print("Status Anda (lajang(0)/kawin(1)) = ");
        status=input.nextInt();
        if(status==1){
            System.out.print("Jumlah Anak = ");
            anak = input.nextInt();
        }
        double hasil = hasilGaji(gp,status,anak);
        System.out.println("Total Gaji = "+hasil);
    }
    
    public static double untilValid(double a){
        
        while(a<=10 || a>20){
            System.out.print("Masukkan range nilai (10-20) : ");
            a = input.nextInt();
            return untilValid(a);
        }
        return a;
    }
    
    public static void anakAyam(int n){ 
        for(int i=n;i>0;i--){
            if(i==1){
                System.out.println("Anak ayam turunlah "+i+", mati satu maka abis");
            }
            else{
                System.out.println("Anak ayam turunlah "+i+", mati satu tinggal "+(i-1));
            }
        }
    }
    
    public static double hasilGaji(int gaji,int status, int anak){
        double pajak,gt = 0,tk; // gt untuk gaji total, tk untuk tunjangan kesehatan
        tk=gaji*0.05;
        int ta; //ta untuk tunjangan anak
        switch (status){
            case 0: if(gaji<=3000000){
                        pajak=gaji*0.05;
                    }
                    else {
                        pajak=gaji*0.1;
                    }
                    gt = gaji+tk-pajak;
                    break;
            case 1: if(gaji<=3000000){
                        pajak=gaji*0.05;
                    }
                    else {
                        pajak=gaji*0.1;
                    }
            
                    if(anak>2){
                        ta=200000;
                    }
                    else{
                        ta =anak*100000;
                    }
                    gt = gaji+ta+tk-pajak;
                    break;
            default:System.out.println("Pilihan Anda Salah. Ulangi Proses!");
        }
        return gt;
    }
}
