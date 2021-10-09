/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IterasiScaling;

/**
 *
 * @author Adit
 */
public class Point {
    private float x;
    private float y;
    private float r;
    
    public Point(){
        x = 0;
        y = 0;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
    
    
    public String show(){
        return ("("+x+","+y+")");
    }
}
