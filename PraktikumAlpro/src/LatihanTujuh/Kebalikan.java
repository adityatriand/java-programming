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
public class Kebalikan {
    public static void main(String[] args){
        int banyak;
        Scanner input = new Scanner(System.in);
        System.out.print("Banyak Segitiga = ");
        banyak = input.nextInt();
        for(int i=1;i<=banyak;i++){
            for(int a=1;a<=i;a++){
               System.out.print("*");
            }
            System.out.println("");
        }
        for(int b=1;b<=banyak;b++){
            for(int c=banyak;c>b-1;c--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }   
}
