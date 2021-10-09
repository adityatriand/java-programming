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
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    public int luas;
    public int keliling;
    
    public PersegiPanjang(){
        this.panjang = 0;
        this.lebar = 0;
    }
    
    public PersegiPanjang(int p, int l){
        this.panjang = p;
        this.lebar = l;
    }
    
    public void setPanjang(int p){
        this.panjang = p;
    }
    
    public int getPanjang(){
        return this.panjang;
    }
    
    public void setLebar(int l){
        this.lebar = l;
    }
    
    public int getLebar(){
        return this.lebar;
    }
    
    public void luasPersegiPanjang(){
        this.luas = this.panjang*this.lebar;
        System.out.println("Luasnya = "+this.luas);
    }
    
    public void kelilingPersegiPanjang(){
        this.keliling = 2*(this.panjang+this.lebar);
        System.out.println("Kelilingya = "+this.keliling);
    }
    
}

