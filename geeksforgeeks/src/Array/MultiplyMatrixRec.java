/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Adit
 */
public class MultiplyMatrixRec {
      
    // Note that below variables are static 
    // i and j are used to know current cell of 
    // result matrix C[][]. k is used to know 
    // current column number of A[][] and row 
    // number of B[][] to be multiplied 
    public static int i = 0, j = 0, k = 0; 
    static void multiplyMatrixRec(int row1, int col1, int A[][], 
                       int row2, int col2, int B[][], 
                       int C[][]) 
    { 
        // If all rows traversed 
        if (i >= row1){ 
            return; 
        }
   
        // If i < row1 
        if (j < col2) 
        { 
            if (k < col1) 
            { 
                C[i][j] += A[i][k] * B[k][j]; 
                k++; 
   
                multiplyMatrixRec(row1, col1, A, row2, col2, B, C); 
            } 
   
            k = 0; 
            j++; 
            multiplyMatrixRec(row1, col1, A, row2, col2, B, C); 
        } 
   
        j = 0; 
        i++; 
        multiplyMatrixRec(row1, col1, A, row2, col2, B, C); 
    } 
   
    // Function to multiply two matrices A[][] and B[][] 
    static void multiplyMatrix(int row1, int col1, int A[][], 
                    int row2, int col2, int B[][]) 
    { 
        if (row2 != col1) 
        { 
            System.out.println("Not Possible\n"); 
            return; 
        } 
   
        int[][] C = new int[row1][col2]; 
        multiplyMatrixRec(row1, col1, A, row2, col2, B, C); 
   
        // Print the result 
        for (int i = 0; i < row1; i++) 
        { 
            for (int j = 0; j < col2; j++) 
                System.out.print(C[i][j]+" "); 
   
            System.out.println(); 
        } 
    } 
      
    // driver program 
    public static void main (String[] args)  
    { 
        int A[][] = { {3, 2}, 
                      {1, 2}}; 
   
        int B[][] = { {1, 2}, 
                      {4, 5}}; 
   
        multiplyMatrix(A.length, A[0].length, A, B.length, B[0].length, B); 
    } 
} 
  
// Contributed by Pramod Kumar 