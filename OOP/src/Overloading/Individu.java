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
public class Individu {
    private String Nama;
    private String WarnaKulit;
    private int TinggiBadan;
    private int BeratBadan;
    
    public Individu(){
        this.Nama = "-";
        this.WarnaKulit = "-";
        this.TinggiBadan = 0;
        this.BeratBadan = 0;
    }
    
    public void setIdentitas(String Nama){
        this.Nama = Nama;
    }
    
    public void setIdentitas(String Nama, String WarnaKulit){
        this.Nama = Nama;
        this.WarnaKulit = WarnaKulit;
    }
    
    public void setIdentitas(String Nama, String WarnaKulit, int TinggiBadan){
        this.Nama = Nama;
        this.WarnaKulit = WarnaKulit;
        this.TinggiBadan = TinggiBadan;
    }
    
    public void setIdentitas(String Nama, String WarnaKulit, int TinggiBadan, int BeratBadan){
        this.Nama = Nama;
        this.WarnaKulit = WarnaKulit;
        this.TinggiBadan = TinggiBadan;
        this.BeratBadan = BeratBadan;
    }
    
    public void cetakIdentitas(){
        System.out.println("Nama = "+this.Nama);
        System.out.println("Warna Kulit = "+this.WarnaKulit);
        System.out.println("Tinggi Badan = "+this.TinggiBadan+" cm");
        System.out.println("Berat Badan = "+this.BeratBadan+" kg");
        System.out.println();
    }
    
}
