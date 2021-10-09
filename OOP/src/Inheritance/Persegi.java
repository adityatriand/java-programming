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
public class Persegi extends BangunDatar {
    private float sisi;
    
    Persegi(){
        this.sisi = 0;
    }
    
    Persegi(float sisi){
        this.sisi = sisi;
    }
    
    float getSisi(){
        return this.sisi;
    }
    
    void setSisi(float sisi){
        this.sisi = sisi;
    }
    
    @Override
    float luas(){
        float luas = sisi*sisi;
        return luas;
    }
    
    @Override
    float keliling(){
        float keliling = 4*sisi;
        return keliling;
    }
}
