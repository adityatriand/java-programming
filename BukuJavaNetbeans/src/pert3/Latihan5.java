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
public class Latihan5 {
    public static void main(String[] args){
        //
        int celcius, fahreinheit;
        Scanner keyboard = new Scanner(System.in);

        //
        System.out.println("Konversi Suhu Celcius ke Fahrenheit");
        System.out.println("===================================");
        System.out.print("Masukan Derajat Celcius = ");
        celcius = keyboard.nextInt();

        //
        fahreinheit = (9*celcius/5) + 32;
        System.out.println("Fahreinheit = "+ fahreinheit);

    }

}
