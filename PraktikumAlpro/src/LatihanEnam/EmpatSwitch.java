/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanEnam;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class EmpatSwitch {
    public static void main(String[] args){
        int gaji = 5000000, gol, bonus = 0, gajitotal;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan golongan = ");
        gol = input.nextInt();
        switch (gol){
            case 1:bonus = 500000;break;
            case 2:bonus = 1000000;break;
            case 3:bonus = 2000000;break;
            default:break;
        }
        gajitotal = gaji + bonus;
        System.out.println("Gaji total = "+gajitotal);
       
    }
    
}
