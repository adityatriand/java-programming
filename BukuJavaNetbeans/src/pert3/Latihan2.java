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
public class Latihan2 {
    public static void main(String[] args){
        //
        double depan, samping, A;
        double miring;
        Scanner keyboard = new Scanner(System.in);

        //
        System.out.println("SISI MIRING SEGITIGA");
        System.out.println("====================");
        
        System.out.print("Sisi Depan = ");
        depan = keyboard.nextInt();

        System.out.print("Sisi Samping = ");
        samping = keyboard.nextInt();

        A = Math.pow(depan,2)+Math.pow(samping,2);
        miring = Math.sqrt(A);
        System.out.println("Sisi Miring = " + miring);
    }

}
