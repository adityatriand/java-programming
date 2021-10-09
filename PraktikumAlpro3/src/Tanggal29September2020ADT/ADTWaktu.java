/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal29September2020ADT;

/**
 *
 * @author Adit
 */
public class ADTWaktu {
    
    private int jam;
    private int menit;
    private int detik;
    
    //Validator
    public boolean isValidJam(int newJam){
        return (newJam >= 0 && newJam <= 23);
    }
    
    public boolean isValidMD(int a){
        return (a >= 0 && a <= 59);
    }
    
    //Konstruktor Default
    public ADTWaktu(){
        this.jam = 0;
        this.menit = 0;
        this.detik = 0;
    }
      
//    Konstruktor bernilai versi1
//    public ADTWaktu(int newJam, int newMenit, int newDetik){
//        if((newJam >= 0 && newJam <= 23)&&(newMenit >= 0 && newMenit <= 59)&&(newDetik >=0 && newDetik <= 59))
//        {
//            this.jam = newJam;
//            this.menit = newMenit;
//            this.detik = newDetik;
//        }
//        else{
//            System.out.println("Inputan Tidak Valid");
//            this.jam = 0;
//            this.menit = 0;
//            this.detik = 0;
//        }
//    }
    
//    Konstruktor bernilai versi2
    public ADTWaktu(int newJam, int newMenit, int newDetik){
        if(isValidJam(newJam)){
            this.jam = newJam;
        }
        else{
            this.jam = 0;
        }
        if(isValidMD(newMenit)){
            this.menit = newMenit;
        }
        else{
            this.menit = 0;
        }
        if(isValidMD(newDetik)){
            this.detik = newDetik;
        }
        else{
            this.detik = 0;
        }
    }
    
    //GETTER
    public int getJam(){
        return this.jam;
    }
    
    public int getMenit(){
        return this.menit;
    }
    
    public int getDetik(){
        return this.detik;
    }
    
    //SETTER
    public void setJam(int newJam){
        if(isValidJam(newJam)){
            this.jam = newJam;
        }
        else{
            System.out.println("Masukkan Tidak Boleh");
        }
    }
    
    public void setMenit(int newMenit){
        if(isValidMD(newMenit)){
            this.menit = newMenit;
        }
        else{
            System.out.println("Masukkan Tidak Boleh");
        }
    }
    
    public void setDetik(int newDetik){
        if(isValidMD(newDetik)){
            this.detik = newDetik;
        }
        else{
            System.out.println("Masukkan Tidak Boleh");
        }
    }
    
    //PRINT
    @Override
    public String toString(){
        return ("Waktu Sekarang = "+this.jam+":"+this.menit+":"+this.detik);
    }
    
    //Fungsi Konversi
    public int waktutoDetik(){
        int jam = this.jam * 3600;
        int menit = this.menit * 60;
        int waktu = jam+menit+this.detik;
        return waktu;
    } 
    
    static ADTWaktu detiktoWaktu(int detik){
        int jam = detik/3600;
        detik %= 3600;
        int menit = detik/60;
        detik %= 60;
        return new ADTWaktu(jam,menit,detik);
    }
    
}
