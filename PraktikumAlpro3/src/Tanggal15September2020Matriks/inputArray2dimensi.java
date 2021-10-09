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
public class inputArray2dimensi {
    public static void main(String[] args) {
        // membuat deskripsi data
        Scanner input = new Scanner(System.in);
        int baris,kolom;
        System.out.print("Masukkan banyak baris : ");
        baris = input.nextInt();
        System.out.print("Masukkan banyak kolom : ");
        kolom = input.nextInt();
        int arr [][]= new int [baris][kolom];
        System.out.println("\nInput Data");
        System.out.println("==========");
        //membuat input data
        for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++){
                System.out.print("Data pada baris "+(i+1)+" kolom "+(j+1)+" = ");
                arr[i][j]= input.nextInt();
            }
        }
        
        //membuat tampilan data
        System.out.println("\nRincian Data");
        System.out.println("============");
        for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++){
                System.out.println((i+1)+" , "+(j+1)+" = "+arr[i][j]);
            }
        }
        
        //membuat tampilan data seperti matriks
        System.out.println("\nBentuk Matriks");
        System.out.println("==============");
        for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println("");
        }
    }
    
}
