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
public class satu {
    public static void tampil(int ambil[])
    {
        for(int i=0;i<ambil.length;i++)
        {
            System.out.print(ambil[i]+"\t");
        }
    }
    
    public static void menaikbubblesort(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<(a.length-1);j++)
            {
                if(a[j+1]<a[j])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        tampil(a);
    }
    
    public static void menurunbubblesort(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<(a.length-1);j++)
            {
                if(a[j+1]>a[j])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        tampil(a);
    }
    
    public static void menaikselectionsort(int b[])
    {
        for(int i = 0; i < (b.length-1); i++)
        {
            int index = 0;
            int min = b[i];
            for(int j = i+1;j<b.length;j++)
            {
                if(min > b[j])
                {
                    index = j;
                    min = b[j];
                    int temp = b[i];
                    b[i] = b[index];
                    b[index] = temp; 
                }
            }
        }
        tampil(b);
    }
    
    public static void menurunselectionsort(int b[])
    {
        for(int i = 0; i < (b.length-1); i++)
        {
            int index = 0;
            int max = b[i];
            for(int j = i+1;j<b.length;j++)
            {
                if(max < b[j])
                {
                    index = j;
                    max = b[j];
                    int temp = b[i];
                    b[i] = b[index];
                    b[index] = temp; 
                }
            }
        }
        tampil(b);
    }
    
    public static void menaikinsertionsort(int c[])
    {
        for(int i = 0; i < (c.length-1); i++)
        {
            for(int j = i+1; j > 0; j--)
            {
                if(c[j]<c[j-1])
                {
                    int temp = c[j];
                    c[j] = c[j-1];
                    c[j-1] = temp;
                }
            }
        }
        tampil(c);
    }
    
    public static void menuruninsertionsort(int c[])
    {
        for(int i = 0; i < (c.length-1); i++)
        {
            for(int j = i+1; j > 0; j--)
            {
                if(c[j]>c[j-1])
                {
                    int temp = c[j];
                    c[j] = c[j-1];
                    c[j-1] = temp;
                }
            }
        }
        tampil(c);
    }
    
    public static boolean isExist(int d[],int e)
    {
        for(int i=0;i<d.length;i++)
        {
            if(e==d[i])
            {
                return true;
            }
        }
        
        return false;
    }
    
    public static int cariSequential(int d[], int e)
    {
        for(int i=0;i<d.length;i++)
        {
            if(e==d[i])
            {
                return i;
            }
        }
        
        return -1;
    }
    
    public static int binarysearch(int A[], int x)
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
        int array [] = {5,12,16,3,4};
        tampil(array);
        System.out.println("");

        menaikbubblesort(array);
        System.out.println("");
        menurunbubblesort(array);
        System.out.println("");
        
        menaikselectionsort(array);
        System.out.println("");
        menurunselectionsort(array);
        System.out.println("");
        
        menaikinsertionsort(array);
        System.out.println("");
        menuruninsertionsort(array);
        System.out.println("");
        
        System.out.println(isExist(array,5));
        System.out.println(cariSequential(array,5));
        
        System.out.println(binarysearch(array,5));
        System.out.println(binarysearch2(array,5,0,array.length-1));
    }
}
