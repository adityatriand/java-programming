/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pert8;
import java.util.Scanner;
/**
 *
 * @author Adit
 */
public class Delapan4 {
    public static void main(String[] args) {
        int i;
        float n, jum=0, nilai,rata;
        Scanner input = new Scanner(System.in);
        System.out.print("Banyaknya Data = ");
        n = input.nextFloat();
        for (i=1;i<=n;i++){
            System.out.print("Data ke-"+i+" = ");
            nilai = input.nextFloat();
            jum += nilai;
        }
        System.out.println("Jumlah = "+jum);
        rata = jum/n;
        System.out.println("Rata - Rata = "+rata);
    }
    
}
