/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADTPointRegA;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Point {

    private int x;
    private int y;
    
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public void BacaPoint(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan X : ");
        this.x = input.nextInt();
        System.out.print("Masukkan Y : ");
        this.y = input.nextInt();
    }
    
    public void TulisPoint(){
        System.out.println(this.x+" , "+this.y);
    }
    
    public Point Tambah(Point P1, Point P2){
        Point temp = new Point();
        temp.x = P1.x + P2.x;
        temp.y = P1.y + P2.y;
        return temp;
    }
    
    public Point Kurang(Point P1, Point P2){
        Point temp = new Point();
        temp.x = P1.x - P2.x;
        temp.y = P1.y - P2.y;
        return temp;
    }
    
    public Point Dot(Point P1, Point P2){
        Point temp = new Point();
        temp.x = P1.x * P2.x;
        temp.y = P1.y * P2.y;
        return temp;
    }
}
