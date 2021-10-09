/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan04_02;

/**
 *
 * @author Adit
 */
public abstract class Vehicle {
    private String nama_jenis;
    private int jenis;
    private int jumlah_roda;
    private int kapasitas_tangki;
    private int posisi;

    private String Jenis(){
        String a = "";
        if(getJenis()==1)a= "Kendaraan Darat";
        else if(getJenis()==2)a= "Kendaraan Air";
        else if(getJenis()==3)a= "Kendaraan Udara";
        return a;
    }
    
    public abstract int move();
    
    public int getJenis() {
        return jenis;
    }

    public void setJenis(int jenis) {
        this.jenis = jenis;
    }

    public int getJumlah_roda() {
        return jumlah_roda;
    }

    public void setJumlah_roda(int jumlah_roda) {
        this.jumlah_roda = jumlah_roda;
    }

    public int getKapasitas_tangki() {
        return kapasitas_tangki;
    }

    public void setKapasitas_tangki(int kapasitas_tangki) {
        this.kapasitas_tangki = kapasitas_tangki;
    }

    public int getPosisi() {
        return posisi;
    }

    public void setPosisi(int posisi) {
        this.posisi = posisi;
    }
    
    public double hitung_kecepatan(double jarak, double waktu){
        return jarak/waktu;
    }
    
    public void print_info(){
        System.out.println("Jenis = "+getJenis()+"( "+Jenis()+" )");
        System.out.println("Jumlah Roda = "+getJumlah_roda());
        System.out.println("Kapasitas Tangki = "+getKapasitas_tangki());
        System.out.println("Posisi = "+getPosisi());
    }
    
}
