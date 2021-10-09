/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequence;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class OperasiMatematika 
{
    
    public static int tambah(int at, int bt)
    {
        int hasil = at + bt;
        return hasil;
    }
    
    public static double tambah(double at, double bt)
    {
        double hasil = at + bt;
        return hasil;
    }
    
    public static int kurang(int ak, int bk)
    {
        int hasil = ak + bk;
        return hasil;
    }
    
    public static double kurang(double ak, double bk)
    {
        double hasil = ak + bk;
        return hasil;
    }
    
    public static int perkalian(int ap, int bp)
    {
        int hasil = ap * bp;
        return hasil;
    }
    
    public static double perkalian(double ap, double bp)
    {
        double hasil = ap + bp;
        return hasil;
    }
    
    public static int bagi(int ab, int bb)
    {
        int hasil = ab / bb;
        return hasil;
    }
    
    public static double bagi(double ab, double bb)
    {
        double hasil = ab / bb;
        return hasil;
    }
    
    public static void operasiMatematika()
    {
        Scanner input = new Scanner(System.in);
        String jawab = "";
        boolean lanjut =  true;
        do
        {
            System.out.println("OPERASI MATEMATIKA SEDERHANA");
            System.out.println("============================");
            System.out.println("Pilihan Menu");
            System.out.println("1.Pertambahan");
            System.out.println("2.Pengurangan");
            System.out.println("3.Perkalian");
            System.out.println("4.Pembagian");
            System.out.println("============================");
            System.out.print("Pilihan Anda : ");
            int pil = input.nextInt();
            switch(pil)
            {
                case 1 : System.out.println("\nformat ... + ... = ....");
                         System.out.println("=======================");
                         System.out.println("Pilihan Menu");
                         System.out.println("1.Angka Bulat");
                         System.out.println("2.Angka Desimal");
                         System.out.println("=======================");
                         System.out.print("Pilihan Anda : ");
                         int pilt = input.nextInt();
                         switch(pilt)
                         {
                             case 1 : System.out.print("\nMasukkan angka pertama : ");
                                      int a = input.nextInt();
                                      System.out.print("Masukkan angka kedua : ");
                                      int b = input.nextInt();
                                      System.out.println(a+" + "+b+" = "+tambah(a,b));
                                      break;
                             case 2 : System.out.print("\nMasukkan angka pertama : ");
                                      double c = input.nextDouble();
                                      System.out.print("Masukkan angka kedua : ");
                                      double d = input.nextDouble();
                                      System.out.println(c+" + "+d+" = "+tambah(c,d));
                                      break;
                             default :System.out.println("\nMaaf Pilihan Anda Salah");
                                      break;
                         }
                         break;
                case 2 : System.out.println("\nformat ... - ... = ....");
                         System.out.println("=======================");
                         System.out.println("Pilihan Menu");
                         System.out.println("1.Angka Bulat");
                         System.out.println("2.Angka Desimal");
                         System.out.println("=======================");
                         System.out.print("Pilihan Anda : ");
                         int pilk = input.nextInt();
                         switch(pilk)
                         {
                             case 1 : System.out.print("\nMasukkan angka pertama : ");
                                      int a = input.nextInt();
                                      System.out.print("Masukkan angka kedua : ");
                                      int b = input.nextInt();
                                      System.out.println(a+" - "+b+" = "+kurang(a,b));
                                      break;
                             case 2 : System.out.print("\nMasukkan angka pertama : ");
                                      double c = input.nextDouble();
                                      System.out.print("Masukkan angka kedua : ");
                                      double d = input.nextDouble();
                                      System.out.println(c+" - "+d+" = "+kurang(c,d));
                                      break;
                             default :System.out.println("\nMaaf Pilihan Anda Salah");
                                      break;
                         }
                         break;
                case 3 : System.out.println("\nformat ... x ... = ....");
                         System.out.println("=======================");
                         System.out.println("Pilihan Menu");
                         System.out.println("1.Angka Bulat");
                         System.out.println("2.Angka Desimal");
                         System.out.println("=======================");
                         System.out.print("Pilihan Anda : ");
                         int pilp = input.nextInt();
                         switch(pilp)
                         {
                             case 1 : System.out.print("\nMasukkan angka pertama : ");
                                      int a = input.nextInt();
                                      System.out.print("Masukkan angka kedua : ");
                                      int b = input.nextInt();
                                      System.out.println(a+" x "+b+" = "+perkalian(a,b));
                                      break;
                             case 2 : System.out.print("\nMasukkan angka pertama : ");
                                      double c = input.nextDouble();
                                      System.out.print("Masukkan angka kedua : ");
                                      double d = input.nextDouble();
                                      System.out.println(c+" x "+d+" = "+perkalian(c,d));
                                      break;
                             default :System.out.println("\nMaaf Pilihan Anda Salah");
                                      break;
                         }
                         break;

                case 4 : System.out.println("\nformat ... : ... = ....");
                         System.out.println("=======================");
                         System.out.println("Pilihan Menu");
                         System.out.println("1.Angka Bulat");
                         System.out.println("2.Angka Desimal");
                         System.out.println("=======================");
                         System.out.print("Pilihan Anda : ");
                         int pilb = input.nextInt();
                         switch(pilb)
                         {
                             case 1 : System.out.print("\nMasukkan angka pertama : ");
                                      int a = input.nextInt();
                                      System.out.print("Masukkan angka kedua : ");
                                      int b = input.nextInt();
                                      System.out.println(a+" : "+b+" = "+bagi(a,b));
                                      break;
                             case 2 : System.out.print("\nMasukkan angka pertama : ");
                                      double c = input.nextDouble();
                                      System.out.print("Masukkan angka kedua : ");
                                      double d = input.nextDouble();
                                      System.out.println(c+" : "+d+" = "+bagi(c,d));
                                      break;
                             default :System.out.println("\nMaaf Pilihan Anda Salah");
                                      break;
                         }
                         break;

                default: System.out.println("\nMaaf Pilihan Anda Salah");break;
            }
            
            System.out.print("\nMengulang kembali pengoperasian ? (y/t) : ");
            jawab = input.next();
            if(jawab.equals("t"))
            {
                lanjut = false;
            }
            System.out.println("");
        }while(lanjut == true);
    }
}