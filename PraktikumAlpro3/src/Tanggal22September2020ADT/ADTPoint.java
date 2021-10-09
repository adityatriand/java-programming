/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal22September2020ADT;

/**
 *
 * @author Adit
 */
public class ADTPoint {
    
    //Atribut
    private int x;
    private int y;
    
    //Contructor
    public ADTPoint(){
        this.x = 0;
        this.y = 0;
    }
    
    public ADTPoint(int newx, int newy){
        this.x = newx;
        this.y = newy;
    }
    
    //Getter dan Setter X
    public int getX(){
        return this.x;
    }
    
    public void setX(int newx){
        this.x = newx;
    }
    
    //Getter dan Setter Y
    public int getY(){
        return this.y;
    }
    
    public void setY(int newy){
        this.y = newy;
    }
    
    public void mirrorX(){
        this.x = -x;
    }
    
    public void mirrorY(){
        this.y = -y;
    }
    
    //Cetak
    @Override
    public String toString(){
        return ("( "+this.x+" , "+this.y+" )");
    }
}
