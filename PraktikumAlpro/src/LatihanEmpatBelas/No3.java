/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanEmpatBelas;

/**
 *
 * @author Adit
 */
public class No3 {
    public static void main(String[] args) {
        int P = 40, L = 10;
        float r=P/4;
        float luas=Total(P,L,r);
        System.out.println("Luas Arsir = "+luas);
    }
    
     static int LuasPersegi(int P, int L){
        return P*L;
    }
    
    static float LuasLingkaran(float r){
        return 3.14f*r*r;   
    }
    
    static float Total(int P,int L, float r){
        float total = (float)LuasPersegi(P,L)-LuasLingkaran(r);
        return total;
    }
}
