/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materi;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
class data
{
    String nama;
    int Sem;
    String NIM;
}

public class Adt {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int banyak;
        System.out.print("Banyak Data = ");
        banyak = input.nextInt();
        data [] data_mahasiswa = new data [banyak];
        for(int i=0;i<data_mahasiswa.length;i++)
        {
            System.out.println("\nData ke-"+(i+1));
            data_mahasiswa[i]= new data();
            System.out.print("Nama Panggilan Mahasiswa (cukup satu kata) = ");
            data_mahasiswa[i].nama = input.next();
            System.out.print("Semester = ");
            data_mahasiswa[i].Sem = input.nextInt();
            System.out.print("NIM = ");
            data_mahasiswa[i].NIM = input.next();
        }
        
        System.out.println("\nData Mahasiswa");
        System.out.println("==============");
        for(int i=0;i<data_mahasiswa.length;i++)
        {
            System.out.println("\n"+(i+1)+". Nama = "+data_mahasiswa[i].nama);
            System.out.println("   Semeseter = "+data_mahasiswa[i].Sem);
            System.out.println("   NIM = "+data_mahasiswa[i].NIM);
        }
    }
}
