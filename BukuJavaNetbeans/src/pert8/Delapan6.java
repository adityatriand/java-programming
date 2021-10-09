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
public class Delapan6 {
    public static void main(String[] args) {
        int nilai, a;
        Scanner input = new Scanner(System.in);
        System.out.print("Tinggi Segitiga = ");
        nilai = input.nextInt();
        for(a=1;a<=nilai;a++){
            for(int b=1;b<=a;b++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
