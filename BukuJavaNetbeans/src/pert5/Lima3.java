/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pert5;
import java.util.Scanner;
/**
 *
 * @author Winxp3
 */
public class Lima3 {
    public static void main(String[] args){
        //
        int bil;
        Scanner keyboard = new Scanner(System.in);
        //
        System.out.print("Masukan Bilangan = ");
        bil = keyboard.nextInt();
        if(bil==1)
            System.out.println("Jurusan Sistem Komputer");
        else if(bil==2)
            System.out.println("Jurusan Teknik Informatika");
        else if(bil==3)
            System.out.println("Jurusan Sistem Informasi");
    }

}
