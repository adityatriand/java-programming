/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraksi;

/**
 *
 * @author Adit
 */
public class LimasSegiEmpat {
    private double tinggi;
    private double sisiAlas;
    private double apotema;
    private double luas;
    private double volume;
    
    public LimasSegiEmpat(){
        this.tinggi = 0;
        this.sisiAlas = 0;
    }
    
    public LimasSegiEmpat(float sisi, float tinggi){
        this.tinggi = tinggi;
        this.sisiAlas = sisi;
    }
    
    public void setTinggi(float tinggi){
        this.tinggi = tinggi;
    }
    
    public void setSisi(float sisi){
        this.sisiAlas = sisi;    
    }
    
    public double getTinggi(){
        return this.tinggi;
    }
    
    public double getSisi(){
        return this.sisiAlas;
    }
    
    public double findApotema(){
        this.apotema = (Math.sqrt(Math.pow(this.tinggi,2)+ Math.pow((0.5*this.sisiAlas), 2)));
        return this.apotema;
    }
    
    private double luasSisiTegak(){
        return 4*(0.5*this.sisiAlas*this.apotema);
    }
    
    private double luasSisiAlas(){
        return this.sisiAlas*this.sisiAlas;
    }
    
    public void findLuas(){
        this.luas = luasSisiAlas()+luasSisiTegak();
        System.out.println("Luas Limas Segi Empat = "+this.luas);
    }
    
    public void findVolume(){
        this.volume = (luasSisiAlas()*this.tinggi)/3;
        System.out.println("Volume Limas Segi Empat = "+this.volume);
    }
    
    @Override
    public String toString(){
        return "Informasi Limas\nTinggi = "+this.tinggi+"\nSisi Alas = "+this.sisiAlas+"\nApotema = "+findApotema();
    }
}
