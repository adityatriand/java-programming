/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author Adit
 */
public class Tabung extends Rudal {
    private float r;
    private float t;
    
    public Tabung(){
        r = 0;
        t = 0;
    }
    
    public Tabung(float r, float t){
        this.r = r;
        this.t = t;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float getT() {
        return t;
    }

    public void setT(float t) {
        this.t = t;
    }
    
    
    @Override
    public float luasPermukaan(){
        float luas = 2*3.14f*r*(r+t);
        setLuasPermukaanTabung(luas);
        return getLuasPermukaanTabung();
    }
    
    @Override
    public void Informasi(){
        System.out.println("Jari Jari = "+this.r);
        System.out.println("Tinggi = "+this.t);
        System.out.println("Luas Permukaan Tabung = "+luasPermukaan());
    }
    
}
