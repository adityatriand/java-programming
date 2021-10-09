/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pendalaman;

/**
 *
 * @author Adit
 */
public class Main {
    public static void main(String[] args) {
        SegiEmpat bangun1 = new SegiEmpat();
        bangun1.setP(3,10);
        bangun1.setQ(3,10);
        System.out.println(bangun1);
        System.out.println("Panjang = "+bangun1.besarPanjang());
        System.out.println("Lebar = "+bangun1.besarLebar());
        System.out.println("Luas = "+bangun1.luasSegiEmpat());
        
    }
}
