/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pert9;

/**
 *
 * @author Adit
 */
public class SemHasilTest3 {
    public static void main(String[] args) {
        double rata, nilai[]={80,70,82,85,80,70,76};
        int jum =nilai.length;
        rata = 0;
        for(int i=0;i<jum;i++){
            rata = rata+nilai[i];
        }
        rata = rata/jum;
        System.out.println("Nilai Rata Rata = "+rata);
    }
    
}
