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
public class empat2 {
    public static void main(String[] args){
        int celcius;
        float fahreinheit, reamur, kelvin;
        Scanner keyboard = new Scanner(System.in);
        //
        System.out.print("Masukan derajat Celcius = ");
        celcius = keyboard.nextInt();
        //
        fahreinheit = 9f/5f * celcius + 32f;
        System.out.println("Fahreinheit = " + fahreinheit);
        //
        reamur = 4f/5f * celcius;
        System.out.println("Reamur = " + reamur);
        //
        kelvin = celcius + 273;
        System.out.println("Kelvin = " + kelvin);
    }

}
