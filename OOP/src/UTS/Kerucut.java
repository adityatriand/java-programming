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
public class Kerucut extends Rudal {
    private float r;
    private float t;
    private float s;
    
    public Kerucut(){
        r = 0;
        t = 0;
        s = 0;
    }
    
    public Kerucut(float r, float t){
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
    
    public float garisPelukis(){
        s = (float)(Math.sqrt((r*r)+(t*t)));
        return s;
    }
    
    @Override
    public float luasPermukaan(){
        float luas = 3.14f*r*(r+s);
        setLuasPermukaanKerucut(luas);
        return getLuasPermukaanKerucut();
    }
    
    @Override
    public void Informasi(){
        System.out.println("Jari Jari = "+this.r);
        System.out.println("Tinggi = "+this.t);
        System.out.println("Garis Pelukis = "+garisPelukis());
        System.out.println("Luas Permukaan Kerucut = "+luasPermukaan());
    }
}
