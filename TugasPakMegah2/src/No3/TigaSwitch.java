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
public class TigaSwitch {
    public static void main(String[] args) {
        String ukuran;
        Scanner masuk = new Scanner(System.in);
        System.out.println("UKURAN BAJU");
        System.out.println("===========");
        System.out.print("Masukan Pilihan Ukuran Baju (S/M/L/XL/XXL) = ");
        ukuran = masuk.nextLine();
        switch (ukuran) {
            case "S":System.out.println("Ukuran kecil");break;
            case "M":System.out.println("Ukuran sedang");break;
            case "L":System.out.println("Ukuran besar");break;
            case "XL":System.out.println("Ukuran extra besar");break;
            case "XXL":System.out.println("Ukuran extra sangat besar");break;
            default:System.out.println("Maaf pilihan Anda salah.Ulangi!!!");break;
        }
    } 
}
