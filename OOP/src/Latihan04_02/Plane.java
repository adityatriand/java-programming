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
public class Plane extends Vehicle {
    private int kapasitas_penumpang;

    public Plane(int kapasitas_tangki, int kapasitas_penumpang, int posisi) {
        this.kapasitas_penumpang = kapasitas_penumpang;
        setJenis(3);
        setJumlah_roda(3);
        setKapasitas_tangki(kapasitas_tangki);
        setPosisi(posisi);
    }
    
    @Override
    public void print_info(){
        super.print_info();
        System.out.println("Kapasitas Penumpanng = "+this.kapasitas_penumpang);
    }
    
    @Override
    public int move(){
        setPosisi(getPosisi()+300);
        return 300;
    }
    
}
