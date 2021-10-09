/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanDelapan;

/**
 *
 * @author Adit
 */
public class SegitigaAngka {
    public static void main(String [] args){
        int banyak = 4;
            for (int baris=1;baris<=banyak;baris++){
            
            for (int enter=baris;enter<=banyak;enter++){
                System.out.print(" ");
            }
            for (int angka=0;angka<=(2*baris)-2;angka++){
                System.out.print(baris);
            }
            System.out.println("");
            }
        
    }
    
}
