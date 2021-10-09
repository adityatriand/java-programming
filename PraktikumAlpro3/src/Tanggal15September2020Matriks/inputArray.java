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
public class inputArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int banyak;
        System.out.print("Masukkan banyak data : ");
        banyak = input.nextInt();
        int arr []= new int [banyak];
        for(int i=0;i<arr.length;i++){
            System.out.print("Data ke-"+(i+1)+" = : ");
            arr[i]=input.nextInt();
        }
        System.out.print("\nData : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
