/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pert4;
import java.util.Scanner;
/**
 *
 * @author Winxp3
 */
public class empat3 {
    public static void main(String[] args){
        //
        int r, t;
        double volume;
        Scanner keyboard = new Scanner(System.in);
        //
        System.out.print("Masukan Panjang Jari Jari = ");
        r = keyboard.nextInt();
        System.out.print("Masukan Panjang Tinggi = ");
        t = keyboard.nextInt();
        //
        System.out.println("=============");
        System.out.println("Volume Tabung");
        System.out.println("=============");
        System.out.println("Jari-Jari = " + r + " cm");
        System.out.println("Tinggi = " + t + " cm" );
        volume = 3.14 * r * r * t;
        System.out.println("Volume Tabung = " + volume + " cm");
    }

}
