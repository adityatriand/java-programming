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
public class Lima1 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int bil;
        //
        System.out.print("Masukan Bilangan = ");
        bil = keyboard.nextInt();
        if (bil==0)
        System.out.println("Bilangan Nol");
        else
        System.out.println("Bilangan Bukan Nol");
        
    }

}
