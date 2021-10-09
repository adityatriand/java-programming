/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class DuaSwitch {
    public static void main(String[] args){
        char ukuran;
        Scanner masuk = new Scanner(System.in);
        System.out.println("UKURAN BAJU");
        System.out.println("===========");
        System.out.print("Masukan Pilihan Ukuran Baju (S/M/L) = ");
        ukuran = masuk.next().charAt(0);
        switch(ukuran){
            case 'S':System.out.println("Ukuran kecil");break;
            case 'M':System.out.println("Ukuran sedang");break;
            case 'L':System.out.println("Ukuran besar");break;
            default :System.out.println("Maaf pilihan Anda salah.Ulangi!!!");break;
        }
    }
}
