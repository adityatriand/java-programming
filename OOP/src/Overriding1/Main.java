/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding1;

/**
 *
 * @author Adit
 */
public class Main {
    public static void main(String[] args) {
        Analis peg1 = new Analis();
        peg1.setTunjangan(500000);
        System.out.println("Gaji Anda = "+peg1.hitungGaji());
        
        Designer peg2 = new Designer();
        peg2.setTunjangan(1000000);
        peg2.setBonus(500000);
        System.out.println("Gaji Anda = "+peg2.hitungGaji());
        
        Programmer peg3 = new Programmer();
        peg3.setTunjangan(2000000);
        peg3.setBonus(500000);
        peg3.setLembur(100000);
        System.out.println("Gaji Anda = "+peg3.hitungGaji());
        
    }
}
