/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSWholePart;

/**
 *
 * @author Adit
 */
public class Rudal {
    private final Tabung tabung;
    private final Kerucut kerucut;
    
    public Rudal(){
        tabung = new Tabung();
        kerucut = new Kerucut();
    }
    
    public void setJariJari(float r){
        tabung.setR(r);
        kerucut.setR(r);
    }
    
    public void setTinggi(float t_tab, float t_ker){
        tabung.setT(t_tab);
        kerucut.setT(t_ker);
    }
    
    
    public float luasPermukaan(){
        return tabung.luasPermukaan() + kerucut.luasPermukaan();
    }
    
    public void luasPermukaanRudal(){
        System.out.println("Luas Permukaan Rudal = "+luasPermukaan());
        System.out.println();
    }
    
    public void Informasi(){
        System.out.println("Tabung");
        System.out.println("======");
        System.out.println("Jari jari = "+tabung.getR());
        System.out.println("Tinggi = "+tabung.getT());
        System.out.println("Luas Permukaan Tabung = "+tabung.luasPermukaan());
        System.out.println("\nKerucut");
        System.out.println("=======");
        System.out.println("Jari-Jari = "+kerucut.getR());
        System.out.println("Tinggi = "+kerucut.getT());
        System.out.println("Garis Pelukis = "+kerucut.garisPelukis());
        System.out.println("Luas Permukaan Kerucut = "+kerucut.luasPermukaan());
        
    }
}

class Tabung{
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
    
    public float luasPermukaan(){
        float luas = 2*3.14f*r*(r+t);
        return luas;
    }
    
    public void Informasi(){
        System.out.println("Jari Jari = "+this.r);
        System.out.println("Tinggi = "+this.t);
        System.out.println("Luas Permukaan Tabung = "+luasPermukaan());
    } 
}

class Kerucut{
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
    
    public float luasPermukaan(){
        float luas = 3.14f*r*(r+s);
        return luas;
    }
    
    public void Informasi(){
        System.out.println("Jari Jari = "+this.r);
        System.out.println("Tinggi = "+this.t);
        System.out.println("Garis Pelukis = "+garisPelukis());
        System.out.println("Luas Permukaan Kerucut = "+luasPermukaan());
    }
}