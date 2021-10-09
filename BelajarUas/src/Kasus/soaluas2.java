/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus;

/**
 *
 * @author Adit
 */
class Kompleks{
    int a;
    int b;
}

public class soaluas2 {
    static Kompleks k1,k2,k3,k4;
    static Kompleks makeKompleks(int myA, int myB)
    {
        Kompleks k = new Kompleks();
        k.a = myA;
        k.b = myB;
        return k;
    }
    
    static void TampilKompleks(Kompleks k)
    {
        System.out.println(k.a+"+"+k.b+"i");
        
    }
    
    static int GetReal(Kompleks k)
    {
        return k.a;
    }
    
    static int GetImajiner(Kompleks k)
    {
        return k.b;
    }
    
    static void kali (Kompleks k1, int a)
    {
      Kompleks temp = new Kompleks();
      temp.a = k1.a * a;
      temp.b = k1.b * a;
      TampilKompleks(temp);
              
    }
    
    static Kompleks tambah ( Kompleks k1, Kompleks k2)
    {
        Kompleks temp1 = new Kompleks();
        temp1.a = k1.a+k2.a;
        temp1.b = k1.b + k2.b;
        return temp1;
    }
    
     static Kompleks kurang ( Kompleks k1, Kompleks k2)
    {
        Kompleks temp2 = new Kompleks();
        temp2.a = k1.a-k2.a;
        temp2.b = k1.b - k2.b;
        return temp2;
    }
    
    public static void main(String[] args) {
        k1 = makeKompleks(10,8);
        k2 = makeKompleks(2,3);
        System.out.print("Bilangan Kompleks ");
        System.out.print("k1 = ");
        TampilKompleks(k1);
        System.out.print("; k2 = ");
        TampilKompleks(k2);
        Kompleks k3 = tambah(k1,k2);
        TampilKompleks(k3);
        Kompleks k4 = kurang(k1,k2);
        TampilKompleks(k4);
        kali(k4,2);
    }
}
