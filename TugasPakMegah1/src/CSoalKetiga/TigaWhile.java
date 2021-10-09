/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSoalKetiga;
import java.util.Scanner;
/**
 *
 * @author Adit
 */
public class TigaWhile {
    public static void main(String[] args){
        //Library
        int N;
        Scanner input=new Scanner(System.in);
        //Output
        System.out.println("PANTULAN BOLA KARET");
        System.out.println("===================");
        System.out.print("Ketinggian Awal = ");
        N=input.nextInt();
        //Perulangan
       while (N>0){
           System.out.print("Tinggi "+N);
           --N;
           System.out.println(" ,mantul turun menjadi "+N);
       }
        System.out.println("Tinggi 0 ,tidak mantul");
    } 
}
