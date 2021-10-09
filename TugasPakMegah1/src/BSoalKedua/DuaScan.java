/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BSoalKedua;
import java.util.Scanner;
/**
 *
 * @author Adit
 */
public class DuaScan {
    public static void main(String[] args){
        float a,b,c,d;
        Scanner key=new Scanner(System.in);
        System.out.print("A = ");
        a=key.nextInt();
        System.out.print("B = ");
        b=key.nextInt();
        System.out.print("C = ");
        c=key.nextInt();
        System.out.println("MENCARI NILAI RATA RATA DARI 3 BUAH VARIABEL");
        System.out.println("============================================");
        System.out.println("Nilai A = "+a);
        System.out.println("Nilai B = "+b);
        System.out.println("Nilai C = "+c);
        d=(a+b+c)/3;
        System.out.println("Nilai Rata Rata = "+d);
    }
    
}
