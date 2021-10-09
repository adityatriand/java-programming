/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No3;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class TigaIf {
    public static void main(String[] args) {
        String ukuran;
        Scanner masuk = new Scanner(System.in);
        System.out.println("UKURAN BAJU");
        System.out.println("===========");
        System.out.print("Masukan Pilihan Ukuran Baju (S/M/L/XL/XXL) = ");
        ukuran = masuk.nextLine();
        if("S".equals(ukuran)){System.out.println("Ukuran kecil");}
        else if("M".equals(ukuran)){ System.out.println("Ukuran sedang");}
        else if("L".equals(ukuran)){System.out.println("Ukuran besar");}
        else if("XL".equals(ukuran)){System.out.println("Ukuran extra besar");}
        else if("XXL".equals(ukuran)){System.out.println("Ukuran extra sangat"
                + " besar");}
        else{System.out.println("Maaf pilihan Anda salah.Ulangi!!!");}
    } 
}
