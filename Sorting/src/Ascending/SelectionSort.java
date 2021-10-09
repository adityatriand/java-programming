/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ascending;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class SelectionSort {
    
    public static Scanner input = new Scanner(System.in);
   
    int [] Input()
    {
        int banyak;
        System.out.print("Masukkan banyak data = ");
        banyak = input.nextInt();
        int [] data = new int [banyak];
        for(int i=0;i<data.length;i++)
        {
            System.out.print("Data ke-"+(i+1)+" = ");
            data[i]= input.nextInt();
        }
        System.out.print("Data sebelum di sorting = ");
        Tampil(data);
        return data;
    }
    
    void Sort(int [] a)
    {
       for(int i=0;i<a.length-1;i++)
       {
           int min = a[i];
           for(int j=(i+1);j<a.length;j++)
           {
               if(min>a[j])
               {
                   min = a[j];
                   int temp = a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
           }
           System.out.println("");
           Tampil(a);
       }
       System.out.print("\nData setelah di sorting = ");
       Tampil(a);
       System.out.println("");
    }
    
    void Tampil(int [] b)
    {
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+"\t");
        }
    }
    
    public static void main(String[]args)
    {
        SelectionSort adit = new SelectionSort();
        adit.Sort(adit.Input());
    }
}
