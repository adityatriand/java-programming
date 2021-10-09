/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QSoalEnambelas;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class EnamBelas {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        int angka;
        System.out.print("Masukkan angka digital = ");
        angka = input.nextInt();
        Lampu(angka);
    }
    
    static void Lampu(int a){
        if (a==0){
            System.out.println("1=ON,2=ON,3=ON,4=ON");
        }
        else if (a==1){
            System.out.println("1=OFF,2=ON,3=OFF,4=OFF");
        }
        else{
            System.out.println("Input Salah");
        }
    }
}
