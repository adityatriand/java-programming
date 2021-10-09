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
public class Lingkaran extends Bangun2D {
    private float jari;
    public Lingkaran(){
        this.jari = 0;
    }
    
    public float getJari() {
        return jari;
    }

    public void setJari(float jari) {
        this.jari = jari;
    }
    
    public float HitungLuas(){
        float luas = 3.14f*jari*jari;
        setLuas(luas);
        return getLuas();
    }
}
