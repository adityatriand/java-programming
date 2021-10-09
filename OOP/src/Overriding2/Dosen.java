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
public class Dosen extends Pegawai {
    private int jumlahSKS;
    final private int tarif_SKS = 50000;
    
    public Dosen(){
        this.jumlahSKS = 0;
    }
    
    public Dosen(String nip, String nama, String alamat){
        setNip(nip);
        setNama(nama);
        setAlamat(alamat);
    }
    
    public void setJumlahSKS(int jumlahSKS){
        this.jumlahSKS = jumlahSKS;
    }
    
    @Override
    public int getGaji(){
        int gajiTotal = this.jumlahSKS * this.tarif_SKS;
        return gajiTotal;
    }
}
