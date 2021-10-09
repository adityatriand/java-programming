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
public class empat1 {
    public static void main(String[] args){
        //
        float m, cm, inci;
        Scanner keyboard = new Scanner(System.in);
        //
        System.out.print("Masukan ukuran dalam M = ");
        m = keyboard.nextFloat();
        cm = m * 100;
        inci = m * 100 /2.54f;
        System.out.println("Ukuran dalam CM = " + cm);
        System.out.println("Ukuran dalam Inci = " + inci);
        
    }

}
