/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal3November2020Rekursif;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Masukkan Bilangan = ");
        a = input.nextInt();
        System.out.print("Masukkan Bilangan = ");
        b = input.nextInt();
        System.out.println("Kali Rekursif = "+kali(a,b));
    }
    
    public static int faktor(int a){
        if(a < 0){
            return -1;
        }
        else{
            int res = 1;
            long start = System.nanoTime();
            for (int i=a; i>0; i--){
                res *=i;
            }
            long end = System.nanoTime();
            long time = end - start;
            System.out.println("Waktu Looping = "+time);
            return res;
        }
    }
    
    public static void count(int index){
        System.out.print(index);
        if(index<2){
            count(index+1);
        }
    }
    
    public static int rekursifFaktor(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else if(n<0){
            return -1;
        }
        else{
            return n * rekursifFaktor(n-1);  
        }
    }
    
    public static int tambah(int a, int b){
        if(b==0){
            return a;
        }
        else if(b<0){
            return tambah(b,a);
        }
        else{
            return 1+tambah(a,b-1);
        }
    }
    
    public static int kurang(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return -1+kurang(a,b-1);
        }
    }
    
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    
    public static int pangkat(int a,int b){
        if(b==0){
            return 1;
        }
        else if(b<0){
            return 0;
        }
        else{
            return a*pangkat(a,b-1);
        }
    }
    
    public static void convertBin(int n){
        if(n > 1){
            convertBin(n / 2);
        }
        System.out.print(n % 2);
    }
    
    public static int kali(int a, int b){
        if(b==0){
            return 0;
        }
        
        if(b<0){
            if(a<0){
                a= -a;
                b= -b;
            }
            return kali(b,a);
        }
        
        else{ 
            return a+(kali(a,b-1));
        }
    }
}
