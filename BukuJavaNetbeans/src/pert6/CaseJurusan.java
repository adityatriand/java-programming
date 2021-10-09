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
public class CaseJurusan {
    public static void main(String[] args){
        int pil;
        Scanner keyboard = new Scanner(System.in);
        //
        System.out.print("Masukan Pilihan = ");
        pil = keyboard.nextInt();
        //
        switch(pil){
            case 1:System.out.println("Jurusan MI");break;
            case 2:System.out.println("Jurusan TK");break;
            case 3:System.out.println("Jurusan KA");break;
            case 4:System.out.println("Jurusan TI");break;
            case 5:System.out.println("Jurusan SI");break;
            default:System.out.println("Pilihan Salah!");break;
        }
    }

}
