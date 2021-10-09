/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Satu {
    public static void main(String[] args) {
        double A,B,C,rata;
        Scanner masuk = new Scanner(System.in);
        System.out.println("PENGHITUNG NILAI RATA RATA 3 MATA KULIAH");
        System.out.println("========================================");
        System.out.print("Masukan Nilai Alpro 1 = ");
        A = masuk.nextDouble();
        System.out.print("Masukan Nilai Fisika  = ");
        B = masuk.nextDouble();
        System.out.print("Masukan Nilai Agama   = ");
        C = masuk.nextDouble();
        rata = (A+B+C)/3;
        System.out.println("Rata Rata = "+rata);
    }
    
}
