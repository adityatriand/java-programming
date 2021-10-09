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
public class belajardaffa2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahjam;
        int gajipokok;
        int uanglembur;
        int totalgaji;
        System.out.println("PERUSAHAAN PT XYZ");
        System.out.println("Nama : Daffa");
        System.out.print("Jumlah jam kerja : ");
        jumlahjam = input.nextInt();
        
        gajipokok = jumlahjam*10000;
        if(jumlahjam > 30){
            uanglembur = (jumlahjam-30)*12500;
        }
        else{
            uanglembur = 0;
        }
        
        totalgaji = gajipokok + uanglembur;
        System.out.println("Gaji yang diterima : "+totalgaji);
    }
}
