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
public class Segitiga extends Bangun2D {
    private float alas;
    private float tinggi;
    public Segitiga(){
        this.alas = 0;
        this.tinggi = 0;
    }
    
    public float getAlas() {
        return alas;
    }

    public void setAlas(float alas) {
        this.alas = alas;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }
    
    public float HitungLuas(){
        float luas = 0.5f*alas*tinggi;
        setLuas(luas);
        return getLuas();
    }
}
