/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coba1;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Array2Dimensi {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        int arr[][]= {{3,4},{4,3}};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
