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
public class DelapanFor {
    public static void main(String[] args){
       int n;
       Scanner input = new Scanner(System.in);
       System.out.print("Banyak anak ayam = ");
       n = input.nextInt();
       for(int i=n;i>1;i--){
       System.out.println("Anak ayam turunlah "+i+", mati satu tinggal "+(i-1));     
       }
        System.out.println("Anak ayam turunlah 1, mati satu maka habis");
    }
    
}
