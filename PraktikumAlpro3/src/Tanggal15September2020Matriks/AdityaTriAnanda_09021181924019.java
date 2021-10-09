/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal15September2020Matriks;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class AdityaTriAnanda_09021181924019 {
    
    
    public static int [][]random(int bar, int kol){
        Random ran = new Random();
        int matriks[][] = new int [bar][kol];
        for(int i=0;i<matriks.length;i++){
            for(int j=0;j<matriks[i].length;j++){
                matriks[i][j] = ran.nextInt(10);
            }
        }
        
        return matriks;
    }
    
    public static void view (int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println("");
        }
    }
    
    public static int [][] buatMatriks(){
        Scanner input = new Scanner(System.in);
        int baris,kolom;
        int mat[][];
        boolean cek;
        System.out.print("Panjang Baris = ");
        baris = input.nextInt();
        System.out.print("Panjang Kolom = ");
        kolom = input.nextInt();
        System.out.println("\nMatriks");
        System.out.println("=======");
        do{
            mat = random(baris,kolom); //input angka menggunakan random (0-10)
            view(mat);
            char x; 
            System.out.print("\nIngin mengubah nilai matriks (y/n) ? ");
            x = input.next().charAt(0);
            if(x=='y'){ cek = false; }
            else{cek=true;}
        }while(cek==false);
        
        return mat;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        int baris,kolom;
        boolean cek;
        
        //no1 : membuat matriks yang bisa dikali dengan konstanta
        int konstanta;
        int mat1[][];
        System.out.println("SOAL NO 1");
        System.out.println("=========");
        mat1 = buatMatriks();
        
        System.out.print("\nMasukkan konstanta untuk dikali = ");
        konstanta = input.nextInt();
        
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                mat1[i][j]= mat1[i][j]*konstanta;
            }
        }
        
        System.out.println("\nMatriks Sekarang");
        System.out.println("================");
        view(mat1);
        
        //no2 : Membuat Matriks Transpose
        int mat2[][];
        System.out.println("\nSOAL NO 2");
        System.out.println("=========");
        mat2 = buatMatriks();
        
        System.out.println("\nMatriks Transpose");
        System.out.println("=================");

        for(int i=0;i<mat2[0].length;i++){
            for(int j=0;j<mat2.length;j++){
                System.out.print(mat2[j][i]+"  ");
            }
            System.out.println("");
        }
        
        //no3 : Mengalikan Matriks
        int mat3[][];
        int mat4[][];
        System.out.println("\nSOAL NO 3");
        System.out.println("=========");
        System.out.println("\nMatriks 1");
        System.out.println("=========");
        mat3 = buatMatriks();
        System.out.println("\nMatriks 2");
        System.out.println("=========");
        mat4 = buatMatriks();
        
        if(mat3[0].length==mat4.length)
        {
            // misal matriks a ordenya (a,b), matriks b ordenya (b,c) hasil akan menjadi matriks ukuran (a,c)
            //jika pjg kolom matriks pertama != pjg baris matriks kedua, maka tidak terpenuhi syaratnya
            int hasil [][]= new int [mat3.length][mat4[0].length];
            System.out.println("\nHasil Perkalian Matriks");
            System.out.println("=========================");
            for(int i=0;i<hasil.length;i++){
                for(int j=0;j<hasil[0].length;j++){
                    int jum = 0;
                    for(int k=0;k<mat3[0].length;k++){ 
                        jum += mat3[i][k]*mat4[k][j];
                        hasil[i][j]= jum;
                    } 
                }
            }
            view(hasil);
        }
        
        else{
            System.out.println("\nMaaf, Syarat perkalian tidak terpenuhi");
        }
    }
}