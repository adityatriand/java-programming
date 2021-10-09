/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asalpro1;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int banyak = input.nextInt();
        for (int i = banyak; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(j==(i-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
