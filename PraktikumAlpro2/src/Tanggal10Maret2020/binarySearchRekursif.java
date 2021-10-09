/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal10Maret2020;

/**
 *
 * @author Adit
 */
public class binarySearchRekursif {
    static int binarysearch2(int A[], int x, int awal, int akhir)
    {
        int tengah = (awal+akhir)/2;
        if(awal>akhir)
        {
            return -1;
        }
        else if(A[tengah]== x)
        {
            return tengah;
        }
        else if(x>A[tengah])
        {
            return binarysearch2(A,x,tengah+1,akhir);
        }
        else
        {
            return binarysearch2(A,x,awal,tengah-1);
        }
    }
    
    public static void main(String[]args)
    {
        int array [] = {1,3,5,7,9};
        System.out.println(binarysearch2(array,3,0,array.length-1));
    }
}
