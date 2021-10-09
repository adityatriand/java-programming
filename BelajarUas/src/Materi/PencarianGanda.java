/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materi;

/**
 *
 * @author Adit
 */
public class PencarianGanda {
    static int []pencarian(int A[], int dicari)
    {
        int [] b = new int [10];
        int n = 0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]== dicari)
            {
                n++;
                b[n]=i;
            } 
        }
        b[0]=n;
        return b;
    }
    
    public static void main(String[] args) {
        int A[]={11,12,5,13,12,41,32,20,120};
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+",");
        }
        
        int dicari = 12;
        int tampung[]= pencarian(A,dicari);
        if(tampung[0]==0)
        {
            System.out.println("Tidak Ketemu");
        }
        else
        {
            System.out.println("\nPencarian ketemu di elemen ke-");
            for(int i=1;i<tampung.length;i++)
            {
                System.out.print(tampung[i]!=0?tampung[i]+",":"");
            }
        }
    }
}
