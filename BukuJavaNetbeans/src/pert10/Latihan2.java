/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pert10;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Latihan2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int data[][]= new int [3][4];
        System.out.println("Masukkan data nilai");
        for(int bar = 1;bar<data.length;bar++){
            for(int kol = 1;kol<data[bar].length;kol++){
                System.out.printf("(%d , %d) = ",bar,kol);
                data[bar][kol]= input.nextInt();}}
        System.out.println("\nData nilai yang dimasukkan");
        for(int bar = 1;bar<data.length;bar++){
            for(int kol = 1;kol<data[bar].length;kol++){
                System.out.printf("%-3d",data[bar][kol]);}
            System.out.println("");}
    } 
}