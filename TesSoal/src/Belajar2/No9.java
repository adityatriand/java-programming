/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Belajar2;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class No9 {
    public static void main(String [] args){
        int a = 3, b=3,n,S;
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        n = input.nextInt();
        S = n*(2*a+(n-1)*b)/2;
        System.out.println("S = "+S);
        int jumlah = Suku2(n);
        System.out.println("S = "+jumlah);
    }
    
    static int Suku2(int n){
        int S = 0, u = 0;
        for(int i = 1; i <= n;i++){
            u = 3*i;
            S += u;
        }
        return S;
    }
}
