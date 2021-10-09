/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pert6;
import java.util.Scanner;
/**
 *
 * @author Winxp3
 */
public class Kendaraan {
    public static void main(String[] args){
        int pil;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan Pilihan = ");
        pil = keyboard.nextInt();
        switch(pil){
            case 1:System.out.println("Naik Pesawat Terbang");break;
            case 2:System.out.println("Naik Kereta Api");break;
            case 3:System.out.println("Naik Bus");break;
            case 4:System.out.println("Naik Taksi");break;
            case 5:System.out.println("Naik Mobil Pribadi");break;
            case 6:System.out.println("Naik Motor");break;
            default :System.out.println("Anda Salah Memilih");break;

        }
    }

}
