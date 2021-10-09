/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPakObet;

/**
 *
 * @author Adit
 */
public class Point {
    private float x;
    private float y;
    
    Point(){
        x = 0;
        y = 0;
    }
    
    Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    
    float getX(){
        return x;
    }
    
    float getY(){
        return y;
    }
    
    void setX(float x){
        this.x = x;
    }
    
    void setY(float y){
        this.y = y;
    }
}
