/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

/**
 *
 * @author Adit
 */
public class Main {
    public static void main(String[] args) {
        Mobil m1 = new Mobil();
        Motor m2 = new Motor();
        Pesawat m3 = new Pesawat();
        
        m1.setWarna("Hitam");
        m2.setWarna("Hijau");
        m3.setWarna("Putih");
        
        m1.setTempatBergerak("Jalan Raya");
        m2.setTempatBergerak("Jalan Raya");
        m3.setTempatBergerak("Udara");
        
        m1.setJumlahRoda(4);
        m2.setJumlahRoda(2);
        m3.setJumlahRoda(2);
        
        m1.setJumlahPenumpang(4);
        m2.setJumlahPenumpang(2);
        m3.setJumlahPenumpang(50);
        
        m1.informasiKendaraan();
        m2.informasiKendaraan();
        m3.informasiKendaraan();
        
        m1.caraBergerak();
        m2.caraBergerak();
        m3.caraBergerak();
        
    }
}
