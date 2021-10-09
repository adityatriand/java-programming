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
public class SukuSuku1 {
    public static void main(String[] args) {
        int jum = 0,n,i,u = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Banyak Suku = ");
        n = input.nextInt();
        System.out.print("Sukunya = ");
        for(i=1;i<=n;i++){
            if (i%2==0){u += 3;}
            else {u += 2;}
            System.out.printf("%d,",u);
            jum += u;
            }
        System.out.println("\nJumlah suku ke-"+n+" = "+jum);
        }
    }
