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
public class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;

    PersegiPanjang(){
        this.panjang = 0;
        this.lebar = 0;
    }
    
    PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    float getPanjang() {
        return panjang;
    }

    void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    float getLebar() {
        return lebar;
    }

    void setLebar(float lebar) {
        this.lebar = lebar;
    }
    
    @Override
    float luas(){
        float luas = panjang*lebar;
        return luas;
    }
    
    @Override
    float keliling(){
        float keliling = 2*(panjang+lebar);
        return keliling;
    }
}
