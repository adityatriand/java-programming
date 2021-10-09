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
public class ChannelTV {
    public static void main(String[] args){
        int pil;
        Scanner keyboard = new Scanner(System.in);
        //
        System.out.print("Masukan Pilihan = ");
        pil = keyboard.nextInt();
        //
        switch(pil){
            case 1:System.out.println("Trans7");break;
            case 2:System.out.println("RCTI");break;
            case 3:System.out.println("ANTV");break;
            case 4:System.out.println("INDOSIAR");break;
            case 5:System.out.println("TransTV");break;
            case 6:System.out.println("TVONE");break;
            case 7:System.out.println("SCTV");break;
            case 8:System.out.println("MetroTV");break;
            case 9:System.out.println("GlobalTV");break;
            case 10:System.out.println("MNCTV");break;
            case 11:System.out.println("TVRI");break;
            case 12:System.out.println("NETTV");break;
            case 13:System.out.println("PALTV");break;
            case 14:System.out.println("SRIWIJAYATV");break;
            case 15:System.out.println("INEWSTV");break;
            default:System.out.println("Pilihan Kosong");break;
        }
    }

}
