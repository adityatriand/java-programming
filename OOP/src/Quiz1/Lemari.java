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
public class Lemari {
    private String warnaLemari;
    private int jumlahPintu;
    private int tinggi;
    private int lebar;
    
    public Lemari(){
        this.warnaLemari = "-";
        this.jumlahPintu = 1;
        this.tinggi = 5;
        this.lebar = 5;
    }
    
    public Lemari(String warna, int jumPintu, int t, int l){
        this.warnaLemari = warna;
        this.jumlahPintu = jumPintu;
        this.tinggi = t;
        this.lebar = l;
    }

    public String getWarnaLemari() {
        return warnaLemari;
    }

    public void setWarnaLemari(String warnaLemari) {
        this.warnaLemari = warnaLemari;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    public void InformasiLemari(){
        System.out.println("Warna Lemari = "+warnaLemari);
        System.out.println("Jumlah Pintu = "+jumlahPintu);
        System.out.println("Tinggi Lemari = "+tinggi);
        System.out.println("Lebar Lemari = "+lebar);
    }
    
    public void bukaPintu(){
        System.out.println("Pintu Lemari Terbuka");
    }
    
    public void tutupPintu(){
        System.out.println("Pintu Lemari Tertutup");
    }
    
}
