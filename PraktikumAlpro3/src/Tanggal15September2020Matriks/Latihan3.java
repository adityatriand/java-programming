/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal15September2020Matriks;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Latihan3 {
    public static void main(String[] args) {
        int array [] = new int [10];
        Scanner input = new Scanner(System.in);
        
        for(int i=0;i<array.length;i++){
            array[i]= (int)(Math.random()*100);
        }
        
        System.out.print("\nData : ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        
        //tidak pakai penampung
        System.out.print("\nData yang lebih dari 50 : ");
        for(int i=0;i<array.length;i++){
            if(array[i]>50){
                System.out.print(array[i]+" ");
            }
        }
        
        //pakai penampung
        int tampung[],banyak=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>50){
                banyak++;
            }
        }
        
        tampung = new int [banyak];
        int j =0;
        
        for(int i=0;i<array.length;i++){
            if(array[i]>50)
            {
                tampung[j]= array[i];
                j++;
            }
        }
        
        System.out.print("\nData yang lebih dari 50 : ");
        for(int i=0;i<tampung.length;i++){
            System.out.print(tampung[i]+" ");
        }
    }
    
}
