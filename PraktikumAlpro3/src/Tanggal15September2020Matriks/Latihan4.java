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
public class Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris = 3, kolom = 5;
        int matriks[][] = new int [baris][kolom];
        int matriks2[][]= new int [baris][kolom];
        
        //input matriks 1
        System.out.println("\nInput Data Matriks 1");
        System.out.println("====================");
        System.out.println("Input Random");
        for(int i=0;i<matriks.length;i++){
            for(int j=0;j<matriks[i].length;j++){
                matriks[i][j]= (int)(Math.random()*10);
            }
        }
        
        //input matriks 2
        System.out.println("\nInput Data Matriks 2");
        System.out.println("====================");
        System.out.println("Input Random");
        for(int i=0;i<matriks2.length;i++){
            for(int j=0;j<matriks2[i].length;j++){
                matriks2[i][j]= (int)(Math.random()*10);
            }
        }
        
        //tampil matriks 1
        System.out.println("\nMatriks 1");
        System.out.println("=========");
        for(int i=0;i<matriks.length;i++){
            for(int j=0;j<matriks[i].length;j++){
                System.out.print(matriks[i][j]+"  ");
            }
            System.out.println("");
        }
        
        //tampil matriks 2
        System.out.println("\nMatriks 2");
        System.out.println("=========");
        for(int i=0;i<matriks2.length;i++){
            for(int j=0;j<matriks2[i].length;j++){
                System.out.print(matriks2[i][j]+"  ");
            }
            System.out.println("");
        }
        
        //proses pertambahan
        int [][]temp = new int[baris][kolom];
        for(int i=0;i<temp.length;i++){
            for(int j=0;j<temp[i].length;j++){
                temp[i][j]=matriks[i][j]+matriks2[i][j];
            }
        }
        
        System.out.println("\nPertambahan Matriks");
        System.out.println("===================");
        for(int i=0;i<temp.length;i++){
            for(int j=0;j<temp[i].length;j++){
                System.out.print(temp[i][j]+"  ");
            }
            System.out.println("");
        }
    }
    
}
