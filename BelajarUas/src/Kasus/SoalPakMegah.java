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
public class SoalPakMegah {
    
    public static void tampil (int buah[])
    {
        for(int i=0;i<buah.length;i++)
        {
            System.out.print(buah[i]+" ");
        }
    }
    
    public static void tukaramir(int amir[], int budi[])
    {
        int x = amir.length;
        int temp [] = new int [x];
        for(int i=0;i<temp.length;i++)
        {
            temp [i]=amir[i];
        }
        
        for(int i=0;i<amir.length;i++)
        {
            amir [i]=0;
        }
        amir = new int [budi.length];
        for(int i=0;i<amir.length;i++)
        {
            amir[i]= budi[i];
        }
        System.out.print("Buah Amir = ");
        tampil(amir);
        for(int i=0;i<budi.length;i++)
        {
            budi[i]=0;
        }
        budi = new int[x];
        for(int i=0;i<budi.length;i++)
        {
            budi[i]= temp[i];
        }
        System.out.print("\nBuah Budi = ");
        tampil(budi);
    }
    
    public static void main(String [] args)
    {
        int amir [] =  {1,2,3,4,5};
        int budi [] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Data sebelum ditukar\n");
        System.out.print("Buah Amir = ");
        tampil(amir);
        System.out.print("\nBuah Budi = ");
        tampil(budi);
        System.out.println("");
        
        System.out.println("\nData Setelah ditukar\n");
        tukaramir(amir,budi);
        System.out.println("");
    }

}
