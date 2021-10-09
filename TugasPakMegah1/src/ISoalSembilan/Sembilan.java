/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISoalSembilan;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Sembilan {
    public static void main(String[] args) {
        int a,b,n,S;
        a=3;
        b=3;
        Scanner input = new Scanner(System.in);
        System.out.println("MENGHITUNG JUMLAH SUKU KE - n");
        System.out.println("=============================");
        System.out.print("n = ");
        n = input.nextInt();
        S = n*(2*a+(n-1)*b)/2;
        System.out.println("S = "+S);
    }
}
