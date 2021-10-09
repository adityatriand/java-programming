/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan02;

/**
 *
 * @author Adit
 */
public class PersegiPanjang extends Bangun2D {
    private double panjang;
    private double lebar;
    
    public PersegiPanjang(){
        this.panjang = 0;
        this.lebar = 0;
    }
    
    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    public char cekBujurSangkar(){
        if(this.panjang == this.lebar) return 'Y';
        else return 'N';
    }
    
    @Override
    public double keliling(){
        return 2*(this.panjang+this.lebar);
    }
    
    public void cetakKeliling(){
        System.out.println("Keliling Persegi Panjang = "+keliling());
    }
    
}
