/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal1September2020Loop;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class AdityaTriAnanda_09021181924019 
{
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        //no1
        String nama,NIM;
        System.out.print("1.Masukkan nama anda : ");
        nama = input.nextLine();
        System.out.print("  Masukkan NIM anda : ");
        NIM = input.nextLine();
        System.out.println("  Hallo <"+nama+"> , <"+NIM+">");
        
        //no2
        float dollar,rupiah;
        System.out.print("\n2.Masukkan nilai dollar = $ ");
        dollar = input.nextFloat();
        rupiah = dollar*14000;
        System.out.println("  Nilai rupiah = Rp. "+rupiah);
        
        //no3
        float jarijari,luaslingkaran;
        System.out.print("\n3.Masukkan Jari Jari  : ");
        jarijari = input.nextFloat();
        luaslingkaran = 3.14f*jarijari*jarijari;
        System.out.println("  Luas Lingkaran = "+luaslingkaran);
        
        //no4
        int nilai;
        System.out.print("\n4.Masukkan nilai (1-100) = ");
        nilai = input.nextInt();
        if(nilai==100)
        {
            System.out.println("  Hebat!");
        }
        else
        {
            System.out.println("  Kosong");
        }
        
        //no5
        int range;
        char index;
        System.out.print("\n5.Masukkan range nilai anda (0-100) : ");
        range = input.nextInt();
        if(range>=80&&range<=100)
        {
            index = 'A';
        }
        else if(range>=60&&range<=79)
        {
            index = 'B';
        }
        else if(range>=40&&range<=59)
        {
            index = 'C';
        }
        else if(range>=20&&range<=39)
        {
            index = 'D';
        }
        else
        {
            index = 'E';
        }
        
        System.out.println("  Index nilai anda : "+index);
        
        //no6
        int cek;
        do
        {
            System.out.print("\n6.Masukkan range nilai (1-10) : ");
            cek = input.nextInt();
        }while(cek<1 || cek>10);
        
        //no7
        int cek2;
        do
        {
            System.out.print("\n7.Masukkan range nilai (1-10) : ");
            cek2 = input.nextInt();
            if(cek2>=1 && cek2<=10)
            {
                for(int i=cek2;i>=1;i--)
                {
                    System.out.println("  *");
                }
            }
        }while(cek2<1 || cek2>10);
        
    }
    
}
