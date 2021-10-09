/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal25Agustus2020Kondisi;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Switch 
{
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        char kelas;
        System.out.print("Masukkan kelas anda = ");
        kelas = input.next().charAt(0);
        switch(kelas)
        {
            case 'A' : System.out.println("Anda termsuk kelas A");break;
            case 'B' : System.out.println("Anda termasuk kelas B");break;
            case 'C' : System.out.println("Anda termasuk kelas C");break;
            default  : System.out.println("Anda tidak terdaftar di kelas manapun");break;
        }
        
        
        
    }
    
}
