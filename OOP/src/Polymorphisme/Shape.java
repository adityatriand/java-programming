/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphisme;

/**
 *
 * @author Adit
 */
public class Shape {
    private float Luas;
    private float keliling;

    public Shape(){
        this.Luas = 0;
        this.keliling = 0;
    }
    
    public float getLuas() {
        return Luas;
    }

    public void setLuas(float Luas) {
        this.Luas = Luas;
    }

    public float getKeliling() {
        return keliling;
    }

    public void setKeliling(float keliling) {
        this.keliling = keliling;
    }
    
    public void show(){
        System.out.println("Luas : "+this.Luas);
        System.out.println("Keliling : "+this.keliling);
    }
}

class Circle extends Shape{
    private float r;
    
    public Circle(){
        this.r = 0;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
    
    @Override
    public float getLuas(){
        float luas = 3.14f*this.r*this.r;
        setLuas(luas);
        return luas;
    }
    
    @Override
    public float getKeliling(){
        float keliling = 2f*3.14f*this.r;
        setKeliling(keliling);
        return keliling;
    }
}

class Rectangle extends Shape{
    private float p;
    private float l;
    
    public Rectangle(){
        this.p = 0;
        this.l = 0;
    }

    public float getP() {
        return p;
    }

    public void setP(float p) {
        this.p = p;
    }

    public float getL() {
        return l;
    }

    public void setL(float l) {
        this.l = l;
    }
    
    @Override
    public float getLuas(){
        float luas = this.p*this.l;
        setLuas(luas);
        return luas;
    }
    
    @Override
    public float getKeliling(){
        float keliling = 2f*(p+l);
        setKeliling(keliling);
        return keliling;
    }
}

class Triangle extends Shape{
    private float t;
    private float a;
    private float hipotema;
    
    public Triangle(){
        this.t = 0;
        this.a = 0;
    }

    public float getT() {
        return t;
    }

    public void setT(float t) {
        this.t = t;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }
    
    public float getHipotema(){
        this.hipotema = (float)(Math.sqrt((Math.pow(this.a,2))+Math.pow(this.t,2)));
        return hipotema;
    }
    
    @Override
    public float getLuas(){
        float luas = 0.5f*this.a*this.t;
        setLuas(luas);
        return luas;
    }
    
    @Override
    public float getKeliling(){
        float keliling = this.a+this.t+getHipotema();
        setKeliling(keliling);
        return keliling;
    }
}

class MainShape{
    public static void main(String[] args) {
        Shape s;
        
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        
        
        c.setR(10);
        r.setP(5);
        r.setL(5);
        t.setA(3);
        t.setT(4);
        
        s = c;
        s.getLuas();
        s.getKeliling();
        s.show();
        
        s=r;
        s.getLuas();
        s.getKeliling();
        s.show();
        
        s=t;
        s.getLuas();
        s.getKeliling();
        s.show();
        
    }
}
