/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSoalSepuluh;
import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Sepuluh {
    public static void main(String[] args){
        float a,b,c,d;
        Scanner input = new Scanner(System.in);
        do{
        System.out.println("\nMENGHITUNG NILAI RATA RATA");
        System.out.println("==========================");
        System.out.print("Masukan nilai Alpro      = ");
        a=input.nextFloat();
        System.out.print("Masukan nilai Matematika = ");
        b=input.nextFloat();
        System.out.print("Masukan nilai Logika     = ");
        c=input.nextFloat();
        }while(a==0||b==0||c==0);
        d=(float)(a+b+c)/3;
        System.out.println("Nilai Rata Rata = "+d);
    }
}
