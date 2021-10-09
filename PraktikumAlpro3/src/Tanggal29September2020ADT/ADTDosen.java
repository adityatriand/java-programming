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
public class ADTDosen {
    private String nama;
    private int umur;
    public ADTDosen(){
        this.nama = "-";
        this.umur = 0;
    }
    public ADTDosen(String newNama, int newUmur){
        this.nama = newNama;
        if(newUmur>=0 && newUmur<=100){
            this.umur = newUmur;
        }
        else{
            this.umur = 0;
        }
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public int getUmur(){
        return this.umur;
    }
    
    public void setNama(String newNama){
        this.nama = newNama;
    }
    
    public void setUmur(int newUmur){
        if(newUmur>=0 && newUmur<=100){
            this.umur = newUmur;
        }
        else{
            this.umur = 0;
        }
    }
    
    @Override
    public String toString(){
        return "Nama Dosen = "+this.nama+"\nUmur = "+this.umur;
    }
}
