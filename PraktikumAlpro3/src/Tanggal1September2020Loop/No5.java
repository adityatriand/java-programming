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
public class No5 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int i=0,banyak,ganjil=0,genap=0,positif=0,negatif=0;
        System.out.print("Banyak bilangan yang akan diinput = ");
        banyak = input.nextInt();
        while(i<banyak && banyak>0)
        {
            System.out.print("Masukkan nilai = ");
            int nilai = input.nextInt(); 
            if(nilai!=-999)
            {
                if(nilai%2==0)
                {
                    genap++;
                    if(nilai>0)
                    {
                        positif++;
                    }
                    else
                    {
                        negatif++;
                    }
                }
            
                else
                {
                    ganjil++;
                    if(nilai>0)
                    {
                        positif++;
                    }
                    else
                    {
                        negatif++;
                    }
                }
                i++;
            }
            
        }
        
        System.out.println("\nBanyak bilangan genap = "+genap);
        System.out.println("Banyak bilangan ganjil = "+ganjil);
        System.out.println("Banyak bilangan positif = "+positif);
        System.out.println("Banyak bilangan negatif = "+negatif);
    }
    
}
