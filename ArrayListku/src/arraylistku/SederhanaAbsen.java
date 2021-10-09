/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistku;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class SederhanaAbsen 
{
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner (System.in);
        Scanner input1 = new Scanner (System.in).useLocale(Locale.ENGLISH);
        List<String> nama = new ArrayList<>();
        List<Double> jam = new ArrayList<>();
        
        System.out.println("Absen Mahasiswa\n===============");
        String a;
        double b;
        boolean cek = true;
        do
        {
            System.out.print("Nama : ");
            a = input.nextLine();
            nama.add(a);
            System.out.print("Jam Absen : ");
            b = input1.nextDouble();
            jam.add(b);
            System.out.print("Ingin mengabsen kembali(y/n) ? ");
            char stj = input1.next().charAt(0);
            if(stj=='n')
            {
                cek=false;
            }
        }while(cek);
        
        System.out.println("\nRekap Absen\n===========");
        for(int i=0;i<nama.size();i++)
        {
            System.out.println((i+1)+". "+nama.get(i));
            if(jam.get(i)>08.15)
            {
                System.out.println("   Terlambat");
            }
            else
            {
                System.out.println("   Hadir");
            }
        }
    }
    
}
