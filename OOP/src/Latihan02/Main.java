/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan02;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double value;
        Segitiga s = new Segitiga();
        System.out.print("a = ");
        value  = input.nextDouble();
        s.setA(value);
        System.out.print("b = ");
        value = input.nextDouble();
        s.setB(value);
        System.out.print("c = ");
        value = input.nextDouble();
        s.setC(value);
        s.cetakKeliling();
        
        System.out.println();
        
        PersegiPanjang p = new PersegiPanjang();
        System.out.print("Panjang = ");
        value = input.nextDouble();
        p.setPanjang(value);
        System.out.print("Lebar = ");
        value = input.nextDouble();
        p.setLebar(value);
        System.out.println("Apakah berbentuk bujur sangkar = "+p.cekBujurSangkar());
        p.cetakKeliling();
        
        System.out.println();
        
        Lingkaran l = new Lingkaran();
        System.out.print("Jari-jari = ");
        value = input.nextDouble();
        l.setR(value);
        l.cetakKeliling();
        boolean cek = true;
        while(cek){
            System.out.print("Apakah ingin melakukan pembesaran jari-jari (Y/N) ? ");
            char in = input.next().charAt(0);
            if(in == 'Y'){
                System.out.print("x = ");
                value = input.nextDouble();
                l.scale(value);
                cek = false;
            }
            else cek = false;
        }
        l.cetakKeliling();
    }
}
