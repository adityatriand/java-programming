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
public class Printer {
    private int tintaHitam = 100;
    private int tintaMagenta = 100;
    private int tintaCyan = 100;
    private int tintaYellow = 100;
    private String brand;
    
    public Printer(){
        this.brand = "Fax";
    }
    
    public Printer(String brand){
        this.brand = brand;
    }
    
    public int getTintaHitam() {
        return tintaHitam;
    }

    public void setTintaHitam(int tintaHitam) {
        this.tintaHitam = tintaHitam;
    }

    public int getTintaMagenta() {
        return tintaMagenta;
    }

    public void setTintaMagenta(int tintaMagenta) {
        this.tintaMagenta = tintaMagenta;
    }

    public int getTintaCyan() {
        return tintaCyan;
    }

    public void setTintaCyan(int tintaCyan) {
        this.tintaCyan = tintaCyan;
    }

    public int getTintaYellow() {
        return tintaYellow;
    }

    public void setTintaYellow(int tintaYellow) {
        this.tintaYellow = tintaYellow;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void isiTinta(int th,int tm, int tc, int ty){
        this.tintaHitam += th;
        this.tintaCyan += tc;
        this.tintaMagenta += tm;
        this.tintaYellow += ty;
        System.out.println("\nTinta Berhasil Ditambah");
    }
    
    public void informasiTinta(){
        System.out.println("==================");
        System.out.println("Printer "+brand);
        System.out.println("==================");
        System.out.println("Tinta Hitam = "+tintaHitam);
        System.out.println("Tinta Magenta = "+tintaMagenta);
        System.out.println("Tinta Cyan = "+tintaCyan);
        System.out.println("Tinta Yellow = "+tintaYellow);
    }
    
    public void cetakDokumen(){
        this.tintaHitam -= 10;
        this.tintaCyan -= 10;
        this.tintaMagenta -= 10;
        this.tintaYellow -= 10;
        System.out.println("\nDokumen berhasil dicetak");
        System.out.println("Informasi Tinta Print Saat Ini");
        informasiTinta();
    }
}
