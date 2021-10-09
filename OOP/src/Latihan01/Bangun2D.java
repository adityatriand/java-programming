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
public abstract class Bangun2D {
    private float luas;
    public void setLuas(float luas){
        this.luas = luas;
    }
    public float getLuas(){
        return luas;
    }
    public float HitungLuas(){
        return luas;
    }
    public void CetakLuas(){
        System.out.println("Luas = "+HitungLuas());
    }
}
