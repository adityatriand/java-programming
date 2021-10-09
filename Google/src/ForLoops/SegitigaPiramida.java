/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForLoops;
import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class SegitigaPiramida {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Masukan Input = ");
        int tinggi = key.nextInt();
        //
        for (int t=1;t<=tinggi;t++){
            for(int s=t;s<=tinggi;s++){
                System.out.print("");
            }
            for(int b=0;b<=(t*2)-2;b++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
