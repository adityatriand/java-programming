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
public class PersegiPanjang extends SegiEmpat {
    private float panjang;
    private float lebar;
    public PersegiPanjang(){
        this.panjang = 0;
        this.lebar = 0;
    }
    public void setPanjang(float panjang){
        setA(panjang);
    }
    public void setLebar(float lebar){
        setB(lebar);
    }
}
