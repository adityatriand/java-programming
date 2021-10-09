/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanTujuh;
import java.util.Scanner;
/**
 *
 * @author Adit
 */
public class Diamond {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Tinggi Segitiga = ");
        int tinggi = key.nextInt();
        //baris ke bawah
        for (int baris=1;baris<=tinggi;baris++){
            //pembentuk piramid(spasinya)
            for (int enter=baris;enter<=tinggi;enter++){
                System.out.print("#");
            }
            //banyak bintang
            for (int bintang=0;bintang<=(2*baris)-2;bintang++){
                System.out.print("*");
            }
            for(int b=tinggi;b>=baris;b--){
                System.out.print("#");
            }
            System.out.println("");
        }
            for (int baris=1;baris<=tinggi;baris++){ 
            for(int b=1;b<=baris;b++){
                System.out.print("#");
            }
             for (int bintang=tinggi;bintang>=(2*baris)-tinggi;bintang--){
                System.out.print("*");
            }
            for (int enter=0;enter<=baris-1;enter++){
                System.out.print("#");
            }
            System.out.println("");
            }
    }
}
