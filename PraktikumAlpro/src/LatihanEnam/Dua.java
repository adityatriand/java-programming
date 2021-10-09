/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanEnam;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Dua {
    public static void main(String[] args){
        int angka;
        Scanner input = new Scanner(System.in);
        System.out.print("Time = ");
        angka = input.nextInt();
        if(angka>=1 && angka<=12){System.out.println("Selamat Pagi");}
        else if(angka>=13 && angka<=17){System.out.println("Selamat Sore");}
        else if(angka>=18 && angka<=24){System.out.println("Selamat Malam");}
        else{System.out.println("Waktu Tidak Valid");}
    }
    
}
