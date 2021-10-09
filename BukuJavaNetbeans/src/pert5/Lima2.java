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
public class Lima2 {
    public static void main(String[] args){
        //
        int bil;
        Scanner keyboard = new Scanner(System.in);
        //
        System.out.print("Masukan Bilangan = ");
        bil = keyboard.nextInt();
        System.out.println("Bilangan = " + bil);
        if (bil==0){
        System.out.println("Bilangan Nol");}
        else{
        System.out.println("Bilangan Bukan Nol");}
        
    }

}
