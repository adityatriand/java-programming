/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSIbu;

/**
 *
 * @author Adit
 */
public class Rudal {
    Kerucut k;
    Tabung t;

    public Rudal(int r, int tk, int ttab, int s) {
        k= new Kerucut(r,tk,s);
        t = new Tabung(r,ttab);
        
    }
    
    public double volumerudal()
    {
        double vk=k.volumekerucut(); 
        double vt=t.volumetabung();
        return vk+vt;
    }
    public double luaspermukaanrudal()
    {
        double lpk=k.luaspermukaankerucut(); 
        double lpt=t.luaspermukaantabung();
        return lpk+lpt;
    }
}

class Tabung{
    protected int r;
    protected int t;

    public Tabung(int r, int t) {
        this.r = r;
        this.t = t;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }
    public double volumetabung()
    {
        return 3.14*r*r*t;
    }
    public double luaspermukaantabung()
    {
        return 2* 3.14*r*(r+t);
    }
}
class Kerucut{
    protected int r;
    protected int t;
    protected int s;

    public Kerucut(int r, int t, int s) {
        this.r = r;
        this.t = t;
        this.s = s;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }
    public double volumekerucut()
    {
        return 1/3*3.14*r*r*t;
    }
    public double luaspermukaankerucut()
    {
        return 3.14*r*(r+s);
    }
}

