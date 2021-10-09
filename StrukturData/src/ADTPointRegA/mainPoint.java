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
public class mainPoint {
    
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.TulisPoint();
        
        Point p2 = new Point(1,2);
        p2.TulisPoint();
        
        Point p3 = new Point();
        p3.BacaPoint();
        p3.TulisPoint();
        
        Point p4 = new Point();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan X : ");
        int x = input.nextInt();
        p4.setX(x);
        System.out.print("Masukkan Y : ");
        int y = input.nextInt();
        p4.setY(y);
        System.out.println("x : "+p4.getX());
        System.out.println("y : "+p4.getY());
        
        Point p5 = new Point();
        Point a = p5.Tambah(p2, p3);
        a.TulisPoint();
        
    }
}
