/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IterasiScaling;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Main {
    final static Point c1 = new Point();
    final static Point c2 = new Point();
    final static Point c3 = new Point();
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float r;
        float A,B,C;
        for(int i=1;i<4;i++){
            float x, y;
            System.out.println("Titik C"+i);
            System.out.println("========");
            System.out.print("Masukkan x"+i+" = ");
            x = input.nextFloat();
            System.out.print("Masukkan y"+i+" = ");
            y = input.nextFloat();
            
            if(i==1){
                c1.setX(x); 
                c1.setY(y);
            }
            else if(i==2){
                c2.setX(x); 
                c2.setY(y);
            }
            else{
                c3.setX(x);
                c3.setY(y);
            }
            System.out.println();
        }
        System.out.print("Masukkan Jari Jari Lingkaran = ");
        r = input.nextFloat();
        
        A = centerDistance(c1,c2);
        B = centerDistance(c1,c3);
        C = centerDistance(c2,c3);
        
        System.out.println("Rincian\n=======");
        showVertices();
        showDistance();
        System.out.println("Jumlah Iterasi Scaling pada masing masing lingkaran agar terjadi irisan = "+iterasiScale(r,A,B,C));
    }
    
    public static void showVertices(){
        System.out.println("Titik C1 : "+c1.show());
        System.out.println("Titik C2 : "+c2.show());
        System.out.println("Titik C3 : "+c3.show());
    }
    
    public static void showDistance(){
        System.out.println("Jarak C1 ke C2 = "+centerDistance(c1, c2));
        System.out.println("Jarak C1 ke C3 = "+centerDistance(c1, c3));
        System.out.println("Jarak C2 ke C3 = "+centerDistance(c2, c3));
    }
    
    public static float centerDistance(Point a, Point b){
        float x = (float)Math.pow((a.getX()- b.getX()), 2);
        float y = (float)Math.pow((a.getY()- b.getY()), 2);
        return (float)Math.sqrt(x+y);
    }
    
    public static boolean checkIntersec(float x, float sumR){
        return x<sumR;
    }
    
    public static int iterasiScale(float r,float A, float B, float C){
        int n = 0;
        do
        {
            r = r*2;
            n++;
        }while(n<100000 &&(!checkIntersec(A,(r+r)))||(!checkIntersec(B,(r+r)))||(!checkIntersec(C,(r+r))));
        return n;
    }
}
