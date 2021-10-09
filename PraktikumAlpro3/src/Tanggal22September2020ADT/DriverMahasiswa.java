/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal22September2020ADT;

/**
 *
 * @author Adit
 */
public class DriverMahasiswa {
    public static void main(String[] args) {
        int cek = 0;
        String nama, NIM;
        
        ADTMahasiswa Default = new ADTMahasiswa();
        System.out.println("Tampilan Default");
        System.out.println("================");
        System.out.println(Default);
        System.out.println("");
        
        ADTMahasiswa A = new ADTMahasiswa ();
        A.setNama("Aditya Tri Ananda");
        nama = A.getNama();
        System.out.println("Nama Mahasiswa 1 = "+nama);
        A.setNIM("09021181924019");
        NIM = A.getNIM();
        System.out.println("NIM Mahasiswa 1 = "+NIM);
        A.setAngka(2001);
        cek = A.getAngka();
        A.generasi(cek);
        
        ADTMahasiswa B = new ADTMahasiswa ();
        B.setNama("Budi Setiawan");
        nama = B.getNama();
        System.out.println("Nama Mahasiswa 2 = "+nama);
        B.setNIM("09021181924000");
        NIM = B.getNIM();
        System.out.println("NIM Mahasiswa 2 = "+NIM);
        B.setAngka(1959); //jika memasukkan nilai diluar range 1960 - 2020 maka akan ke set default
        cek = B.getAngka();
        B.generasi(cek);
        
        ADTMahasiswa C = new ADTMahasiswa ();
        C.setNama("Agung Prasetyo");
        nama = C.getNama();
        System.out.println("Nama Mahasiswa 3 = "+nama);
        C.setNIM("09021181925000");
        NIM = C.getNIM();
        System.out.println("NIM Mahasiswa 3 = "+NIM);
        C.setAngka(2021); //jika memasukkan nilai diluar range 1960 - 2020 maka akan ke set default
        cek = C.getAngka();
        C.generasi(cek);
        
        System.out.println("=====================");
        System.out.println("DAFTAR NAMA MAHASISWA");
        System.out.println("=====================");
        System.out.println(A);
        System.out.println("");
        System.out.println(B);
        System.out.println("");
        System.out.println(C);
    }
    
}
