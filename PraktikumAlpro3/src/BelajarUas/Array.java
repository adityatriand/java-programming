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
    static Scanner input = new Scanner(System.in);
    static void latihan1(){
        char [] arr = new char [10];
        int jumA = 0;
        for(int i=0;i<arr.length;i++){
            System.out.print("Karakter "+(i+1)+" : ");
            arr[i]=input.next().charAt(0);
            if(arr[i]=='A')jumA++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nJumlah karakter A = "+jumA);
        
    }
    
    static void latihan2(int length){
        int [] arr = new int [length];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100)+1;
        }
        int max = arr[0];
        int min = arr[0];
        System.out.print(arr[0]+" ");
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)max = arr[i];
            if(arr[i]<min)min = arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nNilai Terbesar = "+max);
        System.out.println("Nilai Terkecil = "+min);
    }
    
    static void latihan2_1(int length){
        int [] arr = new int [length];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100)+1;
        }
        int idmax = 0;
        int idmin = 0;
        System.out.print(arr[0]+" ");
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[idmax])idmax = i;
            if(arr[i]<arr[idmin])idmin = i;
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nNilai Terbesar berada di index = "+idmax);
        System.out.println("Nilai Terkecil berada di index = "+idmin);
    }
    
    static void latihan3(int length){
        int [] arr = new int [length];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*10)+1;
        }
        System.out.print("Nilai yang ingin diketahui : ");
        int X = input.nextInt();
        int count = 0;
        int end = -1;
        String data = "";
        for(int i=0;i<arr.length;i++){
            if(X == arr[i]){
                end = i;
                count++;
                data = data+i+" ";
            }
        }
        
        if(count>0){
            System.out.println("Nilai "+X+" muncul sebanyak "+count+" kali");
            System.out.println("Berada di index = "+data);
            System.out.println("Terakhir muncul di index = "+end);
        }
        else{
            System.out.println("Nilai "+X+" tidak ada");
            System.out.println("Terakhir munculnya = "+end);
        }
        
        System.out.print("Data : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
    static void latihan4(){
        int [] arr = new int [100];
        int i=0, sum=0;
        System.out.print("Masukkan nilai ke"+(i+1)+" = ");
        arr[i]= input.nextInt();
        while(arr[i]!= -999 && i<100){
            sum+=arr[i];
            i++;
            System.out.print("Masukkan nilai ke"+(i+1)+" = ");
            arr[i]= input.nextInt();
        }
        System.out.println("Banyak Elemen Array = "+i);
        System.out.println("Jumlah total seluruh elemen = "+sum);
    }
    
    static void modus(){
        int arr[]= new int [100];
        int countNumber = 0,count=0,countSum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*10)+1;
        }
        
        for(int i=count;i<arr.length;i++){
            if(arr[count]==arr[i]){
                countSum++;
            }
        }
    }
    
    public static void main(String[] args) {
        latihan4();
        
    }
}
