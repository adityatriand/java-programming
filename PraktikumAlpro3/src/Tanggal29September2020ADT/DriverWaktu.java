/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal29September2020ADT;

/**
 *
 * @author Adit
 */
public class DriverWaktu {
    public static void main(String[] args) {
        //default
        ADTWaktu W1 = new ADTWaktu();
        System.out.println(W1);
        System.out.println("");
        
        //Valid
        ADTWaktu W2 = new ADTWaktu(20,35,15);
        System.out.println(W2);
        System.out.println("Total Detik : "+W2.waktutoDetik());
        
        //Konversi Detik ke Waktu
        System.out.println("");
        ADTWaktu W3 = ADTWaktu.detiktoWaktu(5400);
        System.out.println(W3);
        
    }
}
