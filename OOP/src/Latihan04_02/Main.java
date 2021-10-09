/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan04_02;

/**
 *
 * @author Adit
 */
public class Main {
    public static void main(String[] args) {
        Car mobil = new Car();
        mobil.print_info();
        mobil.move();
        System.out.println();
        mobil.print_info();
        System.out.println("==============================");
        Plane pesawat = new Plane(500,100,150);
        pesawat.print_info();
        pesawat.move();
        System.out.println();
        pesawat.print_info();
        System.out.println("==============================");
        Ship kapal = new Ship(500,120,30,100);
        kapal.print_info();
        kapal.move();
        System.out.println();
        kapal.print_info();
    }
}
