/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pert3;
import java.util.Scanner;
/**
 *
 * @author Winxp3
 */
public class Latihan3 {
    public static void main(String[] args){
        //
        int S, panjang;
        Scanner keyboard = new Scanner(System.in);

        //
        System.out.println("KELILING BUJUR SANGKAR");
        System.out.println("======================");

        System.out.print("Panjang Sisi = ");
        S = keyboard.nextInt();

        panjang = 4*S;
        System.out.println("Keliling = " + panjang);
        
    }

}
