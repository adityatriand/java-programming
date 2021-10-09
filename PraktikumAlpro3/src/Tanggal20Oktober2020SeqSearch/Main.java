/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal20Oktober2020SeqSearch;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Main {
    public static void main(String[] args) {
        int arr[] = new int[200];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100+1);
            System.out.print(arr[i]+" ");
        }
        int min = arr[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<min)min = arr[i];
        }
        int cari = 20;
        String cek = "";
        long time = System.nanoTime();
        for(int i=0;i<arr.length;i++){
            if(cari == arr[i]){
                cek ="Ada";
                break;
            }
            else{
                cek = "Tidak Ada";
            }
        }
        long time2 = System.nanoTime();
        System.out.println("\nWaktu yang diperlukan = "+(time2-time));
        System.out.println("Penarian angka "+cari+" = "+cek);
        
    }
}
