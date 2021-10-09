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
public class DriverMahasiswa {
    public static void main(String[] args) {
        ADTMahasiswa siswa1 = new ADTMahasiswa();
        siswa1.setNama("Aditya Tri Ananda");
        siswa1.setNIM("09021181924019");
        siswa1.setPS("Teknik Informatika");
        siswa1.setAngkatan(2019);
        System.out.println(siswa1);
        ADTMahasiswa siswa2 = new ADTMahasiswa();
        siswa2.setNama("Budi Setiawan");
        System.out.println("");
        System.out.println(siswa2);
    }
}
