/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MSoalTigabelas;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class TigaBelasSubprogram {
    public static void main(String[] args) {
        double P,L,p,l;
        Scanner i = new Scanner(System.in);
        System.out.print("Nilai P = ");
        P = i.nextDouble();
        System.out.print("Nilai L = ");
        L = i.nextDouble();
        System.out.print("Nilai p = ");
        p = i.nextDouble();
        System.out.print("Nilai l = ");
        l = i.nextDouble();
        LuasArsir(P,L,p,l);
    }
    
    static void LuasArsir(double P,double L, double p, double l){
        double luas = (P*L)-(p*l);
        System.out.println("Luas yang diarsir adalah = "+luas);
    }
}
