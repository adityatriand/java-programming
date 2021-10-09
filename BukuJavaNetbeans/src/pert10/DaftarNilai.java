/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pert10;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class DaftarNilai {
    
    public static Scanner input = new Scanner(System.in);
   
    public static void main(String[]args)
    {
        int a;
        System.out.print("Masukkan Jumlah Mahasiswa = ");
        a = input.nextInt();
        String [] nama = new String [a];
        String [] NIM = new String [a];
        float [] tqr = new float [a];
        float [] uts = new float [a];
        float [] uas = new float [a];
        
        for(int i=0;i<a;i++)
        {
            System.out.println("\nData ke-"+(i+1));
            System.out.print("Masukkan NIM Mahasiswa = ");
            NIM[i]= input.next();
            input.nextLine();
            System.out.print("Masukkan Nama Mahasiswa = ");
            nama[i] = input.nextLine();
            System.out.print("Masukkan Nilai Tugas + Kuis + Kehadiran = ");
            tqr[i]= input.nextFloat();
            System.out.print("Masukkan Nilai UTS Mahasiswa = ");
            uts[i]= input.nextFloat();
            System.out.print("Masukkan Nilai UAS Mahasiswa = ");
            uas[i]= input.nextFloat();
        }
        
        System.out.println("============================================================================================================");
        System.out.println("| Nomor |         NIM         |             Nama            |  TQK   |  UTS   |  UAS   |  NA   | Indeks |");
        System.out.println("============================================================================================================");
        String tabel = "|   %d   |   %15s   |      %s      | %2.1f  | %2.1f  | %2.1f  | %2.1f  |    %s   |%n";
        int lulus =0;
        for(int i=0;i<a;i++)
        {
            float rata = (tqr[i]+uts[i]+uas[i])/3;
            String indeks = "";
            if(rata>=86)
            {
                indeks = "A";
                lulus++;
            }
            else if(rata>=71 && rata<86)
            {
                indeks ="B";
                lulus++;
            }
            else if(rata>=56 && rata<71)
            {
                indeks ="C";
                lulus++;
            }
            else if(rata>=31 && rata<56)
            {
                indeks ="D";
            }
            else
            {
                indeks ="E";
            }
            System.out.printf(tabel,(i+1),NIM[i],nama[i],tqr[i],uts[i],uas[i],rata,indeks);
        }
        
        System.out.println("============================================================================================================");
        System.out.println("Jumlah Mahasiswa = "+a);
        System.out.println("Jumlah Mahasiswa yang Lulus = "+lulus);
        System.out.println("Jumlah Mahasiswa yang Tidak Lulus = "+(a-lulus));
    }
    
}
