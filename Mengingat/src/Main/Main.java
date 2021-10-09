/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Sequence.*;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Main 
{
    public static void main(String [] args)
    {
//        Sequence.OperasiMatematika.operasiMatematika();
//        Scanner input = new Scanner(System.in);
//        int a;
//        System.out.print("Masukkan bilangan = ");
//        a = input.nextInt();
//        long start = System.nanoTime();
//        while(a!=1){
//            for(int i=2;i<=a;){
//                if(a%i==0){
//                    System.out.print(i+" ");
//                    a/=i;
//                }
//                else{
//                    i++;
//                }
//            }
//        }
//        long end = System.nanoTime();
//        System.out.print(1+"\n");
//        long time = end - start;
//        System.out.println(time);
        int n, m, r;
 
        Scanner dataInput = new Scanner(System.in);

        System.out.print("Masukkan nila n : ");
        n = dataInput.nextInt();
        System.out.print("Masukkan nila m : ");
        m = dataInput.nextInt();
        System.out.println();

        r = m % n;
        long start = System.nanoTime();
        while (r != 0) {
            n = m;
            m = r;
            r = n % m;
        }
        long end = System.nanoTime();
        long time = end - start;
        System.out.println(time);
        System.out.println("FPB = "+m);
    }
    
}
