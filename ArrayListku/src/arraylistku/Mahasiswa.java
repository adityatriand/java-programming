/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Mahasiswa {

    String NIM;
    String Nama;
    String Alamat;
    
    public Mahasiswa(String NIM, String Nama, String Alamat) 
    {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
    }
    public static Scanner input = new Scanner(System.in);
    public static Scanner input1 = new Scanner (System.in);
    public static ArrayList<Mahasiswa> listmahasiswa = new ArrayList<>();
    
    public String getNIM() 
    {
        return NIM;
    }
    
    public String getNama() 
    {
        return Nama;
    }
    
    public String getAlamat() 
    {
        return Alamat;
    }
    
    public static void insertData(String NIM, String Nama, String Alamat) 
    { 
        Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat); 
        listmahasiswa.add(mhs); 
    }
    public static ArrayList<Mahasiswa> getALL() { 
        return listmahasiswa; 
    }
    public static void deleteData(int index) { 
        listmahasiswa.remove(index);
    }
    
    public static void input (int a)
    {
        String b,c,d;
        for(int i=0;i<a;i++)
        {
            System.out.print("\nNama : ");
            b = input1.nextLine();
            System.out.print("NIM : ");
            c= input1.nextLine();
            System.out.print("Alamat :");
            d= input1.nextLine();
            Mahasiswa.insertData(b, c, d);
        }
    }
    
     public static void main(String[] args) {
         System.out.print("Banyak data yang akan diinput : ");
         int banyak = input.nextInt();
         input(banyak);
         System.out.println("\nData Mahasiswa dalam ArrayList");
         for(Mahasiswa mhs : Mahasiswa.getALL())
         {
             System.out.println("\nNIM : "+mhs.getNIM());
             System.out.println("Nama : "+mhs.getNama());
             System.out.println("Alamat : "+mhs.getAlamat());
         }
     }
}
