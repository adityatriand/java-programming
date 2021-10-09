/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BelajarUas;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Perkondisian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("No 1");
        System.out.println("====");
        int minute,sec;
        System.out.print("Menit : ");
        minute = input.nextInt();
        System.out.print("Detik : ");
        sec = input.nextInt();
        int konversi = (minute*60)+sec;
        System.out.println("Jumlah ke detik = "+konversi);
        System.out.println("No 2");
        System.out.println("====");
        double total;
        int umur;
        char kartu;
        double diskon = 0;
        System.out.print("Total Belanja = ");
        total = input.nextDouble();
        System.out.print("Umur Anda = ");
        umur = input.nextInt();
        System.out.print("Punya kartu membership (y/n) ? ");
        kartu = input.next().charAt(0);
        if(kartu == 'y'){
            diskon = total*0.1;
            if(umur<30){
                diskon = diskon+((total-diskon)*0.1);
            }
            else if(umur>=30 && umur<60){
                diskon = diskon+((total-diskon)*0.2);
            }
            else{
                diskon = diskon+((total-diskon)*0.3);
            }
        }
        else if(kartu=='n'){
            if(umur<30){
                diskon = diskon+((total-diskon)*0.1);
            }
            else if(umur>=30 && umur<60){
                diskon = diskon+((total-diskon)*0.2);
            }
            else{
                diskon = diskon+((total-diskon)*0.3);
            }
        }
        else{
            System.out.println("Masukkan Salah");
        }
        System.out.println("Yang harus dibayar = "+(total-diskon));
    }
}
