/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan01_02;

/**
 *
 * @author Adit
 */
public class Main {
    public static void main(String[] args) {
        Balok b = new Balok();
        b.setPanjang(10);
        b.setLebar(20);
        b.setTinggi(10);
        System.out.println("Panjang : " + b.getPanjang());
        System.out.println("Lebar : " + b.getLebar());
        System.out.println("Tinggi : " + b.getTinggi());
        System.out.println("Volume Balok : " + b.getVolume());
        System.out.println("Luas Permukaan Balok : " + b.getLuasPemukaan());
        Kubus k = new Kubus(10);
        System.out.println("Panjang : " + k.getPanjang());
        System.out.println("Lebar : " + k.getLebar());
        System.out.println("Volume Kubus: " + k.getVolume());
        System.out.println("Luas Permukaan Kubus : " + k.getLuasPemukaan());
    }
}
