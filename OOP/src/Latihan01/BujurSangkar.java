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
public class BujurSangkar extends SegiEmpat {
    private float sisi;
    public BujurSangkar(){
        this.sisi = 0;
    }
    public void setSisi(float sisi){
        setA(sisi);
        setB(sisi);
    }
}
