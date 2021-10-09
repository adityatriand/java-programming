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
public class Soal1 {
    
    static int SegiEmpat(int p, int l){
        int luas = p*l;
        return luas;
    }
    
    static void Harga(int a){
        int bayar = 2000000*a;
        System.out.println("1. Harga = "+bayar);
    }
    
    static int Luas1(int P,int L ){
        int luas1 = 2*P*L;
        return luas1;
    }
    
    static int Luas2(int L,int T){
        int luas2 = 2*L*T;
        return luas2;
    }
    
    static int Luas3(int P,int T){
        int luas3 = 2*P*T;
        return luas3;
    }

    static void LuasSelimutBalok(){
        Scanner input = new Scanner(System.in);
        int P,L,T;
        System.out.print("2. Panjang = ");
        P = input.nextInt();
        System.out.print("   Lebar = ");
        L = input.nextInt();
        System.out.print("   Tinggi = ");
        T = input.nextInt();
        int luastot = Luas1(P,L)+Luas2(L,T)+Luas3(P,T);
        System.out.println("   Luas Selimut Balok = "+luastot);
    }
    
    public static void main(String[] args) {
        Harga(SegiEmpat(10,20));
        LuasSelimutBalok();
    }
}
