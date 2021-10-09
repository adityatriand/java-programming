/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal10November2020binDanSelection;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int arr[] = new int [10];
//        for(int i=0;i<arr.length;i++){
//            arr[i]= (int)((Math.random()*100)+1);
//        }
//        
//        System.out.print("Data Sebelum di Urut = ");
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        
//        for(int h=0;h<arr.length;h++){
//            int indeks = h;
//            for (int i=h+1;i<arr.length;i++){
//                if(arr[i]<arr[indeks]){
//                    indeks = i;
//                }
//            }
//            int temp = arr[h];
//            arr[h]=arr[indeks];
//            arr[indeks]= temp;
//        }
//        
//        System.out.print("\nData Setelah di Urut = ");
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println("");
        
//        System.out.println("\nNilai Minimum "+arr[indeks]+" berada di index = "+indeks);
        
//        int a = 10;
//        int b = 20;
//        System.out.println(a);
//        System.out.println(b);
//        
//        int temp  = a;
//        a = b;
//        b = temp;
//        System.out.println(a);
//        System.out.println(b);
//        
//        int arr[] = {1,2,3,4,5};
//        System.out.println("");
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        
//        int temp2 = arr[2];
//        arr[2]= arr[4];
//        arr[4]=temp2;
//        
//        System.out.println("");
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println("");
        
        
        
        int arr[] = {0,1,2,3,4,5,6};
        int top = arr.length-1;
        int bottom = 0;
        int mid = -1;
        boolean ketemu = false;
        
        System.out.print("Data angka = ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.print("\nMasukkan angka yang ingin dicari = ");
        int cari = input.nextInt();
        
//        boolean temu = BinarySearch(arr,bottom,top,cari);
//        if(temu){
//            System.out.println("Angka Ketemu");
//        }
//        else{
//            System.out.println("Tidak Ketemu");
//        }
//        
        while(!ketemu && top>=bottom){
            mid = (top+bottom)/2;
            if(arr[mid]== cari){
                ketemu = true;
            }
            else{
                if(cari>arr[mid]){
                    bottom = mid+1;
                }
                else{
                    top = mid-1;
                }
            }
        }
        
        if(ketemu){
            System.out.println("Angka Ketemu. Berada di index "+mid);
        }
        else{
            System.out.println("Tidak Ketemu");
        }
   }
    
    public static boolean BinarySearch(int a[],int bottom, int top, int cari){
        int mid = (top+bottom)/2;
        if(a[mid]== cari){
            return true;
        }
        if(bottom>top){
            return false;
        }
        else{
            if(cari>a[mid]){
                return BinarySearch(a,mid+1,top,cari);
            }
            else{
                return BinarySearch(a,bottom,mid-1,cari);
            }
        }
    }
}
