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
public class OperasiMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris,kolom;
        System.out.print("Masukkan banyak baris : ");
        baris = input.nextInt();
        System.out.print("Masukkan banyak kolom : ");
        kolom = input.nextInt();
        int arr [][]= new int [baris][kolom];
        int arr2 [][] = new int[baris][kolom];
        
        //membuat input data
        System.out.println("\nInput Data Matriks 1");
        System.out.println("====================");
        for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++){
                System.out.print((i+1)+" , "+(j+1)+" = ");
                arr[i][j]= input.nextInt();
            }
        }
        System.out.println("\nInput Data Matriks 2");
        System.out.println("====================");
        for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++){
                System.out.print((i+1)+" , "+(j+1)+" = ");
                arr2[i][j]= input.nextInt();
            }
        }
        
        
        //membuat tampilan data seperti matriks
        System.out.println("\nMatriks 1");
        System.out.println("=========");
        view(baris,kolom,arr);
        
        System.out.println("\nMatriks 2");
        System.out.println("=========");
        view(baris, kolom, arr2);
        
//        //pertambahan matriks
//        System.out.println("\nPertambahan Matriks");
//        System.out.println("===================");
//        int hasiltambah[][] = tambahArray(baris, kolom, arr, arr2);
//        view(baris, kolom, hasiltambah);
//        
//        //pengurangan matriks
//        System.out.println("\nPengurangan Matriks");
//        System.out.println("===================");
//        int hasilkurang[][] = kurangArray(baris, kolom, arr, arr2);
//        view(baris, kolom, hasilkurang);
//            
//        //perkalian matriks
//        System.out.println("\nPerkalian Matriks");
//        System.out.println("===================");
//        int hasilkali[][] = kaliArray(baris, kolom, arr, arr2);
//        view(baris, kolom, hasilkali);
        
//        //Transpose Maatriks 1
//        System.out.println("\nTranspose Matriks 1");
//        System.out.println("===================");
//        transpose(baris,kolom,arr);
//        
//        //Transpose Maatriks 2
//        System.out.println("\nTranspose Matriks 2");
//        System.out.println("===================");
//        transpose(baris,kolom,arr2);
        
        //Determinan Matriks 1
        System.out.println("\nDeterminan Matriks 1");
        System.out.println("====================");
        detArray(arr);
        
        //Determinan Matriks 2
        System.out.println("\nDeterminan Matriks 2");
        System.out.println("====================");
        detArray(arr2);
        
    }
    
    public static void view(int bar, int kol,int a[][]){
        for(int i=0;i<bar;i++){
            for(int j=0;j<kol;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println("");
        }
    }
    
    public static void transpose(int bar, int kol,int a[][]){
        int bar2 = kol;
        int kol2 = bar;
        for(int i=0;i<bar2;i++){
            for(int j=0;j<kol2;j++){
                System.out.print(a[j][i]+"  ");
            }
            System.out.println("");
        }
    }
    
    public static int [][] tambahArray(int bar, int kol,int a[][], int b[][]){
        int [][]temp = new int[bar][kol];
        for(int i=0;i<bar;i++){
            for(int j=0;j<kol;j++){
                temp[i][j]=a[i][j]+b[i][j];
            }
        }
        return temp;
    }
    
    public static int [][] kurangArray(int bar, int kol,int a[][], int b[][]){
        int [][]temp = new int[bar][kol];
        for(int i=0;i<bar;i++){
            for(int j=0;j<kol;j++){
                temp[i][j]=a[i][j]-b[i][j];
            }
        }
        return temp;
    }
    
    public static int [][] kaliArray(int bar, int kol, int a[][], int b[][]){
        int [][]temp = new int [bar][kol];
        for(int i=0;i<bar;i++){
            for (int j=0;j<bar;j++) {
                int jum =0;
                for(int k=0;k<kol;k++){
                    jum += a[i][k]*b[k][j];
                    temp[i][j] = jum;
                }
            }
        }
        return temp;
    }
    
    public static double detArray(int a[][]){
        //ini merupakan pencari determinan
        double det=0;
        if(a.length != a[0].length){
            System.out.println("Matriks bukan matriks persegi");
        }
        else{
            if(a.length==2){
                det = a[0][0]*a[1][1]- a[0][1]*a[1][0];
                System.out.println("Determinannya = "+det);
            }
            else{
                System.out.println("Pencarian hanya bisa untuk matriks orde 2x2");
                System.out.println("Sistem dalam tahap pengembangan");
            }
        }
        return det;
    }
}
