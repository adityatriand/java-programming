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
public class Suku_ke_n {
    public static void main(String[]args){
        int jum=0,u,n,i;
        Scanner input = new Scanner(System.in);
        System.out.print("Banyak suku = ");
        n = input.nextInt();
        for(i=1;i<=n;i++){
        u = 3*i;
        System.out.println("Suku ke-"+i+" = "+ u);
        jum += u;
        System.out.println("Jumlah Suku ke-"+i+" = "+jum+"\n");
        }
    }
}
