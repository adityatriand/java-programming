/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashset;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class tes4 {
    static Scanner input = new Scanner(System.in);
public static void main(String[] args)
{
DiamondAngka();
HashSet a = DistinctPakaiLibrary();
System.out.println("\nDistinct nya adalah = "+a);
Distinct();
}
static void DiamondAngka()
{
System.out.println("==PROGRAM MEMBUAT POLA ANGKA==");
int banyak;
System.out.print("Masukkan banyak angka = ");
banyak = input.nextInt();
for(int i=1;i<=banyak;i++)
{
for(int j=banyak-i;j>0;j--)
{
System.out.print(" ");
}
for(int k=i;k>=1;k--)
{
System.out.print(k);
}
for(int l=1;l<=i;l++)
{
System.out.print(l);
}
System.out.println("");
}
for(int i=1;i<=banyak-1;i++)
{
for(int j=i;j>=1;j--)
{
System.out.print(" ");
}
for(int k=banyak-i;k>=1;k--)
{
System.out.print(k);
}
for(int l=1;l<=banyak-i;l++)
{
System.out.print(l);
}
System.out.println("");
}
}
static HashSet DistinctPakaiLibrary()
{
int banyak;
System.out.println("\n===Program Distinct pakai Library===");
System.out.print("Masukkan banyak data = ");
banyak = input.nextInt();
HashSet cek = new HashSet(banyak);
int data1[]= new int [banyak];
for(int i=0;i<data1.length;i++)
{
System.out.print("Data ke-"+(i+1)+" = ");
data1[i]=input.nextInt();
cek.add(data1[i]);
}
System.out.print("Datanya = ");
for(int j=0;j<data1.length;j++)
{
System.out.print(data1[j]+" ");
}
return cek;
}
static void Distinct()
{
int banyak;
System.out.println("\n===Program Distinct tanpa Library===");
System.out.print("Masukkan banyak data = ");
banyak = input.nextInt();
int data1[]= new int [banyak];
for(int i=0;i<data1.length;i++)//Bagian input data
{
System.out.print("Data ke-"+(i+1)+" = ");
data1[i]= input.nextInt();
}
System.out.print("Datanya = ");
for(int j=0;j<data1.length;j++)
{
System.out.print(data1[j]+" ");
}
System.out.print("\nDistinct nya adalah = [ ");
for(int i=0;i<data1.length;i++)//Bagian cek data yang sama
{
boolean cek = false;
for(int j=0;j<i;j++)
{
if(data1[i]== data1[j])
{
cek = true;
break;
}
}
if(cek==false)
{
System.out.print(data1[i]+" ");
}
}
System.out.print("]");
}
}
