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
public class Latihan1 {
    public static void main(String[] args){
        //
        int a, b;
        boolean A, B, C, D, E, F;
        Scanner keyboard = new Scanner(System.in);

        //
        System.out.print("a = ");
        a = keyboard.nextInt();
        System.out.print("b = ");
        b = keyboard.nextInt();

        //
        A = a<b;
        System.out.println("a<b  = " + A);
        B = a>b;
        System.out.println("a>b  = " + B);
        C = a<=b;
        System.out.println("a<=b = " + C);
        D = a>=b;
        System.out.println("a>=b = " + D);
        E = a==b;
        System.out.println("a==b = " + E);
        F = a!=b;
        System.out.println("a!=b = " + F);
    }

}
