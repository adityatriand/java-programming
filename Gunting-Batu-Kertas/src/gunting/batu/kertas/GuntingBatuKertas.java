package gunting.batu.kertas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class GuntingBatuKertas {
    
    static Scanner input = new Scanner(System.in);
    static Random ran = new Random();

    public static void main(String[] args) {
        int a;
        System.out.print("Gunting(0)/Batu(1)/Kertas(2) = ");
        a = input.nextInt();
        if(a>2){
            System.out.println("Masukkan Anda Salah!!!");
        }
        else if(a<0)
        {
            System.out.println("Budayakan Membaca!!!");
        }
        else{
        Game(a);
        }
    }
    static void Game(int a){
        int comp = ran.nextInt(3);
        System.out.println("Komputer memilih = "+comp);
        if(a==comp){
            System.out.println("Hasilnya = Seri");
        }
        else if(a==0&&comp==1||a==1&&comp==2||a==2&&comp==0){
            System.out.println("Hasilnya = Komputer Menang");
        }
        else{
            System.out.println("Hasilnya = Anda Menang");
        }
       
    }
    
}
