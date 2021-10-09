/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
class point
{
    int x;
    int y;
}

public class soaluas {
    static point p;
    static point makepoint(int myX, int myY)
    {
        point p = new point();
        p.x = myX;
        p.y = myY;
        return p;
    }
    
    static void BacaPoint()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan X : ");
        p.x = input.nextInt();
        System.out.println("Masukkan Y : ");
        p.y = input.nextInt();
        
    }
    
    static void tampilPoint()
    {
        System.out.println("("+p.x+","+p.y+")");
    }
    
    static int setabsis(int x)
    {
        return p.x = x;
    }
    
    static int setordinat(int y)
    {
        return p.y=y;
    }
    
    static int getabsis()
    {
        return p.x;
    }
    
    static int getordinat()
    {
        return p.y;
    }
    
    static void Geser(int a, int b)
    {
        p.x= 0+a;
        p.y= 0+b;
        tampilPoint();
    }
    
    static void MirrorX(point p)
    {
        p.y = -p.y;
        tampilPoint();
    }
    
    
    static void MirrorY(point p)
    {
        p.x = -p.x;
        tampilPoint();
    }
    public static void main(String[] args) {
        p = makepoint(0,0);
        System.out.print("Titik Awal : ");
        tampilPoint();
        System.out.print("Geser sejauh : ");
        Geser(1,1);
        System.out.print("Mirror terhadap sumbu x");
        MirrorY(p);
        System.out.print("Mirror terhadap sumbu y");
        MirrorX(p);
    }
}
