/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BelajarUTS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author Adit
 */
public class ADTJualan {
    private String nama;
    private int beli;
    
    public boolean Validator(String newNama, int newBeli){
        return (newNama!=" " && newBeli!=0);
    }
    
    public boolean validNama(String newNama){
        return newNama.equals("");
    }
    
    public boolean validBeli(int newBeli){
        return newBeli == 0;
    }
    
    public ADTJualan(){
        this.nama = "-";
        this.beli = 0;
    }
    
    public ADTJualan(String newNama, int newBeli){
        if(Validator(newNama,newBeli)){
            this.nama = newNama;
            this.beli = newBeli;
        }
        else{
            System.out.println("Harus mengisi nama dan banyak pembelian");
        }
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public int getBeli(){
        return this.beli;
    }
    
    public void setNama(String newNama){
        if(newNama.equals("")){
            System.out.println("Harap Masukkan Nama Anda");
        }
        else{
            this.nama = newNama;
        }
    }
    
    public void setBeli(int newBeli){
        if(newBeli == 0){
            System.out.println("Harap Masukkan Banyak Pembelian Anda");
        }
        else{    
            this.beli = newBeli;
        }
    }
    
    @Override
    public String toString(){
        return "Nama = "+this.nama+"\nBanyak Pembelian = "+this.beli;
    }
    
    void inputData()throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String newNama;
        int newBeli;
        System.out.println("Input Data Anda");
        System.out.println("===============");
        do{
            System.out.print("Masukkan Nama Anda = ");
            newNama = input.readLine();
            setNama(newNama);
        }while(validNama(newNama));
        do{
            System.out.print("Masukkan Banyak Pembelian = ");
            newBeli = Integer.parseInt(input.readLine());
            setBeli(newBeli);
        }while(validBeli(newBeli));
    }
}
