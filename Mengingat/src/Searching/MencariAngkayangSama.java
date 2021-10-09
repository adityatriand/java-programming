/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.Random;

/**
 *
 * @author Adit
 */
public class MencariAngkayangSama 
{
    public static void main(String [] args)
    {
        Random ran = new Random();
        boolean cek;
        int A [] = new int [10];
        for(int i=0;i<A.length;i++)
        {
            A[i] = ran.nextInt(5);
        }
        
        System.out.print("Data : ");
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
        
        System.out.print("\nData yang tidak sama : ");
        
        for(int i=0;i<A.length;i++)
        {
            cek=false;
            for(int j=0;j<i;j++)
            {
                if(A[j]==A[i])
                {
                    cek = true;
                    break;
                }
            }
            if(cek==false)
            {
                System.out.print(A[i]+" ");
            }
        }
    }
}
