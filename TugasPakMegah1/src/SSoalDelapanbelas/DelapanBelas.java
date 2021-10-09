/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SSoalDelapanbelas;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class DelapanBelas {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         int elemen = 10,banyak[], i, minimum;
         banyak = new int [elemen];
         for(i=0;i<elemen;i++){
             System.out.print("Elemen ke-"+(i+1)+" = ");
             banyak[i] = input.nextInt();
         }
         minimum = banyak[0];
         for (i=0;i<elemen;i++){
             if (banyak[i]< minimum){
                 minimum = banyak[i];
             }
         }
         System.out.println("Nilai Terkecil Adalah "+minimum);
    }  
}
