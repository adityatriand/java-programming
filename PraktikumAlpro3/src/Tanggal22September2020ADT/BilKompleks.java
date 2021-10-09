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
public class BilKompleks {
    
    //atribut
    private int a;
    private int b;
    
    //kontruktor
    public BilKompleks(){
        this.a = 0;
        this.b = 0;
    }
    
    public BilKompleks(int bilA, int bilB){
        this.a = bilA;
        this.b = bilB;
    }
    
    //Getter
    public int getA(){
        return this.a;
    }
    
    public int getB(){
        return this.b;
    }
    
    //Setter
    public void setA(int bilA){
        this.a = bilA;
    }
    
    public void setB(int bilB){
        this.b = bilB;
    }
    
    //Operasi
     public BilKompleks Tambah(BilKompleks A, BilKompleks B){
        BilKompleks temp = new BilKompleks();
        temp.a = A.a + B.a;
        temp.b = A.b + B.b;
        return temp;
    }
    
     public BilKompleks Kurang(BilKompleks A, BilKompleks B){
        BilKompleks temp = new BilKompleks();
        temp.a = A.a - B.a;
        temp.b = A.b - B.b;
        return temp;
    }
    
    //Cetak
    @Override
    public String toString(){
        return (this.a+" + "+this.b+"i --> "+this.a+" = Bil riil || "+this.b+" = Bil Imajiner");
    }
}
