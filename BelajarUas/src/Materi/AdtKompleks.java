/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materi;

/**
 *
 * @author Adit
 */
class Luas
{
    int panjang;
    int lebar;
    int totalLuas;
};
public class AdtKompleks {
  static Luas luas1,luas2;
  static Luas nilai(int A,int B)
  {
      Luas k = new Luas();
      k.panjang = A;
      k.lebar = B;
      return k;
  }
  
  static void tampil(Luas k)
  {
      System.out.println("Panjang : "+k.panjang+"\nLebar : "+k.lebar);
  }
  
  static void tampiltotal(Luas k)
  {
      System.out.println("Total Panjang : "+k.panjang+"\nTotal Lebar : "+k.lebar);
  }
  
  static int getReal(Luas k)
  {
      return k.panjang;
  }
  
  static int getImajiner(Luas k)
  {
      return k.lebar;
  }
  
  static Luas tambah(Luas k1, Luas k2)
  {
      Luas temp = new Luas();
      temp.panjang = k1.panjang + k2.panjang;
      temp.lebar = k1.lebar+k2.lebar;
      return temp;
  }
  
  static Luas kurang(Luas k1, Luas k2)
  {
      Luas temp1 = new Luas();
      temp1.panjang = k1.panjang - k2.panjang;
      temp1.lebar = k1.lebar - k2.lebar;
      return temp1;
  }
  
    public static void main(String[] args) {
        luas1 = nilai(2,3);
        luas2 = nilai(4,5);
        tampil(luas1);
        tampil(luas2);
        System.out.println("Panjang 1 : "+getReal(luas1)+" Lebar 1 : "+getImajiner(luas1));
        System.out.println("Panjang 2 : "+getReal(luas2)+" Lebar 2 : "+getImajiner(luas2));
        Luas luas3 = tambah(luas1,luas2);
        tampiltotal(luas3);
    }
}
