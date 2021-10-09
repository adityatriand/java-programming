/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal10November2020binDanSelection;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class binSearch {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        int arr[]= new int [10];
        for(int i=0;i<arr.length;i++){
            arr[i]= ran.nextInt(30)+1;
        }
        System.out.println("Data Sebelum diurut");
        System.out.println("===================");
        desc(arr);
        
        //sorting process selection
        for(int i=0;i<arr.length-1;i++){
            int idx = i;
            for(int j=idx+1;j<arr.length;j++){
                if(arr[idx] < arr[j]){
                    idx = j;
                }
            }
            
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
        
        System.out.println("\nData Setelah diurut");
        System.out.println("===================");
        desc(arr);
        
        System.out.print("\nMasukkan angka yang ingin dicari = ");
        int find = input.nextInt();
        
        int mid =  -1;
        int top = arr.length - 1;
        int bottom = 0;
        boolean cek = false;
        
        while(!cek && top>=bottom){
            mid = (bottom+top)/2;
            if(arr[mid]== find){
                cek = true;
            }
            else{
                if(find > arr[mid]){
                    top = mid - 1;
                }
                else{
                    bottom = mid + 1;
                }
            }
        }
        
        if(cek){
            System.out.println("Ketemu di indeks "+mid);
        }
        else{
            System.out.println("Tidak Ketemu");
        }
        
        boolean cek2 = binSearch(arr,top,bottom,find);
        if(cek2){
            System.out.println("Oke");
        }
        else{
            System.out.println("Not Oke");
        }
        
    }
    
    static void desc(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
    
    static boolean binSearch(int [] arr, int top, int bottom, int find){
        int mid = (top+bottom)/2;
        if(find == arr[mid]){
            return true;
        }
        if(bottom > top){
            return false;
        }
        else{
            if(find > arr[mid]){
                return binSearch(arr,mid-1,bottom,find);
            }
            else{
                return binSearch(arr,top,mid+1,find);
            }
        }
    }
}
