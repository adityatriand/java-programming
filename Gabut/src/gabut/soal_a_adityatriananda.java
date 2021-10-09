/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabut;

import java.util.Random;

/**
 *
 * @author Adit
 */
public class soal_a_adityatriananda {
    public static void main(String[] args) {
        Random ran = new Random();
        int n, h;
        int a, lbr = 0;
        n = ran.nextInt(1000) + 1;
        h = ran.nextInt(1000) + 1;
        System.out.println(n + " " + h);
//        long start = System.nanoTime();
        for(int i=0;i<n;i++){
            a = ran.nextInt(2*h) + 1;
            System.out.print(a+" ");
            if(a > h) lbr += 2;
            else lbr += 1;
        }
//        long end = System.nanoTime();
//        long time = end - start;
        System.out.println("\n"+lbr);
//        System.out.println("Waktu = "+time);
    }
}
