/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal10Maret2020;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class tugas1 {
    public static Scanner input = new Scanner(System.in);
    public static Random ran = new Random();
    
    int [] inputData()
    {
        int n;
        System.out.print("Masukkan banyak data = ");
        n = input.nextInt();
        int array [] = new int [n];
        for(int i=0;i<array.length;i++)
        {
            array[i]= ran.nextInt(20);
        }
        return array;
    }
    
    int banyakSama(int a[],int b)
    {
        int banyak =0;
        for(int i=0;i<a.length;i++)
        {
            if(b==a[i])
            {
                banyak++;
            }
            
        }
        return banyak;
    }
    
    int []cari(int a[],int b, int c )
    {
        int index =0;
        int arrayindex[]= new int [c];
        for(int i=0;i<a.length;i++)
        {
            if(b==a[i])
            {
                arrayindex[index]= i;
                index++;
            }
        }
        return arrayindex;
    }
    
    void Tampil(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
    public static void main(String[]args)
    {
        tugas1 panggil = new tugas1();
        int data[]= panggil.inputData();
        int cari;
        System.out.print("Data yang ada = ");
        panggil.Tampil(data);
        System.out.print("\nMasukkan angka yang akan dicari = ");
        cari = input.nextInt();
        System.out.print("Index angka yang dicari berada pada = ");
        panggil.Tampil(panggil.cari(data, cari,panggil.banyakSama(data, cari)));
        System.out.println("");
    }
}
