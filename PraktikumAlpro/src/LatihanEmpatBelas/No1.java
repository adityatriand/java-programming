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
public class No1 {
    public static void main(String[] args) {
        int P = 40, L = 10;
        float r=P/4;
        int luas1 = LuasPersegi(P,L);
        float luas2 = LuasLingkaran(r);
        float luasarsir = (float)luas1-luas2;
        System.out.println("Luas Arsir = "+luasarsir);
    }
    
    static int LuasPersegi(int P, int L){
        return P*L;
    }
    
    static float LuasLingkaran(float r){
        return 3.14f*r*r;
    }
    
}
