/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanTiga;

/**
 *
 * @author Adit
 */
public class Tiga {
    public static void main(String[] args) {
        //
        int s,luaspersegi,r,p,l,luaspersegipanjang, A;
        double luaslingkaran, phi, B, C, D;
        s = 10;
        luaspersegi = s*s;
        System.out.println("Luas Persegi = "+luaspersegi);
        //
        r=5;
        phi=3.14;
        luaslingkaran = phi*r*r;
        System.out.println("Luas Lingkaran = "+luaslingkaran);
        //
        p=3;
        l=2;
        luaspersegipanjang=p*l;
        System.out.println("Luas Persegi Panjang = "+luaspersegipanjang);
        //
        A = luaspersegi + luaspersegipanjang;
        System.out.println("L.Persegi + L.Persegi Panjang = "+A);
        B = luaslingkaran + luaspersegi;
        System.out.println("L.Lingkaran + L.Persegi = "+B);
        C= luaspersegipanjang + luaslingkaran;
        System.out.println("L.Lingkaran + L.Persegi Panjang = "+C);
        D= luaspersegipanjang + luaslingkaran + luaspersegi;
        System.out.println("Luas Total = "+D);
    }
    
}
