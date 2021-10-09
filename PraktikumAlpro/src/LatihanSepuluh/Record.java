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
public class Record {
    String NIM;
    String nama;
    boolean jeniskelamin;
    int umur;
    String golongandarah;
    
    public static void main(String[]args){
        Record Rek = new Record();
        Rek.NIM="09021181924019";
        Rek.nama="Aditya Tri Ananda";
        Rek.jeniskelamin=true;
        Rek.umur=18;
        Rek.golongandarah="AB";
        System.out.println("NIM            = "+Rek.NIM);
        System.out.println("Nama           = "+Rek.nama);
        if(Rek.jeniskelamin == true)
            System.out.println("Jenis Kelamin  = Lk");
        else
            System.out.println("Jenis Kelamin  = Pr");
        System.out.println("Umur           = "+Rek.umur+" Tahun");
        System.out.println("Golongan Darah = "+Rek.golongandarah);
    }
}
