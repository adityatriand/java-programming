/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pert9;

/**
 *
 * @author Adit
 */
public class BanyakHari {
    public static void main(String[] args) {
        int b, bulan[];
        bulan = new int [12];
        bulan [0]= 31;bulan [1]= 28;bulan [2]= 31; bulan [3]= 30; bulan [4]= 31;
        bulan [5]= 30;bulan [6]= 30;bulan [7]= 31;bulan [8]=30;bulan [9]= 31;
        bulan [10]= 30;bulan [11]= 31;
        for(b=0;b<12;b++){
            System.out.println("Bulan "+(b+1)+" = "+bulan[b]+" Hari");
        }
      }  
}
