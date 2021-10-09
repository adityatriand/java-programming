/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

/**
 *
 * @author Adit
 */
public class KendaraanBermotor {
    private String warna;
    private int jumlahRoda;
    private String tempatBergerak;
    private int jumlahPenumpang;

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getJumlahRoda() {
        return jumlahRoda;
    }

    public void setJumlahRoda(int jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }

    public String getTempatBergerak() {
        return tempatBergerak;
    }

    public void setTempatBergerak(String tempatBergerak) {
        this.tempatBergerak = tempatBergerak;
    }

    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }

    public void setJumlahPenumpang(int jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }

    
    public void caraBergerak(){
        System.out.println("Menggunakan Mesin");
    }
    
    public void informasiKendaraan(){
        System.out.println("Warna = "+warna);
        System.out.println("Jumlah Roda = "+jumlahRoda);
        System.out.println("Jumlah Penumpang = "+jumlahPenumpang);
        System.out.println("Tempat Bergerak = "+tempatBergerak);
    }
}
