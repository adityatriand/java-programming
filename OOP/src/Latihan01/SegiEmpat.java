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
public abstract class SegiEmpat extends Bangun2D {
    private float a;
    private float b;
    public void setA(float a){
        this.a = a;
    }
    public void setB(float b){
        this.b = b;
    }
    public float getA(){
        return this.a;
    }
    public float getB(){
        return this.b;
    }
    public float HitungLuas(){
        return a*b;
    }
}
