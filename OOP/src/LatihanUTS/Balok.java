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
public class Balok extends BangunRuang {
    private int Panjang;
    private int lebar;
    private int tinggi;
    
    public Balok() {
        this.Panjang = 0;
        this.lebar = 0;
        this.tinggi = 0;
    }
    
    public Balok(int Panjang, int lebar, int tinggi) {
        this.Panjang = Panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public int getPanjang() {
        return Panjang;
    }
    
    public void setPanjang(int Panjang) {
        this.Panjang = Panjang;
    }
    
    public int getLebar() {
        return lebar;
    }
    
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    public int getTinggi() {
        return tinggi;
    }
    
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public int hitung_volume(){
        int volume= this.Panjang* this.lebar*this.tinggi;
        setVolume(volume);
        return getVolume();
    }
    
    @Override
    public int hitung_luas_permukaan(){
        int luas_permukaan= 2*((this.Panjang* this.lebar) + (this.lebar*this.tinggi) + (this.Panjang*this.tinggi));
        setLuas_permukaan(luas_permukaan);
        return getLuas_permukaan();
    }
}
