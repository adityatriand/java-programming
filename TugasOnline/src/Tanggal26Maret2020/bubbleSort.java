/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal26Maret2020;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class bubbleSort 
{
    
    public static void Ascending(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<(a.length-1);j++)
            {
                if(a[j+1]< a[j])
                {
                    int temp;
                    temp = a[j+1];
                    a[j+1]= a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("\nData di Sorting Ascending ( menaik )   =\t");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
    
    public static void Descending(int b[])
    {
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<(b.length-1);j++)
            {
                if(b[j+1]>b[j])
                {
                    int temp;
                    temp = b[j+1];
                    b[j+1] = b[j];
                    b[j] = temp;
                }
            }
        }
        System.out.print("\nData di Sorting Descending ( menurun ) =\t");
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+"\t");
        }
    }
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in); // memakai scanner untuk input banyak data
        Random ran = new Random();  //memakai random agar inputan nilai berbeda setiap kali ingin pakai
        System.out.println("BUBBLE SORT");
        System.out.println("========================");
        int banyak;
        System.out.print("Masukkan banyak data = ");
        banyak = input.nextInt();
        int data [] = new int [banyak];
        for(int i=0;i<data.length;i++)
        {
            data[i]= ran.nextInt(50);
        }
        System.out.print("Data Sebelum di Sorting                =\t");
        for(int i=0;i<data.length;i++)
        {
            System.out.print(data[i]+"\t");
        }
        Ascending(data);
        Descending(data);
    }

}
