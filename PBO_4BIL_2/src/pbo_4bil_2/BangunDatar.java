/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_4bil_2;

/**
 *
 * @author KANDAJM
 */
public class BangunDatar {

    private double alas;
    private double tinggi;
    private double luas;
    private double keliling;

    public BangunDatar() {
    }

    public BangunDatar(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }
    
    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getKeliling() {
        return keliling;
    }

    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }
    
    public void cetak()
    {
        System.out.println("Alas : "+getAlas());
        System.out.println("Tinggi : "+getTinggi());
        System.out.println("Keliling : "+getKeliling());
        System.out.println("Luas : "+getLuas());
        System.out.println("");
    }
}
