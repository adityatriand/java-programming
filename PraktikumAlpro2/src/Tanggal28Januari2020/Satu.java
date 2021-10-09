/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal28Januari2020;

/**
 *
 * @author Adit
 */
public class Satu {
    public static void main(String[] args) {
        System.out.println(pangkat());
        System.out.println(faktorial());
        System.out.println(faktorial2(3));
        System.out.println(fibonaci(8));
    }
    
    public static int pangkat()
    {
        int n = 3;
        int a =1;
        for(int i=1;i<=n;i++)
        {
            a = a*n;
        }
        return a;
    }
    
    public static int faktorial()
    {
        int n = 5;
        int a = 1;
        for(int i=n;i>0;i--)
        {
            a = a*i;
        }
        return a;
    }
    
    public static int faktorial2(int a)
    {
        if(a==0)
            return 1;
        else
            return a*faktorial2(a-1); 
    }
    
    public static int fibonaci(int a)
    {
        int b = a+1;
        int nilai[]= new int [b];
        nilai[0]=0;
        nilai[1]=1;
        int total = 0;
        for(int i=2;i<nilai.length;i++)
        {
            nilai[i]=nilai[i-1]+nilai[i-2];
        }
        return nilai[a];
    }
    
    public static int fibonaci2(int a)
    {
        if(a<=2)
            return 1;
        return fibonaci2(a-1)+fibonaci2(a-2);
    }
    
    //cari fobonaci tanpa array
}
