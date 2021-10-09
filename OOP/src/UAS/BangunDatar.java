/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

/**
 *
 * @author Adit
 */
public class BangunDatar {
    Segitiga s;
    PersegiPanjang p;
    Trapesium t;
    
    public BangunDatar(int lebar, int tsegitiga, int ppg, int btrapesium, int ttrapesium){
        s = new Segitiga(lebar,tsegitiga);
        p = new PersegiPanjang(ppg, lebar);
        t = new Trapesium(lebar,btrapesium, ttrapesium);
    }
    
    public double luasBangunDatar(){
        double l1 = s.luasSegitiga();
        double l2 = p.luasPersegiPanjang();
        double l3 = t.luasTrapesium();
        return l1+l2+l3;
    }
}

class Segitiga{
    protected int a;
    protected int t;

    public Segitiga(int a, int t) {
        this.a = a;
        this.t = t;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }
    
    public double luasSegitiga(){
        return 0.5*a*t;
    }
}

class PersegiPanjang{
    protected int p;
    protected int l;

    public PersegiPanjang(int p, int l) {
        this.p = p;
        this.l = l;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }
    
    public double luasPersegiPanjang(){
        return p*l;
    } 
}

class Trapesium{
    protected int a;
    protected int b;
    protected int t;

    public Trapesium(int a, int b, int t) {
        this.a = a;
        this.b = b;
        this.t = t;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }
    
    public double luasTrapesium(){
        return ((a+b)*t)/2;
    }
}