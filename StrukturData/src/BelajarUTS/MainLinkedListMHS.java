/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BelajarUTS;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class MainLinkedListMHS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu = 0;
        LinkedListMHS Mahasiswa = new LinkedListMHS();
        while(menu!=4){
            System.out.println("=====================================");
            System.out.println("SELAMAT DATANG DI PENDATAAN MAHASISWA");
            System.out.println("=====================================");
            System.out.println("1.Input Data\n2.Tampil Data\n3.Delete Data\n4.Keluar");
            System.out.print("Pilihan anda = ");
            menu = input.nextInt();
            System.out.println("=====================================");
            switch(menu){
                case 1 : int pil;
                         System.out.println("1.Input di Awal\n2.Input di akhir\n3.Input ke index");
                         System.out.print("Pilihan Anda = ");
                         pil = input.nextInt();
                         System.out.println("=====================================");
                         if(pil==1){Mahasiswa.insertfirst(Mahasiswa);}
                         else if(pil==2){Mahasiswa.insertlast(Mahasiswa);}
                         else if(pil==3){
                             int index;
                             System.out.print("Index ke = ");
                             index = input.nextInt();
                             Mahasiswa.insertafter(Mahasiswa,index);
                         }
                         else{System.out.println("Masukkan Anda Salah");}break;
                case 2 : System.out.println("=====================================");
                         Mahasiswa.view(Mahasiswa); break;
                case 3 : int pil2;
                         System.out.println("=====================================");
                         System.out.println("1.Delete di Awal\n2.Delete di akhir\n3.Delete ke index");
                         System.out.print("Pilihan Anda = ");
                         pil2 = input.nextInt();
                         if(pil2==1){Mahasiswa.deleteFirst(Mahasiswa);}
                         else if(pil2==2){Mahasiswa.deleteLast(Mahasiswa);}
                         else if(pil2==3){
                             int index;
                             System.out.print("Index ke = ");
                             index = input.nextInt();
                             Mahasiswa.deleteAfter(Mahasiswa,index);
                         }
                         else{System.out.println("Masukkan Anda Salah");}break;
                case 4 : System.out.println("Anda Keluar dari Sistem. Terima Kasih");break;
                default : System.out.println("Masukkan Anda Salah");break;
            }
        }
    }   
}
