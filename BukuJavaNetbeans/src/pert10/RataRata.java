/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pert10;

/**
 *
 * @author Adit
 */
public class RataRata {
    public static void main(String [] args){
        int nim;
        double rata, daf_nilai[][];
        daf_nilai = new double [5][2];
        daf_nilai [1][0]= 60;
        daf_nilai [1][1]= 65;
        daf_nilai [2][0]= 75;
        daf_nilai [2][1]= 55;
        daf_nilai [3][0]= 80;
        daf_nilai [3][1]= 95;
        daf_nilai [4][0]= 71;
        daf_nilai [4][1]= 80;
        for(nim=1;nim<5;nim++){
            rata = (daf_nilai[nim][0]+daf_nilai[nim][1])/2;
            System.out.println("Nilai Mahasiswa Rata Rata ke- "+nim+" = "+rata);
        }
    }
    
}
