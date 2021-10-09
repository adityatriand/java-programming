/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rumus;

/**
 *
 * @author Adit
 */
public class Pangkat {
    public static void main(String[] args) {
        int a=2,b,jum =0;
        for(int c=1;c<5;c++){
        b = (int) (a*Math.pow(2,c));
            System.out.println(b);
        jum += b;
        }
        System.out.println("Jumlah = "+jum);
    }
    
}
