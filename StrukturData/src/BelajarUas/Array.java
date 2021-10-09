/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BelajarUas;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Array {
    
    static void inputData(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]= (int)(Math.random()*100)+1;
        }
    }
    
    static int maxValue(int arr[]){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)max=arr[i];
        }
        return max;
    }
    
    static int minValue(int arr[]){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)min = arr[i];
        }
        return min;
    }
    
    static void viewData(int arr[]){
        System.out.print("Data : ");
        for(int i=0;i<arr.length;i++){
            System.out.print("["+arr[i]+"] ");
        }
        System.out.println("");
    }
    
    static int amountValue(int arr[]){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            temp += arr[i];
        }
        return temp;
    }
    
    static float meanData(int amount, int arrLength){
        return amount/arrLength;
    }
    
    static void sortData(int arr[]){
        try{
            boolean check;
            int i=0;
            long start = System.nanoTime();
            do{
                check = false;
                for(int j=0;j<arr.length-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        check = true;
                    }
                }
                if(check){
                    System.out.print("["+i+"] ");
                    viewData(arr);
                }
                i++;
            }while(check && i<arr.length);
            long end = System.nanoTime();
            long time = end - start;
            System.out.println("Waktu Sorting = "+time);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    static void sortData2(int arr[]){
        try{
            long start = System.nanoTime();
            for(int i=0;i<arr.length-1;i++){
                int idx = i;
                for(int j=idx+1;j<arr.length;j++){
                    if(arr[idx]>arr[j]){
                        idx = j;
                    }
                }
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i]= temp;
                System.out.print("["+i+"] ");
                viewData(arr);
                
            }
            long end = System.nanoTime();
            long time = end - start;
            System.out.println("Waktu Sorting = "+time);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    static float medianData(int arr[]){
        if(arr.length%2==1){
            return arr[(arr.length/2)];
        }
        else{
            return (float)(arr[arr.length/2]+arr[(arr.length/2)-1])/2;
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lengthArr;
        System.out.print("Your's array length = ");
        lengthArr = input.nextInt();
        int [] arr = new int[lengthArr];
        inputData(arr);
        viewData(arr);
        System.out.println("Max value in array = "+maxValue(arr));
        System.out.println("Min value in array = "+minValue(arr));
        System.out.println("Amount of data = "+amountValue(arr));
        System.out.println("Mean value of the data = "+meanData(amountValue(arr),arr.length));
        System.out.println("Sort's Data Process");
        sortData(arr);
        viewData(arr);
        System.out.println("Median of the data = "+medianData(arr));
    }
}
