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
public class No2 {
    public static void main(String[] args) {
        int P = 40, L = 10;
        float r=P/4;
        float luas=Total(LuasPersegi(P,L),LuasLingkaran(r));
        System.out.println("Luas Arsir = "+luas);
    }
    
     static int LuasPersegi(int P, int L){
        return P*L;
    }
    
    static float LuasLingkaran(float r){
        return 3.14f*r*r;   
    }
    
    static float Total(int a, float b){
        float total = (float)a-b;
        return total;
    }
}
