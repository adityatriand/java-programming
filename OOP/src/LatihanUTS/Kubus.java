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
public class Kubus extends BangunRuang{
    private int sisi;
    
    public Kubus() {
        this.sisi=0;
    }
    
    public Kubus(int sisi) {
        this.sisi=sisi;
    }
    
    public int getSisi() {
        return sisi;
    }
    
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public int hitung_volume(){
        int volume= this.sisi*this.sisi*this.sisi;
        setVolume(volume);
        return getVolume();
    }
    @Override
    public int hitung_luas_permukaan(){
        int luas_permukaan= 6*this.sisi*this.sisi;
        setLuas_permukaan(luas_permukaan);
        return getLuas_permukaan();
    }
}
