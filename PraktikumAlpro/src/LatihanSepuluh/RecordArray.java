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
class Rekaman{
    String NIM;
    String nama;
    int umur;
}
public class RecordArray {
    public static void main(String [] args){
        Rekaman rec[];
        rec = new Rekaman[3];
        
        rec[0]= new Rekaman();
        rec[0].NIM="012345";
        rec[0].nama="pinokio";
        rec[0].umur=5;
        System.out.println("NIM  = "+rec[0].NIM);
        System.out.println("Nama = "+rec[0].nama);
        System.out.println("Umur = "+rec[0].umur);
        System.out.println("+++++++++++++++");
        
        rec[1]= new Rekaman();
        rec[1].NIM="06789";
        rec[1].nama="angga";
        rec[1].umur=6;
        System.out.println("NIM  = "+rec[1].NIM);
        System.out.println("Nama = "+rec[1].nama);
        System.out.println("Umur = "+rec[1].umur);
        System.out.println("+++++++++++++++");
        
        rec[2]= new Rekaman();
        rec[2].NIM="01729";
        rec[2].nama="wati";
        rec[2].umur=5;
        System.out.println("NIM  = "+rec[2].NIM);
        System.out.println("Nama = "+rec[2].nama);
        System.out.println("Umur = "+rec[2].umur);
        System.out.println("+++++++++++++++");
        
        }
        
}
