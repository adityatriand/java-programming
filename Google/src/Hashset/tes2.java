/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashset;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class tes2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int banyak;
        System.out.print("Banyak = ");
        banyak = input.nextInt();
        int data[]= new int [banyak];
        for(int i=0;i<data.length;i++)
        {
            System.out.print("Data ke-"+(i+1)+" = ");
            data[i]= input.nextInt();
        }
        int data2 []=new int [data.length];
        boolean sama;
        data2[0]=data[0];
        for(int i=1;i<data.length-1;i++)
        {
            for(int j=0;j<data.length-1;j++)
            {
                if(data2[0]!=data[j])
                {
                    sama = false;
                    for(int k=0;k<data2.length;k++)
                    {
                        if(data[j]==data2[k])
                        {
                            sama = true;
                            break;
                        }
                    }
                    if(sama==false)
                    {
                        data2[i]= data[j];
                        break;
                    }
                }
            }
        }
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<data2.length;i++){
        System.out.print(data2[i]+" ");
    }
    }
}
