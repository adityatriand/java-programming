/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BelajarUas;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class ADT {
    static class ADTMahasiswa{
        private String name [];
        private int umur [];
        
        ADTMahasiswa(int i){
            this.name = new String [i];
            this.umur = new int [i];
        }
        
        String getName(int i){
            return this.name[i];
        }
        
        int getUmur(int i){
            return this.umur[i];
        }
        
        void setName(int i,String name){
            this.name[i] = name;
        }
        
        void setUmur(int i,int umur){
            this.umur[i] = umur;
        }
    }
    
    static class main{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Banyak orang = ");
            int banyak = input.nextInt();
            ADTMahasiswa N = new ADTMahasiswa(banyak);
            for(int i=0;i<banyak;i++){
                System.out.print("Masukkan Nama = ");
                String name = input.next();
                System.out.print("Masukkan Umur = ");
                int umur = input.nextInt();
                N.setName(i, name);
                N.setUmur(i, umur);
            }
            
            System.out.println("\nDaftar Nama dan Umur Mahasiswa");
            for(int i=0;i<banyak;i++){
                System.out.println("Nama = "+N.getName(i));
                System.out.println("Umur = "+N.getUmur(i));
                System.out.println();
            }
        }
    }
}
