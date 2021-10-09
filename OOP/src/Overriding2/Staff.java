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
public class Staff extends Pegawai {
    private int jumlahKehadiran;
    final private int tarif_harian = 30000;
    
    public Staff(){
        this.jumlahKehadiran = 0;
    }
    
    public Staff(String nip, String nama, String alamat){
        setNip(nip);
        setNama(nama);
        setAlamat(alamat);
    }
    
    public void setJumlahKehadiran(int jumlahKehadiran){
        this.jumlahKehadiran = jumlahKehadiran;
    }
    
    @Override
    public int getGaji(){
        int gajiTotal = this.jumlahKehadiran * this.tarif_harian;
        return gajiTotal;
    }
}
