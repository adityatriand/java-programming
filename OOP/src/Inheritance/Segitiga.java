/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Adit
 */
public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;

    Segitiga(){
        this.alas = 0;
        this.tinggi = 0;
    }
    
    Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    float getAlas() {
        return alas;
    }

    void setAlas(float alas) {
        this.alas = alas;
    }

    float getTinggi() {
        return tinggi;
    }

    void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    float luas(){
        float luas = 0.5f*alas*tinggi;
        return luas;
    }
    
    @Override
    float keliling(){
        float samping = (float)Math.sqrt((alas*alas)+(tinggi*tinggi));
        float keliling = alas+tinggi+samping;
        return keliling;
    }
}
