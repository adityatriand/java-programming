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
public class Tujuh22 {
    public static void main(String[] args){
        int bil1=2,bil2=1;
        String A;
        Scanner input = new Scanner(System.in);
        System.out.println("Bilangan Genap");
        do {
            System.out.println(bil1);
            bil1+=2;
        }
        while(bil1<=10);
        System.out.println("Bilangan Ganjil");
        do{
            System.out.println(bil2);
            bil2+=2;
        }
        while(bil2<=10);
    }
}
