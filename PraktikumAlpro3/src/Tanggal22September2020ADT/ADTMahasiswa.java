/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal22September2020ADT;

/**
 *
 * @author Adit
 */
public class ADTMahasiswa {
    private String nama;
    private String NIM;
    private int angka;
    
    public ADTMahasiswa(){
        this.nama = "-";
        this.NIM = "-";
        this.angka = 1960;
    }
    
    public ADTMahasiswa(String newNama, String newNIM, int newAngka){
        this.nama = newNama;
        this.NIM = newNIM;
        this.angka = newAngka;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public String getNIM(){
        return this.NIM;
    }
    
    public int getAngka(){
        return this.angka;
    }
    
    public void setNama(String newNama){
        this.nama = newNama;
    }
    
    public void setNIM(String newNIM){
        this.NIM = newNIM;
    }
    
    public void setAngka(int newAngka){
        if(newAngka>=1960 && newAngka<=2020){
            this.angka = newAngka;
        }
    }
    
    public void generasi(int generasi){
        if(generasi>=1960 && generasi <=1964){
            System.out.println("Anda Generasi Baby Boomers\n");
        }
        else if(generasi>=1965 && generasi <=1980){
            System.out.println("Anda Generasi Generasi X\n");
        }
        else if(generasi>=1981 && generasi <=1994){
            System.out.println("Anda Generasi Milenial\n");
        }
        else if(generasi>=1995 && generasi <=2010){
            System.out.println("Anda Generasi Generasi Z\n");
        }
        else{
            System.out.println("Anda Generasi Alpha\n");
        }
    }
    
    @Override
    public String toString(){
        return ("Nama = "+this.nama+"\nNIM = "+this.NIM+"\nAngkatan = "+this.angka);
    }
    
}
