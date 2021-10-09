/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabut;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class belajardaffa1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //misal adel ujian anatomi. kalo adel dapet nilai lebih dari sama dengan 86 print Adel dapet A
        //kalo misal adel dapet nilai lebih dari sama dengan 76 dan kurang dari 86 print Adel dapet B
        //kalo misalnyo nilainya selain dari diatas print Adel dapet C
        int nilai;
        System.out.print("Masukkan Nilai = ");
        nilai = input.nextInt(); //masukkan nilai
        
        if(nilai >= 86){
            System.out.println("Adel dapet A");
        }
        else if(nilai >= 76 && nilai <= 86){
            System.out.println("Adel dapet B");
        }
        else{
            System.out.println("Adel dapet C");
        }
    }
}
