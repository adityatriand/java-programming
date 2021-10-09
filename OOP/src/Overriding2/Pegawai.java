/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding2;

/**
 *
 * @author Adit
 */
public class Pegawai {
    private String nip;
    private String nama;
    private String alamat;

    public Pegawai(){
        this.nip = "-";
        this.nama = "-";
        this.alamat = "-";
    }
    
    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public int getGaji(){
        return 2000000;
    }
    
    public void identitas(){
        System.out.println("Pegawai Universitas XYZ");
        System.out.println("=======================");
        System.out.println("Nama    = "+this.nama);
        System.out.println("NIP     = "+this.nip);
        System.out.println("Alamat  = "+this.alamat);
        System.out.println("Gaji    = "+getGaji());
        System.out.println();
    }
    
}
