/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enkapsulasi;

/**
 *
 * @author Adit
 */
public class Lingkaran {
    private float r;
    private float d;
    private float Luas;
    private float Keliling;
    
    public Lingkaran(){
        this.r = 0;
    }
    
    public Lingkaran(float r){
        this.r = r;
    }

    public float getJariJari() {
        return r;
    }

    public void setJariJari(float r) {
        this.r = r;
    }
    
    public void hitung_luas(){
        Luas = (22*this.r*this.r)/7;
        System.out.printf("Luas = %.3f %n", Luas);
    }
    
    public void hitung_keliling(){
        Keliling = (2*22*this.r)/7;
        System.out.printf("Keliling = %.3f %n", Keliling);
    }
    
    public void hitung_diameter(){
        d = 2*this.r;
        System.out.println("Diameter = "+d);
    }  
}
