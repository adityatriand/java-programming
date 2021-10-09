/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ascending;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class BubbleSorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int banyak;
        System.out.print("Masukkan Banyak Data = ");
        banyak = input.nextInt();
        int data[]= new int [banyak];
        for(int i=0;i<data.length;i++)
        {
            System.out.print("Data ke-"+(i+1)+" = ");
            data[i]= input.nextInt();
        }
        System.out.print("Data sebelum di sorting =\t");
        for(int i=0;i<data.length;i++)
        {
            System.out.print(data[i]+"\t");
        }
        
        for(int i=0;i<data.length;i++)
        {
            for(int j=0;j<data.length-1;j++)
            {
                if(data[j]>data[j+1])
                {
                    int temp = data [j];
                    data [j] = data [j+1];
                    data[j+1]=temp;
                }
            }
        }
        System.out.print("\nData setelah di sorting =\t");
        for(int i=0;i<data.length;i++)
        {
            System.out.print(data[i]+"\t");
        }
    }
}
