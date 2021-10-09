/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pert10;

/**
 *
 * @author Adit
 */
public class Latihan1 {
    public static void main(String[] args){
        int a,b, data[][] ={{70,18,45},{75,66,89}};
        for (a=0;a<data.length;a++){
            for (b=0;b<data[a].length;b++){
            System.out.printf("%-5d",data[a][b]);
        }
            System.out.println("");
    }
   }
}
