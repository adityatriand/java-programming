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
public class Lingkaran extends BangunDatar {
    private float r;
    
    Lingkaran(){
        this.r = 0;
    }
    
    Lingkaran(float r){
        this.r = r;
    }
    
    float getJariJari(){
        return this.r;
    }
    
    void setJariJari(float r){
        this.r = r;
    }
    
    @Override
    float luas(){
        float luas = (22*r*r)/7;
        return luas;
    }
    
    @Override
    float keliling(){
        float keliling = (2*22*r)/7;
        return keliling;
    }
}
