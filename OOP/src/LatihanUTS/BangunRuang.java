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
public class BangunRuang {
    private int volume;
    private int luas_permukaan;
    
    public BangunRuang() {
        this.volume= 0;
        this.luas_permukaan=0;
    }
    
    public int getVolume() {
        return volume;
    }
    
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public int getLuas_permukaan() {
        return luas_permukaan;
    }
    
    public void setLuas_permukaan(int luas_permukaan) {
        this.luas_permukaan = luas_permukaan;
    }
    
    public int hitung_volume(){
        return this.volume;
    }
    
    public int hitung_luas_permukaan(){
        return this.luas_permukaan;
    }
    
    public void print(){
        System.out.println("Volume = " + this.volume);
        System.out.println("Luas Permukaan = " + this.luas_permukaan);
    }
}