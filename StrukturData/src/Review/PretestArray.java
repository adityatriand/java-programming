/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class PretestArray 
{
    public static Scanner input = new Scanner(System.in);
    
    public static void tampil(int array[])
    {
        System.out.print("\nData : ");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void tampil(int array[][])
    {
        System.out.println("Data : ");
         for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length;j++)
            {
                System.out.print(array[i][j]+"    ");
            }
            System.out.println("");
        }
    }
    
    public static void tampil(String array[][])
    {
        System.out.println("\nData : ");
         for(int i=0;i<6;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(array[i][j]+"    ");
            }
            System.out.println("");
        }
    }
    
    public static void tampil(char array[])
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
     
    public static void tampilhuruf(char array[])
    {
        for(int i=array.length-1;i>=0;i--)
        {
            System.out.print(array[i]+" ");
        }
    }
    
    public static void tampilitung(int array[][])
    {
        System.out.println("\nData : ");
         for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length;j++)
            {
                System.out.print(array[i][j]+"    ");
            }
            System.out.println("");
        }
    }
    
    
    public static void no1()
    {
        
        int A[]={3,6,4,8,9,2};
        int B[]={2,4,6,8,1,3};
        int C[]= new int[6];
        for(int i=0;i<C.length;i++)
        {
            C[i]=A[i]+B[i];
        }
        tampil(C);
    }
    
    public static void no2()
    {
        String [][]negara = new String [6][2];
        negara[0][0]="negara";
        negara[0][1]="ibukota";
        negara[1][0]="indonesia";
        negara[1][1]="jakarta";
        negara[2][0]="inggris";
        negara[2][1]="london";
        negara[3][0]="austria";
        negara[3][1]="wina";
        negara[4][0]="perancis";
        negara[4][1]="paris";
        negara[5][0]="jepang";
        negara[5][1]="tokyo";
        tampil(negara);

    }
    
    public static void no3()
    {
        System.out.print("Banyak kata : ");
        int banyak = input.nextInt();
        char []huruf = new char [banyak];
        for(int i=0;i<huruf.length;i++)
        {
            huruf[i]=input.next().charAt(0);
        }
        System.out.println("");
        tampilhuruf(huruf);
    }
    
    public static void no4()
    {
        int [][]mat = new int[5][5];
        int [] hasil = new int [5];
        
         for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                
                System.out.print("("+i+","+j+") : ");
                mat[i][j]= input.nextInt();
            }
        }
        
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                
                hasil[i]+=mat[j][i];
            }
        }
        tampilitung(mat);
        tampil(hasil);
    }
    
    public static void main(String [] args)
    {
        no3();
    }
}
