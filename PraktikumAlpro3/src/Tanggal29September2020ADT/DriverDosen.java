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
public class DriverDosen {
    public static void main(String[] args) {
        ADTDosen dosen1 = new ADTDosen("Aditya",-12);
        System.out.println(dosen1); // umur akan ke default
        ADTDosen dosen2 = new ADTDosen();
        System.out.println(dosen2); // print default
        dosen2.setNama("Budi Setiawan");
        dosen2.setUmur(56);
        System.out.println(dosen2);
    }
}
