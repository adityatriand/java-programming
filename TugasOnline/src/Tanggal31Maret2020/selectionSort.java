/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal31Maret2020;

/**
 *
 * @author Adit
 */
public class selectionSort {    
    public static void tampil(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
    public static int [] menaikmax(int a[])
    {
        int i = a.length-1;
        while(i>0)
        {
            int index = 0;
            int max = a[0];
            int temp;
            for(int j=1;j<=i;j++)
            {
                if(max < a[j])
                {
                    index = j;
                    max = a[j];
                } 
            }
            temp = a[i];
            a[i] = a[index];
            a[index] = temp;
            i--;
        }
        return a;
    }
    
    public static int [] menurunmax(int a[])
    {
        int i = 0;
        while(i<a.length-1)
        {
            int index = i;
            int max = a[i];
            int temp;
            for(int j = i+1;j<a.length;j++)
            {
                if(max < a[j])
                {
                    index = j;
                    max = a[j];
                }
            }
            temp = a[i];
            a[i] = a[index];
            a[index] = temp;
            i++;
        }
        return a;
    }
    
    public static int [] menaikmin(int b[])
    {
        int i=0;
        while(i<b.length-1)
        {
            int index;
            int min = b[i];
            int temp;
            for(int j = i+1;j<b.length;j++)
            {
                if(min > b[j])
                {
                    index = j;
                    min = b[j];
                    temp = b[i];
                    b[i] = b[index];
                    b[index] = temp; 
                }
            }    
            i++;
        }
        return b;
    }
    
    public static int [] menurunmin(int b[])
    {
        int i=0;
        while(i<b.length-1)
        {
            int index;
            int min = b[i];
            int temp;
            for(int j = i+1;j<b.length;j++)
            {
                if(min < b[j])
                {
                    index = j;
                    min = b[j];
                    temp = b[i];
                    b[i] = b[index];
                    b[index] = temp; 
                }
            }    
            i++;
        }
        return b;
    }
    
    public static void main(String [] args)
    {
        int array [] = {4,23,1,10,3,2};
        System.out.println("Selection Sort");
        System.out.println("==============");
        System.out.print("Data sebelum diurut = ");
        tampil(array);
        System.out.print("\nData sesudah diurut (Menaik Max)  = ");
        tampil(menaikmax(array));
        System.out.print("\nData sesudah diurut (Menurun Max) = ");
        tampil(menurunmax(array));
        System.out.print("\nData sesudah diurut (Menaik Min)  = ");
        tampil(menaikmin(array));
        System.out.print("\nData sesudah diurut (Menurun Min) = ");
        tampil(menurunmin(array));
        System.out.println("");
    }

}
