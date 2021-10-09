/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanTujuh;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class SukuSuku {
    public static void main(String[] args) {
        int jumlah = 0,n,u;
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        n = input.nextInt();
        u = 3*n;
        System.out.println("Suku ke-"+n+" = "+u);
        for(int i=1;i<=n;i++){
        jumlah = jumlah+3*i;
        }
        System.out.println("Jumlah Suku ke-"+n+" adalah "+jumlah);
    }
    
}
