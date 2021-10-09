/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KSoalSebelas;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Sebelas {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menghitung Luas Total");
        System.out.println("=============================");
        System.out.println("Mohon Perhatikan Gambar yang ada di soal");
        System.out.print("Masukkan nilai a = ");
        int a = input.nextInt();
        System.out.print("Masukkan nilai b = ");
        int b = input.nextInt();
        System.out.print("Masukkan nilai c = ");
        int c = input.nextInt();
        System.out.print("Masukkan nilai d = ");
        int d = input.nextInt();
        System.out.print("Masukkan nilai A = ");
        int A = input.nextInt();
        System.out.print("Masukkan nilai T = ");
        int T = input.nextInt();
        int luas1=LuasPersegiPanjang(b,a);
        int luas2=LuasPersegiPanjang(d,c);
        float luas3=LuasSegitiga(A,T);
        float luastotal = LuasTotal(luas1,luas2,luas3);
        System.out.println("Luas Total = "+luastotal);
    }
    
    static int LuasPersegiPanjang(int pjg,int lbr){
        int luas = pjg*lbr;
        return luas;
    }
    
    static float LuasSegitiga(int alas,int tinggi){
        float luas = (float)(alas*tinggi)/2;
        return luas;
    }
    
    static float LuasTotal(int a,int b,float c){
        float luastot = (float)a+b+c;
        return luastot;
    }
}
