/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BelajarUas;

/**
 *
 * @author Adit
 */
public class SoalPakNoufalRekursif {
    public static void main(String[] args) {
//        System.out.println("Sebelum di reverse : "+ Arrays.toString(a));
//        long start = System.nanoTime();
//        for(int i=0;i<(a.length/2);i++){
//            char temp = a[i];
//            a[i]=a[a.length-1-i];
//            a[a.length-1-i]=temp;
//        }
//        long end = System.nanoTime();
//        System.out.println("Sesudah di reverse : "+Arrays.toString(a));
//        long time = end -start;
//        System.out.println("Waktu = "+time);
//        int arr[]={1,2,3,2,1};
//        System.out.println(cekPalindrome(arr,0,arr.length-1));
//        System.out.println(rekFib(7));
//        System.out.println(fibo(7));
        int b [][]={{3,2},{1,2}};
        int c [][]={{1,2},{4,5}};
        int d [][] = multiplyMatrix(b,c);
        for (int[] d1 : d) {
            for (int x = 0; x < d[0].length; x++) {
                System.out.print(d1[x] + " ");
            } 
            System.out.println();
        }
        
    }
    
    static boolean cekPalindrome(int arr[],int i,int j){
        int k = j/2;
        if(j==k){
            return true;
        }
        else if(arr[i]!=arr[j]){
            return false;
        }
        else{
            return cekPalindrome(arr,i+1,j-1);
        }
        
    }
    
    static int rekFib(int a){
        if(a==0||a==1)return a;
        else{
            return rekFib(a-1)+rekFib(a-2);
        }
    }
    
    static int fibo(int a){
        int b=0;
        int c=1;
        for(int i=1;i<=a;i++){
             b=b+c;
             c=b-c;
        }
        return b;
    }
    
    static void fun(int n){
        if(n>0){
            String end=" ";
            fun(n-1);
            System.out.println(n+end);
            fun(n-1);
        }
    }
    
    static void fun1(int n)
    {
        int i;
        if (n > 1)
            fun1(n - 1);
        for (i = 0; i < n; i++)
            System.out.print(" * ");
    }
    
    private static int i=0,j=0,k=0;
    static void multiplyMatrixRec(int A[][],int B[][],int C[][]) 
    { 
        if (i >= A.length){ 
            return; 
        }
    
        if (j < B[0].length) 
        { 
            if (k < A[0].length) 
            { 
                C[i][j] += A[i][k] * B[k][j];
                k++; 
   
                multiplyMatrixRec(A, B, C); 
            } 
   
            k = 0; 
            j++; 
            multiplyMatrixRec(A, B, C); 
        } 
   
        j = 0; 
        i++; 
        multiplyMatrixRec(A, B, C); 
    } 
   
    static int [][] multiplyMatrix(int A[][],int B[][]) 
    { 
        int[][] C = new int[A.length][B[0].length]; 
        if (B.length != A[0].length) 
        { 
            System.out.println("Kedua Matriks Tidak Dapat dilakukan Perkalian"); 
            return C; 
        }
        
        else{
            multiplyMatrixRec(A,B,C); 
            return C;
        }
    } 
}
