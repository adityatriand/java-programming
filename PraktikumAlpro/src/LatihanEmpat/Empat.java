/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanEmpat;
import java.util.Scanner;

public class Empat {
public static void main (String [] args){
    long gt,gp;
    String nama ;
    int ta,ti,ja,ji,sk,tia;
    
    Scanner uni = new Scanner (System.in);
    System.out.print("Masukkan nama anda = ");
    nama = uni.nextLine();
    System.out.print("Masukkan gaji anda = ");
    gp = uni.nextLong();
    System.out.print("Masukkan status kawin (kawin = 1, lajang = 0) = ");
    sk =  uni.nextInt();
    if (sk==0){tia =0;
    }else {System.out.print("Masukkan jumlah anak = ");
    ja = uni.nextInt();
    if (ja>2){ta = 2*100000;    
    }else {ta = ja*100000;
    }tia = ta+500000;
    }
    gt = gp+tia;
    System.out.println("Jumlah uang anda = "+gt);
    
    
}    
}
