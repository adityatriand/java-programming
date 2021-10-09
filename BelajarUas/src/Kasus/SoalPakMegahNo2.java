/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus;

/**
 *
 * @author Adit
 */
public class SoalPakMegahNo2 {
    public static double [] ambil(double A[])
    {
        int n = 0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>1.5 && A[i]<1.7)
            {
                n++;
            }
        }
        
        double tampung[] = new double [n];
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>1.5 && A[i]<1.7)
            {
                tampung[i]=A[i];
            }
        }
        
        return tampung;
    }
    
    public static void tampilurut(double a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<(a.length-1);j++)
            {
                if(a[j+1]<a[j])
                {
                    double temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        tampil(a);
    }
    
    public static void tampil(double ambil[])
    {
        for(int i=0;i<ambil.length;i++)
        {
            System.out.print(ambil[i]+"\t");
        }
    }
    
    public static void main(String[] args) {
        double [] beratbebek = {2.0, 1.9, 1.8, 1.6, 2.1, 2.3, 2.4};
        System.out.print("\nUkuran Berat sebelum diurut = ");
        tampil(beratbebek);
        System.out.print("\nUkuran Berat setelah diurut = ");
        tampilurut(beratbebek);
        System.out.print("\nUrutan Bebek yang diinginkan Mr. Dengklek = ");
        tampilurut(ambil(beratbebek));
        System.out.println("");
    }
}
