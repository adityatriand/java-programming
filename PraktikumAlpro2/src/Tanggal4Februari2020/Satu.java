/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal4Februari2020;

/**
 *
 * @author Adit
 */
public class Satu {

    public static void cetak(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
    public static int maximum(int a[])
    {
        int max = a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        return max;
    }
    
    public static int[] reverse(int a[])
    {
        int temp = 0;
        int balik[]= new int [a.length];
        for(int i=a.length-1;i>=0;i--,temp++)
        {
            balik[temp]=a[i];
        }
        return balik;
    }
    
    public static void main(String[]args)
    {
        int data[]={5,4,3,1,2};
        cetak(data);
        System.out.println("\n"+maximum(data));
        cetak(reverse(data));
    }
}
