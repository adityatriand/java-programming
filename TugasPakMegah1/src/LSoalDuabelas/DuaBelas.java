/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LSoalDuabelas;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class DuaBelas {
    public static void main(String[] args) {
        double P,L,T;
        Scanner i = new Scanner(System.in);
        System.out.println("MENCARI LUAS SELIMUT BALOK");
        System.out.println("==================");
        System.out.print("Panjang = ");
        P = i.nextDouble();
        System.out.print("Lebar = ");
        L=i.nextDouble();
        System.out.print("Tinggi = ");
        T=i.nextDouble();
        
        double luas = LuasSelimutBalok(P,L,T);
        System.out.println("Luas Selimut Balok = "+luas);
    }
    
    static double LuasSisi(double P,double L, double T){
            double luassisi = (P*L)+(P*T)+(T*L);
            return luassisi;
        }
    
    static double LuasSelimutBalok(double P,double L,double T ){
        double luastot = 2*LuasSisi(P,L,T);
        return luastot;
    }
}
