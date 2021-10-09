/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TSoalSembilanbelas;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class SembilanBelas {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String nilai [];
        int n, jum=0;
        nilai = new String [3];
        nilai [0]= "Alpro 1";
        nilai [1]= "Fisika";
        nilai [2]= "Agama";
        for(n=0;n<3;n++){
        System.out.print("Nilai MK "+nilai[n]+ " = ");
        int b = i.nextInt();
        jum += b;
        }
        double rata = jum/3;
        System.out.println("Rata Rata nya = "+rata);
    }
}
