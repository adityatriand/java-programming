/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISoalSembilan;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class SembilanFor {
    public static void main(String[] args){
        int n,u = 0, jum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Operasi Aritmatika dengan a = 3 dan b = 3");
        System.out.println("=========================================");
        System.out.print("Banyak Suku = ");
        n = input.nextInt();
        for(int i=1;i<=n;i++){
        u = 3*i;
        jum += u;
        }
        System.out.println("Nilia Sukunya = "+u);
        System.out.println("Jumlah suku ke-"+n+" = "+jum);
    }
}
