/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tessoal3;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class No4 {
    public static void main(String args[]){
        int n,r,permutasi,N=1,R=1;
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        n = input.nextInt();
        System.out.print("r = ");
        r = input.nextInt();
        if(n>=r){
            for(int i=n;i>=1;i--){
                N = i*N;
            }
            for(int j=n-r;j>=1;j--){
                R = j*R;
            }
            permutasi = N/R;
            System.out.println("Permutasinya = "+permutasi);
        }
        else{
            System.out.println("Nilai n harus lebih besar atau sama dengan r");
        }
    }
    
}
