/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OSoalEmpatbelas;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class EmpatBelas {
    public static void main(String[] args){
        int nilai,nilaifaktorial = 1, i;
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        nilai = input.nextInt();
        System.out.print("Nilai Faktorial = ");
        for(i=1;i<nilai;i++){
            nilaifaktorial = nilaifaktorial*i;
            System.out.print(i+"*");
        }
        nilaifaktorial = nilaifaktorial*nilai;
        System.out.println(nilai + " = " + nilaifaktorial);
    }

}
