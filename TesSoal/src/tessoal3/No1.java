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
public class No1 {
    public static void main(String args[]){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Tinggi Segitiga = ");
        n = input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print("#");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
    
}
