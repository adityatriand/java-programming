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
public class Car extends Vehicle {
    public Car(){
        setJenis(1);
        setJumlah_roda(4);
        setKapasitas_tangki(200);
        setPosisi(50);
    }
    
    public Car(int kapasitas_tangki, int posisi){
        setJenis(1);
        setJumlah_roda(4);
        setKapasitas_tangki(kapasitas_tangki);
        setPosisi(posisi);
    }
    
    @Override
    public int move(){
        setPosisi(getPosisi()+50);
        return 50;
    }
}
