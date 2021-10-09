/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Belajar1;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class ReturnArray {
    
    static int [] nilai(){
        Scanner input = new Scanner(System.in);
        int a[] = new int [3];
        for(int i=0;i<a.length;i++){
            System.out.print("Nilai "+(i+1)+" = ");
            a[i]=input.nextInt();
        }
        return a;
    }
    
    public static void main(String[] args) {
        int b[]= nilai();
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
