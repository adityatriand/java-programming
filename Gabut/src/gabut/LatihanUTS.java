/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabut;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class LatihanUTS {
        public static void main(String[] args) {
        //eneng kalo buat tipe data string jangan adain spasi, nanti spasinya dihitung juga sebagai string
        //sehingga menyebabkan hasil perbandingan tidak sama. misal tadi kan buat kayak gini "001     " nah dibandingkan
        //dengan gini "001" ya bedalah xixixi
        String [][] mhs ={{"001", "Annisa", "3.45"},{"002","Budi","3.25"},
                          {"003", "Cinta","3.56"}, {"004", "Dewi", "3.75"}};
        int i;
        int j;
        boolean cek=false;
      
        System.out.println("Daftar Nama Mahasiswa");
        System.out.println("NIM   " + "Nama    " + "IPK ");
        for (i=0; i <4; i++ ){
            for (j=0; j <3; j++ ){
                System.out.print(mhs[i][j]+"   ");
            }
            System.out.println();
        }
        
        Scanner masukan = new Scanner (System.in);
        System.out.print ("Masukkan NIM Mahasiswa yang di cari : ");
        String nim = masukan.next();

        System.out.println("");
        int index = 0;
        for (i=0; i <4; i++ ){
            if (mhs[i][0].equals(nim)){
                index = i;
                cek=true;
            }
        }
        
        if (cek){
            System.out.println ("NIM  : " + mhs[index][0]);
            System.out.println ("Nama  : " + mhs[index][1]);
            System.out.println ("IPK  : " + mhs[index][2]);
            System.out.print ("Predikat : ");
            if (mhs[index][2].compareTo("3.50")>0 && mhs[index][2].compareTo("4.01")<0){
               System.out.print("Dengan Pujian");
            }
            else if (mhs[index][2].compareTo("3.00")>0 && mhs[index][2].compareTo("3.51")<0){
               System.out.print("Sangat Memuaskan");
            }
            else if (mhs[index][2].compareTo("2.75")>0 && mhs[index][2].compareTo("3.01")<0){
               System.out.print("Memuaskan");
            }
        }
        else{
            System.out.println("Data tidak ditemukan!");
        }
    }
}
