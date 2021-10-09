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
public class sequentialSearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[200];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100+1);
            System.out.print(arr[i]+" ");
        }
        int cari;
        System.out.print("\nAngka yang dicari = ");
        cari = input.nextInt();
        boolean cek = false;
        int index = -1;
        //for
        long start, stop, time;
        start = System.nanoTime();
        for(int i=0;i<arr.length;i++){
            if(cari==arr[i]){
                cek = true;
                index = i;
            }
        }
        stop = System.nanoTime();
        time = stop - start;
        if(cek){
            System.out.println("\nAda");
        }
        else{
            System.out.println("\nTidak Ada");
        }
        System.out.println("Index pertama ketemu di = "+index);
        System.out.println("Waktu yang diperlukan = "+time);
        
        //while
        int i = 0;
        start = System.nanoTime();
        while(!cek && i<arr.length){
            if(cari == arr[i]){
                cek = true;
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
        System.out.println("Index pertama ketemu di = ");
        time = stop - start;
        System.out.println("Waktu yang diperlukan = "+time);
    }
}
