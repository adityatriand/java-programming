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
public class SepedaAnakAnak {
    public enum tipe{
        Sandar,Tidak
    }
    private String warna;
    private int jumlahRoda;
    private tipe kursi;
    private int anginBan;
    
    public SepedaAnakAnak(){
        this.kursi = tipe.Tidak;
        this.warna = "-";
        this.jumlahRoda = 2;
        this.anginBan = 0;
    }
    
    public SepedaAnakAnak(String warna, int jumRoda, tipe kursi, int anginBan){
        this.jumlahRoda = jumRoda;
        this.warna = warna;
        this.kursi = kursi;
        this.anginBan = anginBan;
    }
    
    public int getJumlahRoda(){
        return this.jumlahRoda;
    }
    
    public int getAnginBan(){
        return this.anginBan;
    }
    
    public String getWarna(){
        return this.warna;
    }
    
    public tipe getTipeKursi(){
        return this.kursi;
    }
    
    public void setJumlahRoda(int jumRoda){
        this.jumlahRoda = jumRoda;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    public void setTipeKursi(tipe kursi){
        this.kursi = kursi;
    }
    
    public void setAnginBan(int anginBan){
        this.anginBan = anginBan;
    }
    
    public void cekBan(){
        if(this.anginBan > 70 && this.anginBan <= 100){
            System.out.println("Ban Aman");
        }
        
        else if(this.anginBan >=0 && this.anginBan <=70){
            System.out.println("Ban Kempis");
        }
        
        else{
            System.out.println("range 0-100");
        }
    }
    
    @Override
    public String toString(){
        return "Informasi Sepeda\nWarna Sepeda = "+this.warna+"\nJumlah Roda = "+this.jumlahRoda+"\nTipe Kursi = "+this.kursi;
    }
    
}
