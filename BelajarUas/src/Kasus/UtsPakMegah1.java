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
public class UtsPakMegah1 {
    
    public static String isExist(int A[],int dicari)
    {
        
        for(int i=0;i<A.length;i++)
        {
            if(dicari==A[i])
            {
                return "Ketemu";
            }
        }
        
        return "Tidak";
    }
    
    public static int cari(int A[], int dicari, int ganti)
    {
        boolean cek = false;
        for(int i=0;i<A.length;i++)
        {
            if(dicari==A[i])
            {
                return ganti;
            }
        }
        return -1 ;
    }
    
    public static void tampil(int ambil[])
    {
        for(int i=0;i<ambil.length;i++)
        {
            System.out.print(ambil[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int A[] = {4,3,5,2,1};
        int dicari = 3;
        int ganti = 10;
        System.out.print("Data = ");
        tampil(A);
        System.out.println("\nData yang dicari = "+dicari);
        System.out.println("Data pengganti : jika ada = "+ganti+", jika tidak ada = -1");
        System.out.println("Status Pencarian = "+isExist(A,dicari));
        System.out.println("Variabel Pengganti = "+cari(A,dicari,ganti));
    }
}
