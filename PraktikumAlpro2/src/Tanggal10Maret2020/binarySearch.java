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
public class binarySearch {
    
    public static int search(int A[], int x)
    {
        int awal = 0;
        int akhir = A.length-1;
        int tengah  = -1;
        boolean ketemu = false;
        while(ketemu == false && awal <= akhir) 
        {
            tengah = (awal+akhir)/2;
            if(x == A[tengah])
            {
                ketemu = true;
            }
            else if(x > tengah)
            {
                awal = tengah+1;
            }
            else
            {
                akhir = tengah -1;
            }
        }
        if(ketemu == true)
        {
            return tengah;
        }
        else
        {
            return -1;
        }
    }
    
    public static void main(String[] args) 
    {
        int array [] = {1,3,5,7,9};
        System.out.println(search(array,7));
    }

}
