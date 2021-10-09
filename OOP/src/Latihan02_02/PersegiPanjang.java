/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan02_02;

/**
 *
 * @author Adit
 */
public abstract class PersegiPanjang {
    private double p;
    private double l;
    abstract public double luas();
    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }
    
    public void informasi(){
        System.out.println("Panjang = "+getP());
        System.out.println("Lebar = "+getL());
        System.out.println("Luas = "+luas());
    }
}
