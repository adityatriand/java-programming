/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal29September2020ADT;

/**
 *
 * @author Adit
 */
public class DriverBenteng {
    public static void main(String[] args) {
        ADTBenteng benteng1 = new ADTBenteng();
        benteng1.setWarna(ADTBenteng.warna.Putih);
        System.out.println(benteng1);
        benteng1.jalanMaju(8);
        System.out.println(benteng1);
        benteng1.jalanKiri(2);
        benteng1.jalanMundur(3);
        System.out.println(benteng1);
    }
}
