/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BelajarUTS;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class coba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        int arr [] = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]= ran.nextInt(25);
        }
        int index = 0;
        System.out.print("Masukkan nilai yang ingin dicari = ");
        int cari = input.nextInt();
        for(int i=0;i<arr.length;i++){
            if(cari == arr[i]){
                index++;
            }
        }
        int id []= new int [index];
        int in = 0;
        for(int i=0;i<arr.length;i++){
            if(cari==arr[i]){
                id[in]= i;
                in++;
            }
        }
        if(index > 0){
            System.out.print("Ketemu || Berada di index = ");
            for(int i=0;i<id.length;i++){
                if(i == (id.length-1)){
                    System.out.print(id[i]+".");
                }
                else{
                    System.out.print(id[i]+", ");
                }
            }
        }
        
        else{
            System.out.println("Tidak Ketemu || Index -1");
        }
            
        
        System.out.print("\nData = ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
//        int tabInt[] = new int [100];
//        int neff = input.nextInt();
//        for(int i=0;i<neff;i++){
//            tabInt[i]= input.nextInt();
//        }
//        for(int i=0;i<neff;i++){
//            System.out.println(tabInt[i]);
//        }
        
        
    }
}
