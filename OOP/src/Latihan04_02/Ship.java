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
public class Ship extends Vehicle {
    private int kapasitas_penumpang;
    private int kapasitas_mobil;
    
    public Ship(int kapasitas_tangki, int kapasitas_penumpang, int kapasitas_mobil, int posisi){
        setJenis(2);
        setJumlah_roda(0);
        setKapasitas_tangki(kapasitas_tangki);
        setPosisi(posisi);
        this.kapasitas_penumpang = kapasitas_penumpang;
        this.kapasitas_mobil = kapasitas_mobil;
    }
    
    @Override
    public void print_info(){
        super.print_info();
        System.out.println("Kapasitas Penumpanng = "+this.kapasitas_penumpang);
        System.out.println("Kapasitas Mobil = "+this.kapasitas_penumpang);
    }
    
    @Override
    public int move(){
        setPosisi(getPosisi()+100);
        return 100;
    }
}
