/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BelajarUas;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Perulangan {
    
    static void ratarata(){
        Scanner input = new Scanner(System.in);
        int sum=0,i,jum=0;
        System.out.print("i = ");
        i = input.nextInt();
        while(i!=-999){
            sum += i;
            jum++;
            System.out.print("i = ");
            i= input.nextInt();
        }
        if(jum>0){
            System.out.println("Total Perulangan = "+jum);
            System.out.println("Total Nilai = "+sum);
            System.out.println("Rata-Rata = "+(float)sum /(float)jum);
        }
        else
            System.out.println("Tidak Ada data yang diolah");
    }
    
    static void jenisBil(){
        Scanner input = new Scanner(System.in);
        System.out.print("Bilangan = ");
        int i = input.nextInt();
        int ganjil=0,genap=0,positif=0,negatif=0;
        while(i!=-999){
            if(i==0)genap++;
            else if(i>0){
                positif++;
                if(i%2==0)genap++;
                else ganjil++;
            }
            else{
                negatif++;
                if(i%2==0)genap++;
                else ganjil++;
            }
            System.out.print("Bilangan = ");
            i = input.nextInt();
        }
        System.out.println("Jumalh Positif = "+positif);
        System.out.println("Jumlah Negatif = "+negatif);
        System.out.println("Jumlah Genap = "+genap);
        System.out.println("Jumlah Ganjil = "+ganjil);
    }
    
    static double Pangkat(int a,int b){
        double pangkat = Math.pow(a, b);
        return pangkat;
    }
    
    public static void main(String[] args) {
        System.out.println(Pangkat(2,3));
    }
}
