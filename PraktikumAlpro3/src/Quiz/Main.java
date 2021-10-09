/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float xa;
        float xb;
        float ya;
        float yb;
        int delta;
        do{
            System.out.print("Masukkan x paling kiri = ");
            xa = input.nextFloat();
            System.out.print("Masukkan x paling kanan = ");
            xb = input.nextFloat();
            System.out.print("Masukkan rentan nilai = ");
            delta = input.nextInt();
        }while(xb<=xa || delta<=0);
        
        float total = 0;
        for(float i=xa;i<xb;i+=delta){
            float x1 = i;
            float x2 = i+delta;
            float y1 = titikY(x1);
            float y2 = titikY(x2);
            float luas = luasSegmen(y1,y2,delta);
            System.out.println("Luas Segmen = "+luas);
            total += luas;
        }
        
        System.out.println("Luas total = "+total);
    }
    
    public static float titikY(float x){
        return (x*x)+1;
    }
    
    public static float luasSegmen(float y1, float y2, int delta){
        return ((y1+y2)*delta)/2;
    }
}
