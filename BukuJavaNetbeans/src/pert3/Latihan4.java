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
public class Latihan4 {
    public static void main(String[] args){
        int r;
        double luas;
        Scanner keyboard = new Scanner(System.in);

        //
        System.out.println("LUAS LINGKARAN");
        System.out.println("==============");

        //
        System.out.print("Panjang Jari Jari = ");
        r = keyboard.nextInt();
        //

        luas = 3.14*r*r;
        System.out.println("Luas = " + luas);

    }

}
