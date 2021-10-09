/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pert9;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class InputNilai {
    public static void main (String[] args){
        int i;
        double data [], nilai;
        Scanner input = new Scanner(System.in);
        data = new double [5];
        for (i=0;i<5;i++){
            System.out.print("Data ke"+(i+1)+": ");
            nilai = input.nextDouble();
        }
    }
    
}
