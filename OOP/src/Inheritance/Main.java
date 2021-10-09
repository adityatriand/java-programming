/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Adit
 */
public class Main {
    public static void main(String[] args) {
        BangunDatar B1 = new BangunDatar();
        B1.luas();
        B1.keliling();
        
        Persegi P1 = new Persegi();
        P1.setSisi(5);
        System.out.println("Luas Persegi = "+P1.luas());
        System.out.println("Keliling Persegi = "+P1.keliling());
        
        Lingkaran L1 = new Lingkaran();
        L1.setJariJari(7);
        System.out.println("Luas Lingkaran = "+L1.luas());
        System.out.println("Keliling Lingkaran = "+L1.keliling());
        
        Segitiga S1 = new Segitiga();
        S1.setAlas(5);
        S1.setTinggi(12);
        System.out.println("Luas Segitigas = "+S1.luas());
        System.out.println("Keliling Segitigas = "+S1.keliling());
        
        PersegiPanjang PP1 = new PersegiPanjang();
        PP1.setLebar(6);
        PP1.setPanjang(8);
        System.out.println("Luas Persegi Panjang = "+PP1.luas());
        System.out.println("Keliling Persegi Panjang = "+PP1.keliling());
    }
}
