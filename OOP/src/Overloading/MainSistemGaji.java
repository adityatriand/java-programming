/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

/**
 *
 * @author Adit
 */
public class MainSistemGaji {
    public static void main(String[] args) {
        SistemGaji sg = new SistemGaji();
        sg.hitungGaji(2000000, 500000);
        
        System.out.println("Gaji Anda = "+sg.hitungGaji(1500000, 1000000, 500000));
        
        int totalGaji = sg.hitungGaji(2000000, 1000000, 500000, 50000);
        System.out.println("Gaji Anda = "+totalGaji);
    }
}
