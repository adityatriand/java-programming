/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author Adit
 */
public class Juni18_2020 
{
    public static int InputOutput()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Program penjumlahan sangat sederhana");
        System.out.print("Masukkan angka pertama : ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int b = input.nextInt();
        int hasil = a + b;
        System.out.println("Hasilnya adalah : " + hasil);
        
        return hasil;
    }
    
    public static int BufferReader()
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(isr);
        System.out.println("Program penjumlahan sangat sederhana");
        int a = 0,b = 0;
        try
        {
            System.out.print("Masukkan angka pertama : ");
            a = Integer.parseInt(read.readLine());
            System.out.print("Masukkan angka kedua : ");
            b = Integer.parseInt(read.readLine());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
        int hasil = a + b;
        System.out.println("Hasilnya adalah : " + hasil);
        
        return hasil;
    }
    
    public static void chartoString()
    {
        char aditChar [] = {'a','d','i','t'};
        String aditString = new String(aditChar);
        System.out.println(aditString);
    }
    
    public static void getChar()
    {
        String a = "aditya";
        char get = a.charAt(4);
        System.out.println(get);
        /*
        1
        length()
        Digunakan untuk mengetahui panjang atau jumlah karakter dalam string.
        2
        charAt(int index)
        Digunakan untuk mengambil sebuah karakter berdasarkan indeks tertentu.
        3
        format(String format, Object… args)
        Digunakan untuk memformat sebuah string.
        4
        substring(int beginIndex)
        Mengembalikan substring berdasarkan indeks yang diberikan.
        5
        contains(CharSequence s)
        Mengembalikan true atau false setelah mencocokkan karakter.
        6
        equals(Object object)
        Memeriksa apakah nilai objek sama dengan nilai string.
        7
        isEmpty()
        Memeriksa apakah sebuah string itu kosong atau tidak.
        8
        concat(String s)
        Mengkonsolidasikan sebuah string.
        9
        replace(char a, char b)
        Mengganti suatu karakter di dalam string.
        10
        indexOf(String a)
        Mengetahui indeks dari sebuah substring.
        11
        toLowerCase()
        Mengubah format string menjadi huruf kecil semua.
        12
        toUpperCase()
        Mengubah format string menjadi huruf kapital semua.
        13
        trim()
        Menghapus spasi awal dan akhir dari string.
        14
        valueOf(int value)
        Mengkonversi tipe yang diberikan menjadi sebuah string.
        15	
        compareTo()	
        Membandingkan dua nilai
        */
    }
    
    
}
