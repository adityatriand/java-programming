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
public class ArrayDimensi2 
{
    public static void tampil(int array[][])
    {
        System.out.println("Data : ");
         for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void tampil(char array1[][])
    {
        System.out.println("Data : ");
        for(int i=0;i<array1.length;i++)
        {
            for(int j=0;j<array1.length;j++)
            {
                System.out.print(array1[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String [] args)
    {
        char [][]grade = {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
        tampil(grade);
        
        int A[][]={{7,3},{8,8}};
        int B[][]={{3,1},{4,-2}};
        int C[][]= new int [2][2];
        for(int i=0;i<C.length;i++)
        {
            for(int j=0;j<C.length;j++)
            {
                C[i][j]= A[i][j]+B[i][j];
            }
        }
        tampil(C);
    }
    
}
