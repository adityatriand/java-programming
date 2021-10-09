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
public class Tujuh33 {
    public static void main(String[] args){
        int data,urutan=1,nilai;
        float rata, jumlah=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Banyaknya Data = ");
        data = input.nextInt();
        do{
            System.out.print("Data ke-"+urutan+" = ");
            nilai = input.nextInt();
            jumlah += nilai;
            urutan++;
        }
        while (urutan<=data);
        System.out.println("Jumlah = "+jumlah);
        rata = jumlah/data;
        System.out.println("Rata Rata = "+rata);
    }
}
