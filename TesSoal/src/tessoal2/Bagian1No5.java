/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tessoal2;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Bagian1No5 {
    public static void main(String[] args) {
        int X;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai X = ");
        X=input.nextInt();
        if (X>80){System.out.println("Grade Anda Adalah A");}
        if(X>70 && X<=80){System.out.println("Grade Anda Adalah B");}
        if(X>60 && X<=70){System.out.println("Grade Anda Adalah C");}
    }
    
}
