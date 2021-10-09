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
public class Karyawan {
    private String nama;
    private int NIP;
    private String jabatan;
    private int gaji;
    
    public Karyawan(){
        this.nama = "-";
        this.NIP = 0;
        this.jabatan = "-";
    }
    
    public Karyawan(String nama, int NIP, String jabatan){
        this.nama = nama;
        this.NIP = NIP;
        this.jabatan = jabatan;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public int getNIP(){
        return this.NIP;
    }
    
    public String getJabatan(){
        return this.jabatan;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setNIP(int NIP){
        this.NIP = NIP;
    }
    
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    
    public int gajiKaryawan(){
        if(this.jabatan.equals("Manajer"))
            this.gaji = 10000000;
        else if(this.jabatan.equals("Kepala Divisi"))
            this.gaji = 7000000;
        else if(this.jabatan.equals("HRD"))
            this.gaji = 5000000;
        else
            this.gaji = 3500000;
        return this.gaji;
    }
    
    @Override
    public String toString(){
        return "Informasi Karyawan\nNama = "+this.nama+"\nNIP = "+this.NIP+"\nJabatan = "+this.jabatan+"\nGaji = "+gajiKaryawan();
    }
}
