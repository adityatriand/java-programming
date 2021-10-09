/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review;

/**
 *
 * @author Adit
 */
public class ReviewAlpro 
{
    
    public static void tampil(int a[])
    {
        
        System.out.print("Data :");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
    public static int ratarata(int b[])
    {
        int total=0,rata;
        for(int i=0;i<b.length;i++)
        {
            total+=b[i];
        }
        
        System.out.println("\nTotal nilai : "+total);
        rata = total/b.length;
        return rata;
    }
    
    public static void urut(int c[])
    {
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c.length-1;j++)
            {
                if(c[j]>c[j+1])
                {
                    int temp = c [j];
                    c[j] = c [j+1];
                    c[j+1]=temp;
                }
            }
        }
        tampil(c);
    }
    
    public static void main(String[] args) 
    {
        int a[]={20,10,15,30,25};
        tampil(a);
        int rata = ratarata(a);
        System.out.println("Rata - rata : "+rata);
        urut(a);
        System.out.println("");
        
        for(int i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                System.out.print("-"+i);
            }
            else
            {
                System.out.print(i);
            }
        }
        System.out.println("");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(i);
            }
        }
        System.out.println("");
        int exit_flag;
        int flag = 1;
        char letter = 'Y';
        if(flag==1||letter!='X')
        {
            exit_flag=0;
        }
        else
        {
            exit_flag=1;
        }
        System.out.println("Exit Flag = "+exit_flag);
        
        int total = 0;
        int tebak = 1;
        if(total == tebak)
        {
            System.out.println(total);
        }
        else
        {
            System.out.println(tebak);
        }
        
        int bil=12;
        if(bil%2==0)
        {
            System.out.println("Genap");
        }
        else if(bil%2==1)
        {
            System.out.println("Ganjil");
        }
        else
        {
            System.out.println("Nol");
        }
    }
    
}
