/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PSoalLimabelas;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class LimaBelas {
    public static void main(String[] args) {
        int banyak,a;
        Scanner i = new Scanner(System.in);
        System.out.print("Tinggi Segitiga = ");
        banyak = i.nextInt();
        for(a=0;a<banyak;a++){
            for(int b=banyak-1;b>=a;b--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
