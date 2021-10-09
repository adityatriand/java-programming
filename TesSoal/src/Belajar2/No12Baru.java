/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Belajar2;

/**
 *
 * @author Adit
 */
public class No12Baru {
    public static void main(String[] args) {
        double P = 10,L=5,T=5;
        double luasPersegiPanjang = luasPersegi(P,L,T);
        Selimut(luasPersegiPanjang);
        
    }
    
    static double luasPersegi(double P, double L, double T){
        double luas = (P*L)+(P*T)+(T*L);
        return luas;
    }
    
    static void Selimut(double a){
        double luasSelimut = 2*a;
        System.out.println("Luas Selimut Balok = "+luasSelimut);
    }
}
