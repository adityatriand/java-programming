/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pert9;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Bulan {
    public static void main(String[] args){
        String namabulan[] = {"","Januari","Februrari","Maret","April","Mei",
            "Juni","Juli","Agustus","September","Oktober","November","Desember"};
        Scanner masuk = new Scanner(System.in);
        System.out.println("NAMA BULAN");
        System.out.println("==========");
        System.out.print("Kode Bulan (1..12) = ");
        int kodebulan=masuk.nextInt();
        System.out.println("Bulan = "+namabulan[kodebulan]);
        
    }
}
