/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan02;

/**
 *
 * @author Adit
 */
public class Lingkaran extends Bangun2D {
    private double r;
    
    public Lingkaran(){
        this.r = 0;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public double scale(double x){
        if(x == 0)x=1;
        this.r = this.r*x;
        return this.r;
    }
    
    @Override
    public double keliling(){
        return 3.14*2*this.r;
    }
    
    public void cetakKeliling(){
        System.out.println("Keliling Lingkaran = "+keliling());
    }
}
