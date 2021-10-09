/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal20Oktober2020SeqSearch;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class searchMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matriks [][] = new int [50][50];
        for(int i=0;i<matriks.length;i++){
            for(int j=0;j<matriks[0].length;j++){
                matriks[i][j]= (int)(Math.random()*100);
            }
        }
        
        for(int i=0;i<matriks.length;i++){
            for(int j=0;j<matriks[0].length;j++){
                System.out.print(matriks[i][j]+"  ");
            }
            System.out.println("");
        }
        
        //Mencari nilai max
        int max = matriks[0][0];//membuat inisialiasi variabel max dengan nilai = nilai matriks di index [0][0]
        for(int i=0;i<matriks.length;i++){
            for(int j=0;j<matriks[0].length;j++){
                if(matriks[i][j]>max){
                    max = matriks[i][j];
                }
            }
        }
        System.out.println("\nNilai terbesar pada matriks = "+max);
        
        //Mencari suatu elemen
        int cari;
        System.out.print("\nMasukkan nilai yang ingin dicari = ");
        cari = input.nextInt();
        boolean cek = false;
        for(int i=0;i<matriks.length;i++){
            for(int j=0;j<matriks[0].length;j++){
                if(cari == matriks[i][j]){
                    cek = true;
                }
            }
        }
        if(cek){
            System.out.println("Ada");
        }
        else{
            System.out.println("Tidak Ada");
        }
        
        //Mencari index terakhir dimana nilai yang dicari berada
        int index = -1;
        int index2 = -1;
        for(int i=0;i<matriks.length;i++){
            for(int j=0;j<matriks[0].length;j++){
                if(cari == matriks[i][j]){
                    index = i;
                    index2 = j;
                }
            }
        }
        System.out.println("\nPenghitungan Baris dan Kolom dimulai dari 0");
        if(index != -1 && index2 != -1){
            System.out.println("Indeks terakhir berada di baris "+index+" kolom "+index2);
        }
        
        //Menghitung jumlah kemunculan
        int muncul = 0;
        for(int i=0;i<matriks.length;i++){
            for(int j=0;j<matriks[0].length;j++){
                if(cari == matriks[i][j]){
                    muncul++;
                }
            }
        }
        System.out.println("\nJumlah Kemunculan = "+muncul);
        
        
        //sebenarnya for bisa dijadikan satu for saja untuk operasi operasi diatas.
        //namum dalam hal ini saya pisahkan agar source code untuk tiap nomor jelas adanya.
    }
}
