/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class CobaPrak {
//    public static void my(int a){
//        int b =9;
//        a = a+b;
//    }
    
    public static void main(String[] args) {
        int a [] = {8,5,6,2,3,1,2,4};
        int max = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.print("Data = ");
        for (int i = 0; i <a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        
        System.out.println("Nilai Terbesar dari data = "+max);
        
//        int a = 8;
//        my(a);
//        System.out.println(a);
//        int x =0;
//        int y=0;
//        while(x<8){
//            x++;
//            y += x;
//            System.out.println(x+y+" ");
//            x++;
//            System.out.println("a");
//        }


    }
}
