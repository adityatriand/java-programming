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
public class ExistdanIndex {
    
    boolean isExist(int a[],int b)
    {
        for(int i=0;i<a.length;i++)
        {
            if(b==a[i])
            {
                return true;
            }
        }
        
        return false;
    }
    
    int cariSequential(int a[], int b)
    {
        for(int i=0;i<a.length;i++)
        {
            if(b==a[i])
            {
                return i;
            }
        }
        
        return -1;
    }
    
    int cariSequential2(int a[], int b)
    {
         for(int i= a.length-1;i>=0;i--)
        {
            if(b==a[i])
            {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[]args)
    {
        ExistdanIndex panggil = new ExistdanIndex ();
        int array[]={1,3,5,7,9,3};
        System.out.println(panggil.isExist(array, 5));
        System.out.println(panggil.cariSequential(array, 7));
        System.out.println(panggil.cariSequential2(array, 3));
    }
}
