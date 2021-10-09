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
public class Segitiga extends Bangun2D {
    private double a;
    private double b;
    private double c;
    
    public Segitiga(){
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    @Override
    public double keliling(){
        return this.a+this.b+this.c;
    }
    
    public void cetakKeliling(){
        System.out.println("Keliling Segitiga = "+keliling());
    }
}
