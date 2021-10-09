/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asalpro1;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class AsAlpro1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float yen = 5;
        float rupiah = yen*140;
        
        System.out.println("KONVERSI YEN KE RUPIAH");
        System.out.println("======================");
        System.out.println("Yen : "+yen);
        System.out.println("Rupiah : Rp."+rupiah);
        
        int a;
        int b;
        
        System.out.println("PEMBANDING NILAI");
        System.out.println("================");
        System.out.print("A : ");
        a = input.nextInt();
        System.out.print("B : ");
        b = input.nextInt();
        if(a>b){
            System.out.println("Nilai "+a+" lebih besar dari "+b);
        }
        else if(a<b){
            System.out.println("Nilai "+b+" lebih besar dari "+a);
        }
        else{
            System.out.println("Nilai "+a+" sama dengan "+b);
        }
    }
    
}
