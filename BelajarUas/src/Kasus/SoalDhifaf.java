/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Adit
 */

class KM 
{
    String nama ;
    String NIM ;
    double nilai;
}

public class SoalDhifaf {
    
    public static BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
    public static Scanner input1 = new Scanner(System.in);
    
    public static KM [] kelulusanMahasiswa (KM a[]) throws IOException
    {
        double total = 0;
        for(int i=0;i<a.length;i++)
        {
            String N;
            a[i].nama= input.readLine();
            a[i].NIM = input.readLine();
            N = input.readLine();
            a[i].nilai= Double.parseDouble(N);
            total += a[i].nilai;
        }
        
        System.out.println("\nContoh Keluaran");
        double rata = total/a.length;
        System.out.printf("%1.2f %n",rata);
        for(int i=0;i<a.length;i++)
        {
            if(a[i].nilai>rata)
            {
                System.out.println(a[i].nama+"("+a[i].NIM+")");
            }
        }
        return a ;
    }
    
    public static int pangkat(int a, int b)
    {
        int e = b-1;
        if(b==1)
        {
            return a;
        }
        return a*pangkat(a,e);
    }
    
    public static int deret (int a)
    {
        int e = a-1;
        if(a==0)
        {
            return a;
        }
        return a+deret(e);
    }
    
    public static void uji (String a, int b, int c)
    {
        if(a.equals("deret"))
        {
            System.out.println(deret(b));
        }
        else if(a.equals("pangkat"))
        {
            System.out.println(pangkat(b,c));
        }
        else
        {
            System.out.println("error");
        }
    }
    
    public static int balik (int a)
    {
        int balik = 0;
        while(a!=0)
        {
            balik = balik * 10;
            balik = balik + a%10;
            a = a/10;
        }
        return balik;
    }
    public static void main(String[] args) throws IOException
    {
        System.out.println("Contoh Masukan");
        String banyak;
        banyak = input.readLine();
        int N = Integer.parseInt(banyak);
        
        KM mahasiswa [] = new KM [N];
        for(int i=0;i<N;i++)
        {
            mahasiswa [i] = new KM ();
        }
        kelulusanMahasiswa(mahasiswa);
        
        System.out.println("\nContoh Masukan");
        int N1 = input1.nextInt();
        String uji [] = new String [N1];
        int angka [] = new int [N1];
        int angka1 [] = new int [N1];
        for(int i = 0;i<N1;i++)
        {
            System.out.print("");
            uji [i] = input1.next();
            if(uji[i].equals("deret"))
            {
                System.out.print("");
                angka[i] = input1.nextInt();
            }
            else if(uji[i].equals("pangkat"))
            {
                System.out.print("");
                angka[i] = input1.nextInt();

                System.out.print("");
                angka1[i] = input1.nextInt();
            }
        }
        
        System.out.println("\nContoh Keluaran");
        for(int i=0;i<N1;i++)
        {
            uji(uji[i],angka[i],angka1[i]);
        }
        
        System.out.println(balik(234));
    }
}
