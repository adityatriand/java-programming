/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cp;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class tes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int L = input.nextInt();
        for(int i=0;i<N;i++){
            if(i>=L && i<(N-L)){
              for(int j=0;j<M;j++){
                if(j<L)System.out.print("*");
                else System.out.print(".");
              }
            }
            else{
                for(int j=0;j<M;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
