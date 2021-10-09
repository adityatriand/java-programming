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
public class SemHasilTest {
    public static void main(String[] args) {
        int i;
        double nilai [];
        nilai = new double [7];
        nilai [0] = 80;
        nilai [1] = 70;
        nilai [2] = 82;
        nilai [3] = 85;
        nilai [4] = 80;
        nilai [5] = 70;
        nilai [6] = 76;
        for (i=0;i<7;i++){
            System.out.println("Indeks "+(i+1)+" = "+nilai[i]);
        }
    }
}
