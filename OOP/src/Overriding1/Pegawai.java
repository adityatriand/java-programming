/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding1;

/**
 *
 * @author Adit
 */
public class Pegawai {
    private int gajiPokok;

    public Pegawai(){
        gajiPokok = 5000000;
    }
    
    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    public int hitungGaji(){
        return gajiPokok;
    }
    
    public void tes(){
        System.out.println("tes");
    }
}
