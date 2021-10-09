/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal17November2020BubbleSort;

/**
 *
 * @author Adit
 */
public class bubbleSort {
    public static void main(String[] args) {
        int [] arr = new int [50];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("Before Sort");
        tampil(arr);
        System.out.println();
        
        int [] bubble = effectiveBS(arr);
        
        System.out.println();
        System.out.println("After Sort");
        tampil(bubble);
    }
    
    public static void tampil(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static int [] simpleBS(int a []){
        for(int i=0;i<a.length;i++){
            for(int j=a.length-1;j>i;j--){
                if(a[j]<a[j-1]){
                    int temp = a[j];
                    a[j]=a[j-1];
                    a[j-1]= temp;
                }
            }
            System.out.print("["+i+"] ");
            tampil(a);
        }
        return a;
    }
    
    
    public static int [] effectiveBS(int [] a){
        int temp, pass = 0;
        boolean isSwapped;
        do{
            isSwapped = false;
            for(int i=a.length-1;i>pass;i--){
                if(a[i]>a[i-1]){
                    temp = a[i];
                    a[i] = a[i-1];
                    a[i-1] = temp;
                    isSwapped = true;
                }
            }
            pass++;
        }while(isSwapped && pass<a.length-1);
        tampil(a);
        return a;
    }
}
