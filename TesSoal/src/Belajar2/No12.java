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
public class No12 {
    public static void main(String[] args) {
        double P = 10,L=5,T=5;
        double persegiPanjang = luasPersegi(P,L,T);
        double selimutBalok = Selimut(persegiPanjang);
        System.out.println("Luas Selimut Balok = "+selimutBalok);
    }
    
    static double luasPersegi(double P, double L, double T){
        double luas = (P*L)+(P*T)+(T*L);
        return luas;
    }
    
    static double Selimut(double a){
        double luasSelimut = 2*a;
        return luasSelimut;
    }
}
