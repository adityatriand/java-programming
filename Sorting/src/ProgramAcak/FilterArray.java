/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramAcak;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Adit
 */
public class FilterArray {
    public static Scanner input = new Scanner(System.in);
    public static Random ran = new Random();
    public static void main(String[] args) {
        // TODO code application logic here
        int c [] = Geser(Hapus(Input()));
        Tampil(c);
        Sort(c);
    }
    
    public static int [] Input()
    {
        int a;
        System.out.print("Masukkan Banyak Data = ");
        a = input.nextInt();
        int array [] = new int [a];
        for(int i=0;i<a;i++)
        {
            array[i]= ran.nextInt(100);
        }
        Tampil(array);
        return array;
    }
    
    public static void Tampil (int [] a)
    {
        System.out.print("Data yang ada : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");
        }
        System.out.println("");
    }
    
    public static int [] Hapus(int [] b)
    {
        int data;
        boolean cek = true;
        String ulang;
        while(cek = true)
        {
            System.out.print("\nData ke berapa yang ingin di hapus = ");
            data = input.nextInt();
            b[data-1]= 0;
            Tampil(b);
            System.out.print("Apakah ingin menghapus lagi (y/t) ? ");
            ulang = input.next();
            if(ulang.equals("t"))
            {
                cek = false;
                break;
            } 
        }
        System.out.println("\nData Setelah di Geser ");
        return b;
    }
    
    public static int [] Geser(int []c)
    {
        int geser = 0;
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c.length;j++)
            {
                if(c[j]==0)
                {
                    geser = j;
                }
            }
            if(geser != 0)
            {
                for(int k=geser;k>0;k--)
                {
                    int temp = c[k];
                    c[k] = c[k-1];
                    c[k-1] = temp;
                }
            }
        }
        return c;
    }
    
    public static void Sort(int [] d)
    {
        for(int i=0;i<d.length;i++)
        {
            for(int j=(i+1);j<d.length;j++)
            {
                if(d[i]>d[j])
                {
                    int temp = d[i];
                    d[i]=d[j];
                    d[j]=temp;
                }
            }
        }
        
        System.out.println("\nData di Sorting");
        Tampil(d);
    }
    
}
