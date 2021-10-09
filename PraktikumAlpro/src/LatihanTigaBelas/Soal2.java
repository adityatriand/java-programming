/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanTigaBelas;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Soal2 {
    static Scanner input = new Scanner(System.in);
    
    static float LuasSegitiga1(int a, int t){
        int luas = (a*t)/2;
        return luas;
    }
    
    static void LuasSegitiga2(){
        System.out.print("\n2. Tinggi = ");
        int t = input.nextInt();
        System.out.print("   Alas   = ");
        int a = input.nextInt();
        float Luas = (float) (a*t)/2;
        System.out.println("   Luas Segitiga = "+Luas);
    }
    
    static int Faktor(int i){
        int e = i-1;
        if(e==1){
            return i;
        }
        return i*Faktor(e);
    }
    
    public static void main(String[] args) {
        System.out.print("1. Tinggi = ");
        int t = input.nextInt();
        System.out.print("   Alas   = ");
        int a = input.nextInt();
        float Luas = (float)LuasSegitiga1(a,t);
        System.out.println("   Luas Segitiga = "+Luas);
        LuasSegitiga2();
        System.out.println("Masukkan Nilai yang ingin difaktorial = ");
        int c = input.nextInt();
        int d = Faktor(c);
        System.out.println(d);
    }
}
