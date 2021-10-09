/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal25Agustus2020Kondisi;

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
        int menit,detik,konversi;
        System.out.print("Masukkan menit : ");
        menit = input.nextInt();
        System.out.print("Masukkan detik : ");
        detik = input.nextInt();
        System.out.println("Waktu sekarang : "+menit+" Menit "+detik+" Detik ");
        konversi= menit*60;
        System.out.println("Setelah dikonversi");
        System.out.println("Waktu sekarang : "+(konversi+detik)+" Detik");
        
        double totalbelanja = 0,totalbelanja1=0,diskon1=0,diskon2 = 0;
        int umur;
        char card;
        System.out.print("\nMasukkan total belanja = ");
        totalbelanja = input.nextDouble();
        System.out.print("Masukkan umur anda = ");
        umur = input.nextInt();
        System.out.print("Apakah Anda mempunyai kartu membership (y/n) = ");
        card = input.next().charAt(0);

        System.out.println("\nData sebelum di diskon");
        System.out.println("======================");
        System.out.println("Total Belanja Anda = Rp "+totalbelanja);
        System.out.println("Umur Anda          = "+umur);
        
        if(umur<30)
        {
            diskon1 = 0.1*totalbelanja;
        }
        else if(umur>=30&&umur<60)
        {
            diskon1 = 0.2*totalbelanja;
        }
        else
        {
            diskon1 = 0.3*totalbelanja;
        }
        
        totalbelanja1=totalbelanja-diskon1;
        
        if(card=='y')
        {
            System.out.println("Anda Mempunyai Kartu Member");
            diskon2 = 0.1*totalbelanja1;
        }
        else
        {
            System.out.println("Anda Mempunyai Kartu Member");
            diskon2 = 0;
        }
        
        
        System.out.println("\nData setelah mendapat diskon");
        System.out.println("=================================");
        System.out.println("Total Belanja Anda = Rp "+totalbelanja);
        System.out.println("Pembayaran = Rp "+(totalbelanja - diskon1-diskon2));
        
        
    }
    
}
