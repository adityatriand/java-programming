/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Kromosom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char [] M = new char [5];
        char [] F = new char [5];
        //mengisi array of char dari M
        System.out.println("Masukkan karakter untuk M ('G','A','T','C')");
        for(int i=0;i<M.length;i++){
            M[i]= input.next().charAt(0);
        }
        //mengisi array of char dari F
        System.out.println("Masukkan karakter untuk F ('G','A','T','C')");
        for(int i=0;i<F.length;i++){
            F[i]= input.next().charAt(0);
        }
        
        //menampilkan isi dari M
        System.out.print("\nKromosom M = ");
        for(int i=0;i<M.length;i++){
            System.out.print(M[i]+" ");
        }
        //menampilkan isi dari F
        System.out.print("\nKromosom F = ");
        for(int i=0;i<F.length;i++){
            System.out.print(F[i]+" ");
        }
        
        int idx;
        System.out.print("\nMau dimulai dari index berapa untuk penyilangan = ");
        idx = input.nextInt();
//        //lakukan penyalinan terlebih dahulu
//        char temp [] = new char [M.length];
//        char temp2 [] = new char [F.length];
//        for(int i=0;i<temp.length;i++){
//            temp[i]=M[i];
//        }
//        for(int i=0;i<temp2.length;i++){
//            temp2[i]= F[i];
//        }
        
        //pertukaran
        for(int i=idx;i<M.length;i++){
            char temp = M[i];
            M[i]= F[i];
            F[i]=temp;
        }
        
        //menampilkan isi dari M baru
        System.out.print("\nKromosom M baru = ");
        for(int i=0;i<M.length;i++){
            System.out.print(M[i]+" ");
        }
        //menampilkan isi dari F baru
        System.out.print("\nKromosom F baru = ");
        for(int i=0;i<F.length;i++){
            System.out.print(F[i]+" ");
        }
        
        
    }
}
