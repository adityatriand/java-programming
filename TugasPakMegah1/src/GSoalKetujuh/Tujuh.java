/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GSoalKetujuh;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Tujuh {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Masukan Nilai Anda = ");
        int nilai = key.nextInt();
        System.out.print("Grade Anda Adalah = ");
        if(nilai>=0 && nilai<=30){System.out.println("E");}
        else if(nilai>30 && nilai<=50){System.out.println("D");}
        else if(nilai>50 && nilai<=70){System.out.println("C");}
        else if(nilai>70 && nilai<=80){System.out.println("B");}
        else{System.out.println("A");}
    }
}
