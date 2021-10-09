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
public class DriverADTPoint {
    
    public static void main(String[] args) {
        ADTPoint A = new ADTPoint();
        System.out.println(A);
        
        ADTPoint B = new ADTPoint(3,5);
        System.out.println(B);
        
        int a = B.getX();
        int b = B.getY();
        System.out.println(a);
        System.out.println(b);
        
        A.setX(1);
        A.setY(1);
        System.out.println(A);
        
        System.out.println(B);
        
        B.mirrorX();
        B.mirrorY();
        System.out.println(B);
    }
    
}
