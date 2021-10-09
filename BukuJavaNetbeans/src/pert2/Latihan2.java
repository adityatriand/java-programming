/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pert2;
import java.util.Scanner;
/**
 *
 * @author Winxp3
 */
public class Latihan2 {
    public static void main(String[] args){
        //
        String nama;
        int usia;
        Scanner keyboard = new Scanner(System.in);

        //
        System.out.print("Nama = ");
        nama = keyboard.nextLine();

        System.out.print("Usia = ");
        usia = keyboard.nextInt();

        //
        System.out.println("Heiyo,"+nama+"! Usiamu "+usia+" tahun, ya?");
    }
}
