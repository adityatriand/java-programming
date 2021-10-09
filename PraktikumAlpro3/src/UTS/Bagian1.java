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
public class Bagian1 {
    
    public static int untilValid(){
        Scanner input = new Scanner(System.in);
        int angka;
        do{
            System.out.print("Masukkan angka = ");
            angka = input.nextInt();
        }while(angka<5 || angka >50);
        return angka;
    }
    
    public static void main(String[] args) {
        int a = untilValid();
        System.out.println(a);
        
        int b[][] = new int [2][2];
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                b[i][j] = (int)(Math.random()*10);
                System.out.println(b[i][j]+" ");
            }
        }
        int sum = 0;
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                sum += b[i][j];
            }
        }
        System.out.println(sum);
        

    }
}
