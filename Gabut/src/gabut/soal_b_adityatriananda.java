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
public class soal_b_adityatriananda {
    public static void main(String[] args) {
        Random ran = new Random();
        int n;
        n = ran.nextInt((int)Math.pow(10,8));
        System.out.println(n);
        if((n+1)%2 == 0) System.out.println((n+1)/2);
        else System.out.println(n+1);
    }
}
