/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanUTS;

/**
 *
 * @author Adit
 */
public class main {
    public static void main(String[] args) {
        BangunRuang br = new BangunRuang();
        br.hitung_volume();
        br.hitung_luas_permukaan();
        br.print();
        Balok b= new Balok(1, 2, 3);
        b.hitung_volume();
        b.hitung_luas_permukaan();
        b.print();
        int sisi = 2;
        Kubus k = new Kubus(sisi);
        k.hitung_volume();
        k.hitung_luas_permukaan();
        k.print();
    }
}
