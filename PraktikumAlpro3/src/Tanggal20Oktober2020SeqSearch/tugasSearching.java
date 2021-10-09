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
public class tugasSearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[200];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100+1);
            System.out.print(arr[i]+" ");
        }
        
        int min = arr[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<min)min = arr[i];
        }
        
        int cari;
        System.out.print("\nAngka yang dicari = ");
        cari = input.nextInt();
        
        boolean cek = false;
        int j = 0;
        
        //FOR
        long start, stop, time;
        
        start = System.nanoTime();
        for(int i=0;i<arr.length;i++){
            if(cari==arr[i]){
                cek = true;
                j++;
            }
        }
        stop = System.nanoTime();
        
        if(cek){
            System.out.println("\nAda");
        }
        else{
            System.out.println("\nTidak Ada");
        }
        
        System.out.println("Banyak kemunculan = "+j);
        time = stop - start;
        System.out.println("Waktu yang diperlukan = "+time);
        
        //WHILE
        int i = 0;
        start = System.nanoTime();
        while(!cek && i<arr.length){
            if(cari == arr[i]){
                cek = true;
                j++;
            }
            i++;
        }
        stop = System.nanoTime();
        
        if(cek){
            System.out.println("\nAda");
        }
        else{
            System.out.println("\nTidak Ada");
        }
        
        System.out.println("Banyak Kemunculan = "+j);
        time = stop - start;
        System.out.println("Waktu yang diperlukan = "+time);
        
        //Keberadaan indexnya
        int index[] = new int [j];
        int l = 0;
        for(int k=0;k<arr.length;k++){
            if(cari == arr[k]){
                index[l] = k;
                l++;
            }
        }
        if(j!=0){
            System.out.print("\nIndexnya Berada di = ");
            for(int k=0;k<index.length;k++){
                System.out.print(index[k]+" ");
            }
        }
    }
}
