/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class RotateArray {
    public static void main (String[] args) {
            //code
            Scanner input = new Scanner(System.in);
            int T = input.nextInt();
            int idx = 0;
            do{
                int N = input.nextInt();
                int D = input.nextInt();
                int arr [] = new int [N];
                for(int i=0;i<arr.length;i++){
                    arr[i]=input.nextInt();
                }
                for(int i=0;i<D;i++){
                    for(int j=0 ;j<arr.length-1;j++){
                        int temp = arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
                for(int j=0;j<arr.length;j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
                idx++;
            }while(idx!=T);
    }
}
