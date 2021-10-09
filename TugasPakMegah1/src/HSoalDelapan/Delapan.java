/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HSoalDelapan;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Delapan {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Banyak Anak Ayam = ");
        int ayam=key.nextInt();
        while(ayam>1){
            System.out.print("Anak ayam turunlah "+ayam);
            ayam--;
            System.out.println(", mati satu tinggal "+ayam);
        }
        System.out.println("Anak ayam turunlah 1, mati satu maka habis");
    }
    
}
