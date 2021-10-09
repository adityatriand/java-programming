/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pert5;
import java.util.Scanner;
/**
 *
 * @author Winxp3
 */
public class Latihan1 {
    public static void main(String[] args){
        int a,b,c,D;
        Scanner keyboard = new Scanner(System.in);
        //
        System.out.print("Masukan Nilai a = ");
        a = keyboard.nextInt();
        System.out.print("Masukan Nilai b = ");
        b = keyboard.nextInt();
        System.out.print("Masukan Nilai c = ");
        c = keyboard.nextInt();
        //
        D = b*b-4*a*c;
        System.out.println("Nilai D = " + D);
        if(D==0)
            System.out.println("Akar Kembar");
        if(D>0)
            System.out.println("Akar Beda");
        if(D<0)
            System.out.println("Akar Imajiner");
    }

}
