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
public class latihanArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pjgArray, array[];
        int sum = 0;
        
        System.out.print("Masukkan panjang array = ");
        pjgArray = input.nextInt();
        
        array = new int [pjgArray];
        
        for (int i = 0; i < array.length; i++) {
            array[i]= (int)(Math.random()*10);
            
        }
        
        System.out.println("");
        
        System.out.print("Data : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        
        System.out.println("");
        
        int nilaiMax = array[0];
        int nilaiMin = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>nilaiMax){
                nilaiMax = array[i];
            }
            
            if(array[i]<nilaiMin){
                nilaiMin = array[i];
            }
        }
        
        System.out.println("Ini nilai maximum : "+nilaiMax);
        System.out.println("Ini nilai minimum : "+nilaiMin);
        
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        
        System.out.println("Jumlah nilai : "+sum);
        double rata = (double) sum/array.length;
        System.out.println("Rata - Rata = "+rata);
    }
}
