/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal15September2020Matriks;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Latihan2 {
    
    public static void main(String[] args) {
        int a[][] = new int [2][2];
        Scanner input = new Scanner(System.in);
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                do{
                    System.out.println("Baris ke-"+i+"Kolom ke-"+j+" = ");
                    a[i][j]=input.nextInt();
                }while(a[i][j]<0 || a[i][j]>10);
            }
        }
        
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
        }
    }
    
}
