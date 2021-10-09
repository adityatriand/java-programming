/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraksi;

/**
 *
 * @author Adit
 */
public class Main {
    public static void main(String[] args) {
        LimasSegiEmpat l1 = new LimasSegiEmpat(10,12);
        System.out.println(l1);
        l1.findLuas();
        l1.findVolume();
        
        SepedaAnakAnak s1 = new SepedaAnakAnak("Merah",2,SepedaAnakAnak.tipe.Tidak,80);
        System.out.println("\n"+s1);
        s1.cekBan();
        s1.setTipeKursi(SepedaAnakAnak.tipe.Sandar);
        System.out.println("\n"+s1);
        
        Karyawan k1 = new Karyawan("Adam Maulana",123456789,"Manajer");
        System.out.println("\n"+k1);
        Karyawan k2 = new Karyawan("Ahmad",987654321,"Staff");
        System.out.println("\n"+k2);
         
    }
}
