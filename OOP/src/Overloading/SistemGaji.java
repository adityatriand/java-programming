/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

/**
 *
 * @author Adit
 */
public class SistemGaji {
    public void hitungGaji(int gajiPokok, int tunjangan){
        System.out.println("Gaji Anda = " +(gajiPokok + tunjangan));
    }
    
    public int hitungGaji(int gajiPokok, int tunjangan, int bonus){
        return gajiPokok + tunjangan + bonus;
    }
    
    public int hitungGaji( int tunjangan,int gajiPokok,int lembur,int bonus){
        return gajiPokok + tunjangan + bonus + lembur;
    } 
}
