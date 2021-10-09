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
public class Ifelse 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
//        String nama;
//        int umur;
//        System.out.print("Nama Saya = ");
//        nama = input.nextLine();
//        System.out.print("Umur Saya = ");
//        umur = input.nextInt();
//        if(umur<18)
//        {
//            System.out.println("Belum Cukup Umur");
//        }
//        
//        else if(umur>100)
//        {
//            System.out.println("Sudah Sangat Tua");
//        }
//        
//        int umur1;
//        double rata;
//        System.out.print("Umur Kakek = ");
//        umur1 = input.nextInt();
//        rata = (umur+umur1)/2;
//        System.out.println("Rata Rata Umur = "+rata);
        
        //VERSI 1
        int angka, angka1, angka2;
        System.out.print("Angka 1 = ");
        angka = input.nextInt();
        System.out.print("Angka 2 = ");
        angka1= input.nextInt();
        System.out.print("Angka 3 = ");
        angka2 = input.nextInt();
        if(angka>angka1 && angka>angka2)
        {
            System.out.println(angka+" Merupakan Bilangan Terbesar");
        }
        
        else if(angka1>angka && angka1>angka2)
        {
            System.out.println(angka1+" Merupakan Bilangan Terbesar");
        }
        
        else
        {
            System.out.println(angka2+" Merupakan Bilangan Terbesar");
        }
        
        if(angka<angka1 && angka<angka2)
        {
            System.out.println(angka+" Merupakan Bilangan Terkecil");
        }
        
        else if(angka1<angka && angka1<angka2)
        {
            System.out.println(angka1+" Merupakan Bilangan Terkecil");
        }
       
        else
        {
            System.out.println(angka2+"Merupakan Bilangan Terkecil");
        }
        
        //VERSI 2
//        int dataangka[]= new int[3];
//        for(int i=0;i<dataangka.length;i++)
//        {
//            System.out.println("Angka "+(i+1)+" = ");
//            dataangka[i]= input.nextInt();
//        }
//        for(int i=0;i<dataangka.length;i++)
//        {
//            for(int j=i+1;j<dataangka.length;j++)
//            {
//                if(dataangka[i]>dataangka[j])
//                {
//                    System.out.println(dataangka[i]+" Merupakan bilangan terbesar");
//                    break;
//                }
//                
//                else
//                {
//                    System.out.println(dataangka[i]+" Meerupakan bilangan terkecil");
//                    break;
//                }
//            }
//        }
        
//        int angka;
//        System.out.print("Masukkan Bilangan = ");
//        angka = input.nextInt();
//        if(angka%2==0)
//        {
//            System.out.println("Genap");
//        }
//        else if(angka%2==1)
//        {
//            System.out.println("Ganjil");
//        }
//        else
//        {
//            System.out.println("Nol");
//        }
                
    }
    
}
