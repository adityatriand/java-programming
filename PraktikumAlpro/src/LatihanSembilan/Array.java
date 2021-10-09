/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanSembilan;

/**
 *
 * @author Adit
 */
public class Array {
    public static void main(String args[]){
        int nilai[],total=0,rata;
        nilai = new int[3];
        nilai[0]=4;
        nilai[1]=5;
        nilai[2]=6;
        for(int i=0;i<3;i++){
            System.out.println(nilai[i]);
            total += nilai[i];
        }
        rata = total/3;
        System.out.println("Rata Rata = "+rata);
    }
    
}
