/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal22September2020ADT;

/**
 *
 * @author Adit
 */
public class DriverBilKompleks {
    public static void main(String[] args) {
        BilKompleks A = new BilKompleks(2,4);
        System.out.println(A);
        
        BilKompleks B = new BilKompleks(3,4);
        System.out.println(B);
        B.setA(5);
        System.out.println(B);
        
        BilKompleks C = new BilKompleks();
        C = C.Tambah(A, B);
        System.out.println(C);
    }
}
