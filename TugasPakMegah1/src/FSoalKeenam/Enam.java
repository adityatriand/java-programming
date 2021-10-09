/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FSoalKeenam;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Enam {
    public static void main(String[] args) {
        int minum, gelas, bayar = 0, n=0;
        double potong,total, totalakhir =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Minuman Yang Tersedia");
        System.out.println("1.Milo = Rp.7.500/gelas\n2.Kopi = Rp.4.000/gelas\n"
                +"3.Teh Botol = Rp.3.500/gelas\n4.Jus Mangga = Rp.5.000/gelas");
        System.out.println("=============================");
        for (String tambah = "y";tambah.equals("y")||tambah.equals("Y");){
        System.out.print("Ketik disini kode minuman yang ingin dipesan  = ");
        minum=input.nextInt();
        if(minum==1){
            System.out.print("Berapa Gelas = ");
            gelas = input.nextInt();
            bayar = Milo(gelas);
        }
        else if(minum==2){
            System.out.print("Berapa Gelas = ");
            gelas = input.nextInt();
            bayar = Kopi(gelas);
        }
        else if(minum==3){
            System.out.print("Berapa Gelas = ");
            gelas = input.nextInt();
            bayar = Teh(gelas);
        }
        else if(minum==4){
            System.out.print("Berapa Gelas = ");
            gelas = input.nextInt();
            bayar = Juz(gelas);
        }
        else{
            System.out.println("Input Salah");
        }
        n+=bayar;
        System.out.print("Apakah anda ingin menambah pesanan ? (y/t) = ");
        tambah = input.next();          
        }

        if(n>100000){
            potong = 0.15*n;
        }
        else if(n>=50000&&n<=100000){
            potong = 0.075*n;
        }
        else{
            potong = 0 ;
        }

        total = n-potong;
        System.out.println("Total Bayar = "+total);
    }
    
    static int Milo(int a){
        int Harga = a*7500;
        return Harga;
    }
    
    static int Kopi(int b){
        return b*4000;
    }
    
    static int Teh(int c){
        return c*3500;
    }
    
    static int Juz(int d){
        return d*5000;
    }
} 

