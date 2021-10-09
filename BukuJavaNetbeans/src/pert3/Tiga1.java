/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pert3;
import java.util.Scanner;
/**
 *
 * @author Winxp3
 */
public class Tiga1 {
    public static void main(String[] args){
        //
        int A, B, jumlah, kurang, kali, bagi, sisabagi;
        Scanner masuk = new Scanner(System.in);

        //
        System.out.print("Bilangan 1 : ");
        A = masuk.nextInt();

        System.out.print("Bilangan 2 : ");
        B = masuk.nextInt();

        jumlah = A+B;
        System.out.println("Jumlah = "  + jumlah);

        kurang = A-B;
        System.out.println("Kurang = " + kurang);

        kali = A*B;
        System.out.println("Kali = " + kali);

        bagi = A/B;
        System.out.println("Bagi = " + bagi);

        sisabagi = A%B;
        System.out.println("Sisa Bagi = " + sisabagi);
    }

}
