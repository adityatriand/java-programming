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
public class Bagian5No1 {
    public static void main(String[] args) {
        int A,B,C;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai Panjang = ");
        A = input.nextInt();
        System.out.print("Masukan Nilai Lebar = ");
        B = input.nextInt();
        C=A*B;
        System.out.println("Luas Persegi Panjang = "+C);
    }
    
}
