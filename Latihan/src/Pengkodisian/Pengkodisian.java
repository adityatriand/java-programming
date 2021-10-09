/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pengkodisian;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Pengkodisian 
{
    static Scanner input = new Scanner (System.in);
    static Random ran = new Random();
    public static void main(String[]args)
    {
        satu();
        dua();
    }
    
    static void satu()
    {
        int a;
        System.out.println("PROGRAM CEK BILANGAN +/-");
        System.out.print("Masukkan nilai yang akan di cek = ");
        a = input.nextInt();
        if(a>=0)
        {
            System.out.println("Bilangan Positif");
        }
        else
        {
            System.out.println("Bilangan Negatif");
        }
    }
    
    static void dua()
    {
        String nama;
        int umur,angka = ran.nextInt(21);
        String huruf[]={"A","B","C","D","E","F","G","H","I","J"};
        int a = ran.nextInt(10);
        System.out.println("\nPROGRAM PEMBELIAN TIKET");
        System.out.print("Nama Anda = ");
        input.nextLine();
        nama = input.nextLine();
        System.out.print("Umur Anda = ");
        umur = input.nextInt();
        if(umur>18)
        {
            System.out.println("Pembelian tiket berhasil. No tiket "+huruf[a]+angka);
        }
        else
        {
        System.out.println("Pembelian tiket gagal");
        }
    }
}
