/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabut;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class pertemuan7 {
    static int a = 10;
    
    public static void ucapSalam(){
        System.out.println("Hello");
    }
    
    public static void ucapSalamV2(String nama, int umur){
        System.out.println("Hello, "+nama);
        System.out.println("Umur saya "+umur);
    }
    
    public static int jumTitikSudutPersegi(){
        int a = 4;
        return a;
    }
    
    public static int luasPersegi(int sisi){
        int luas = sisi*sisi;
        return luas;
    }
    
    public static void testing(){
        int a = 8;
    }
    
    public static void main(String[] args) {
//        ucapSalam();
//        ucapSalamV2("adit",8);
//        int luas = luasPersegi(8);
//        System.out.println(luas);
//        int a = 8;
        System.out.println(a);
          
    }
    
}
