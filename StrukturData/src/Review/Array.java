/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Array 
{
    public static void tampil(int array[])
    {
        System.out.print("\nData : ");
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    
    public static void main(String[]args)
    {
        int a[]= {10,7,4,2,1};
        tampil(a);
        
        Scanner input = new Scanner(System.in);
        int b [] = new int [10];
        System.out.println("");
        for(int i=0;i<b.length;i++)
        {
            System.out.print("Data "+(i+1)+" = ");
            b[i] = input.nextInt();
        }
        
        tampil(b);
    }
    
    
}
