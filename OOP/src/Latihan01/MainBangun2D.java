/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan01;

/**
 *
 * @author Adit
 */
public class MainBangun2D {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        s.setAlas(5);
        s.setTinggi(10);
        s.CetakLuas();
        
        Lingkaran l = new Lingkaran();
        l.setJari(10);
        l.CetakLuas();
        
        PersegiPanjang p = new PersegiPanjang();
        p.setLebar(10);
        p.setPanjang(5);
        p.CetakLuas();
        
        BujurSangkar b = new BujurSangkar();
        b.setSisi(10);
        b.CetakLuas();
    }
}
