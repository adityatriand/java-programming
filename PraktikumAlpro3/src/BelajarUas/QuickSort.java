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
public class QuickSort {
    
    public static int partition(int arr[],int low,int high){
        int pivot = arr[high];
        int i = low -1;
        int j ,temp;
        for(j=low;j<high;j++){
            if(arr[j]<= pivot){
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i+1];
        arr[i+1]=arr[high];
        arr[high] = temp;
        return i+1;
    }
    
    public static void sort(int arr[],int low,int high){
        if(low<high){
            int pivotIndex = partition(arr,low,high);
            sort(arr,low,pivotIndex-1);
            sort(arr,pivotIndex+1,high);
        }
    }
    
    public static void tampil(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr [] = new int [10000];
        int arr1 [] = new int [10000];
        for(int i=0;i<arr.length;i++){
            arr[i]= (int)(Math.random()*100)+1;
            arr1[i] = arr[i];
        }
        
        tampil(arr);
        long start = System.nanoTime();
        sort(arr,0,arr.length-1);
        long end = System.nanoTime();
        long time = end - start;
        System.out.println("Waktu = "+time);
        tampil(arr);
        System.out.println();
        tampil(arr1);
        
        long start1 = System.nanoTime();
        for(int i=0;i<arr1.length-1;i++){
            int idx = i;
            for(int j=idx+1;j<arr1.length;j++){
                if(arr1[idx] > arr1[j]){
                    idx = j;
                }
            }
            
            int temp = arr1[idx];
            arr1[idx] = arr1[i];
            arr1[i] = temp;
        }
        long end1 = System.nanoTime();
        long time1 = end1 - start1;
        System.out.println("Waktu = "+time1);
        
        tampil(arr1);
    }
}
