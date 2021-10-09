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
public class Empat {
    public static void main(String[] args){
        int gaji = 5000000, gol, bonus;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Golongan = ");
        gol = input.nextInt();
        if(gol==1){bonus = 500000;
            System.out.println("Gaji Anda = "+(gaji+bonus));}
        else if (gol==2){bonus = 1000000;
            System.out.println("Gaji Anda = "+(gaji+bonus));}
        else if (gol==3){bonus = 2000000;
            System.out.println("Gaji Anda = "+(gaji+bonus));}
        else{System.out.println("Maaf Pilihan Anda Salah !!");}
        
    }  
    }
    

