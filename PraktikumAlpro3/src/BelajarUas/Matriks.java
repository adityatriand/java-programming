/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BelajarUas;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Matriks {
        public static void main(String[] args) {
        System.out.println("Matriks 1");
        int arr[][] = makeMatriks();
        System.out.println("Matriks 2");
        int arr1[][] = makeMatriks();
        System.out.println("Transpose Matriks 1");
        int arrT[][]= transpose(arr);
        System.out.println("Transpose Matriks 2");
        int arr1T[][]= transpose(arr1);
        System.out.println("Sum of Matriks 1 and Matriks 2");
        int res[][] = sumMatriks(arr, arr1);
        System.out.println("Subtraction of Matriks 1 and Matriks 2");
        int res1[][] = subMatriks(arr, arr1);
        System.out.println("Multiply of Matriks 1 and Matriks 2");
        int res2[][] = mulMatriks(arr, arr1);
    }
    
    static int [][] makeMatriks(){
        Scanner input = new Scanner(System.in);
        int a [][];
        System.out.print("Row = ");
        int row = input.nextInt();
        System.out.print("Column = ");
        int col = input.nextInt();
        boolean check;
        do{
            check = false;
            a= new int [row][col];
            fillValue(a);
            viewMatriks(a);
            System.out.print("Want to change value ? (y/n) ");
            char an = input.next().charAt(0);
            if(an=='y')check=true;
        }while(check);
        return a;
    }
    
    static void fillValue(int [][]a){
        for (int[] a1 : a) {
            for (int j = 0; j<a[0].length; j++) {
                a1[j] = (int)(Math.random()*10);
            }
        }
    }
    
    static void viewMatriks(int [][]a){
        for (int[] a1 : a) {
            for (int j = 0; j<a[0].length; j++) {
                System.out.print(a1[j] + " ");
            }
            System.out.println();
        }
    }
    
    static int [][] transpose(int a[][]){
        int b [][] = new int [a[0].length][a.length]; 
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                b[i][j]= a[j][i];
            }
        }
        viewMatriks(b);
        return b;
    }
    
    static int [][]sumMatriks(int a[][],int b[][]){
        if(a.length!=b.length || a[0].length!=b[0].length){
            int c[][]={{-1,-1}};
            System.out.println("Terms of Sum Matrix not fulfilled");
            return c;
        }
        else{
            int c [][] = new int [a.length][a[0].length];
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++){
                    c[i][j] = a[i][j]+b[i][j];
                }
            }
            viewMatriks(c);
            return c;
        }   
    }
    
    static int [][]subMatriks(int a[][],int b[][]){
        if(a.length!=b.length || a[0].length!=b[0].length){
            int c[][]={{-1,-1}};
            System.out.println("Terms of Subtraction Matrix not fulfilled");
            return c;
        }
        else{
            int c [][] = new int [a.length][a[0].length];
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++){
                    c[i][j] = a[i][j]-b[i][j];
                }
            }
            viewMatriks(c);
            return c;
        }   
    }
    
    static int [][] mulMatriks(int a[][], int b[][]){
        if(a[0].length!=b.length){
            int c[][]={{-1,-1}};
            System.out.println("Terms of Subtraction Matrix not fulfilled");
            return c;
        }
        else{
            int c [][] = new int [a.length][b[0].length];
            for(int i=0;i<c.length;i++){
                for(int j=0;j<c[0].length;j++){
                    int temp = 0;
                    for(int k=0;k<a[0].length;k++){
                        temp += a[i][k]*b[k][j];
                        c[i][j]= temp;
                    }
                }
            }
            viewMatriks(c);
            return c;
        }
    }
}
