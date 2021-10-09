/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanSepuluh;

/**
 *
 * @author Adit
 */
class Mahasiswa{
    String NIM;
    String nama;
    boolean jeniskelamin;
    int umur;
    String golongandarah;
}

public class RecordTampilan2 {
    public static void main(String[]args){
        Mahasiswa key = new Mahasiswa();
        key.NIM="09021181924019";
        key.nama="Aditya Tri Ananda";
        key.jeniskelamin=true;
        key.umur=18;
        key.golongandarah="AB";
        System.out.println("NIM            = "+key.NIM);
        System.out.println("Nama           = "+key.nama);
        if(key.jeniskelamin == true)
            System.out.println("Jenis Kelamin  = Lk");
        else
            System.out.println("Jenis Kelamin  = Pr");
        System.out.println("Umur           = "+key.umur+" Tahun");
        System.out.println("Golongan Darah = "+key.golongandarah);
    }
    
}
