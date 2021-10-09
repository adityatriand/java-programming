/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayObjek;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static DecimalFormat ribu = new DecimalFormat("###,###");
    
    public static void Menu ()
    {
        System.out.println("SELAMAT DATANG DI WARUNG MAKAN ADIT");
        System.out.println("===================================");
        System.out.println("\nMENU MAKANAN");
        System.out.println("===================================");
        System.out.println("1.Pempek = Rp 7.000");
        System.out.println("2.Model = Rp. 7.000");
        System.out.println("3.Tekwan = Rp. 8.000");
        System.out.println("4.Siomay = Rp. 10.000");
        System.out.println("5.Bakso = Rp. 11.000");
        System.out.println("===================================");
    }
    
    public static int Banyak()
    {
        int n;
        System.out.print("\nBanyak jenis makanan yang akan dipesan = ");
        n = input.nextInt();
        return n;
    }

    public static int Harga(String b)
    {
        int harga = 0;
        if(b.equalsIgnoreCase("Pempek")||b.equals("Model") )
        {
            harga = 7000;
        }
        else if(b.equals("Tekwan"))
        {
            harga = 8000;
        }
        else if(b.equals("Siomay"))
        {
            harga = 10000;
        }
        else if(b.equals("Bakso"))
        {
            harga = 11000;
        }
        return harga;
    }
    
    public static void Tampil (Makanan a [])
    {
        System.out.println("\nMakanan yang Anda Pesan : ");
        System.out.println("===================================");
        for(Makanan s : a)
        {
            System.out.println("--> "+s.format());
        }
        System.out.println("===================================");
    }
    
    public static void main(String []args)
    {
        Menu();
        Makanan makan [] = new Makanan[Banyak()];
        int total=0;
        for(int i=0;i<makan.length;i++)
        {
            String food;
            int jumlah, harga;
            System.out.print("\n"+(i+1)+". Masukkan nama makanan = ");
            food = input.next();
            Harga(food);
            System.out.print("   Masukkan banyak makanan = ");
            jumlah = input.nextInt();
            harga = Harga(food)*jumlah;
            total += harga;
            makan [i]= new Makanan(food,jumlah);
            
        }
        Tampil(makan);
        System.out.println("Total Bayar = Rp. "+ribu.format(total));
    }
}
