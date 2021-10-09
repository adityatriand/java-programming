/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pert8;
import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Delapan7 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Tinggi Segitiga = ");
        int tinggi = key.nextInt();
        //baris ke bawah
        for (int baris=1;baris<=tinggi;baris++){
            //pembentuk piramid(spasinya)
            for (int enter=baris;enter<=tinggi;enter++){
                System.out.print(" ");
            }
            //banyak bintang
            for (int bintang=0;bintang<=(2*baris)-2;bintang++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }    
}
