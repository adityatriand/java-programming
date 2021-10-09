/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BelajarUTS;

import java.io.IOException;

/**
 *
 * @author Adit
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ADTJualan orang1 = new ADTJualan();
        orang1.inputData();
        ADTJualan orang2 = new ADTJualan("Budi Setiawan",4);
        ADTJualan orang3 = new ADTJualan("Yuyun Yuniar",5);
        System.out.println("============================");
        System.out.println(orang1);
        System.out.println(orang2);
        System.out.println(orang3);
        System.out.println("============================");
        ADTBayar bayar1 = new ADTBayar(orang1);
        ADTBayar bayar2 = new ADTBayar(orang2);
        ADTBayar bayar3 = new ADTBayar(orang3);
        System.out.println(bayar1);
        System.out.println(bayar2);
        System.out.println(bayar3);
        System.out.println("============================");
        double a = ADTBayar.pay(bayar1.getA().getBeli());
        double b = ADTBayar.pay(bayar2.getA().getBeli());
        double c = ADTBayar.pay(bayar3.getA().getBeli());
        double pendapatan = a+b+c;
        int totalJual= orang1.getBeli()+orang2.getBeli()+orang3.getBeli();
        System.out.println("Total Barang Terjual = "+totalJual);
        System.out.println("Total Pendapatan     = "+pendapatan);
        
        
    }
}
