/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal29September2020ADT;

/**
 *
 * @author Adit
 */
public class ADTMahasiswa {
    private String Nama;
    private String NIM;
    private String PS;
    private int Angkatan;
    public ADTMahasiswa(){
        this.Nama = "-";
        this.NIM = "-";
        this.PS = "-";
        this.Angkatan = 0;
    }
    public ADTMahasiswa(String nama, String nim, String ps, int akt){
        this.Nama = nama;
        this.NIM = nim;
        this.PS = ps;
        this.Angkatan = akt;
    }
    public String getNama(){
        return this.Nama;
    }
    public String getNIM(){
        return this.NIM;
    }
    public String getPS(){
        return this.PS;
    }
    public int getAngkatan(){
        return this.Angkatan;
    }
    public void setNama(String nama){
        this.Nama = nama;
    }
    public void setNIM(String nim){
        this.NIM = nim;
    }
    public void setPS(String ps){
        this.PS = ps;
    }
    public void setAngkatan(int akt){
        this.Angkatan = akt;
    }
    
    @Override
    public String toString(){
        return "Nama = "+this.Nama+"\nNIM = "+this.NIM+"\nProgram Studi = "+this.PS+"\nAngkatan = "+this.Angkatan;
    }
}
