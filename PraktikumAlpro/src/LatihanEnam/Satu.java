/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanEnam;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Satu {
    public static void main(String[] args){
        int angka;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka = ");
        angka = input.nextInt();
        if (angka == 0){System.out.println("Bilangan nol");}
        else if (angka>0){System.out.println("Bilangan Positif");}
        else if (angka<0){System.out.println("Bilangan Negatif");}
    }
    
}
