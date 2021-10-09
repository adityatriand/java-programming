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
public class maksimum {
    public static void main(String args[]){
        int nilai[],maksimum;
        nilai = new int [10];
        nilai[0]= 11;
        nilai[1]= 12;
        nilai[2]= 13;
        nilai[3]= 14;
        nilai[4]= 15;
        nilai[5]= 16;
        nilai[6]= 17;
        nilai[7]= 10;
        nilai[8]= 9;
        nilai[9]= 8;
        
        for(int i=0;i<10;i++){
            System.out.println("Elemen ke-"+(i+1)+" = "+nilai[i]);
        }
        maksimum = nilai[0];
        for(int i=0;i<10;i++){
            if(nilai[i]>maksimum){
               maksimum = nilai[i]; 
           }
        }
        System.out.println("Nilai Terbesar = "+maksimum);
    }
    
}
