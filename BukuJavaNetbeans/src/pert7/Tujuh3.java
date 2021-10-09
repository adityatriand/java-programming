/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pert7;
import java.util.Scanner;
/**
 *
 * @author Adit
 */
public class Tujuh3 {
    public static void main(String[] args) {
        int A,B = 1,C;
        float rata,jumlah=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Banyaknya Data = ");
        A = input.nextInt();
        while(B<=A){
            System.out.print("Data ke-"+B+" = ");
            C=input.nextInt();
            jumlah += C;
            B++;
        }
        System.out.println("Jumlah = "+jumlah);
        rata = jumlah/A;
        System.out.println("Rata Rata = "+rata);

    }
    
}
