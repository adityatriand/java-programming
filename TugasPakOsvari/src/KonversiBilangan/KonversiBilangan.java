package KonversiBilangan;
import java.util.Scanner;
/**
 *
 * @author Adit
 */
public class KonversiBilangan {
     public static void main(String[] args) {
     int a,nilai,desimal,biner,array[],d,i,jum,jum1=0;
     String angka = "",nilbin = "";
     Scanner input = new Scanner(System.in);
        System.out.println("                 SELAMAT DATANG                  ");
        System.out.println("=================================================");
        System.out.println("Pilih 1 jika ingin konversi dari Desimal ke Biner");
        System.out.println("Pilih 2 jika ingin konversi dari Biner ke Desimal");
        System.out.print("Masukkan Pilihan Anda = ");
        nilai = input.nextInt();
        switch(nilai){
         case 1:System.out.println("======================================");
                System.out.println("      KONVERSI DESIMAL KE BINER       ");
                System.out.println("======================================");
                System.out.print("Masukkan Nilai Desimal = ");
                desimal = input.nextInt();
             do{a = desimal%2;
                desimal = desimal/2;
                angka = a+angka;
               }while(desimal > 0);
             while(angka.length()<8){angka = 0 + angka;}
             System.out.println("Nilai Biner = "+angka);break;
         case 2:System.out.println("======================================");
                System.out.println("      KONVERSI BINER KE DESIMAL       ");
                System.out.println("======================================");
                System.out.print("Masukan Banyak Digit yang Ingin di Konversi = ");
                int b = input.nextInt();
                array = new int [b];
                System.out.println("Masukkan Nilai Biner = ");
                for(d=0;d<array.length;d++){
                System.out.print("Angka ke-"+(d+1)+" = " );
                array[d]=input.nextInt();}
                for(i=0;i<d;i++){
                jum = (int)(array[i]*Math.pow(2,b-(i+1)));
                jum1 += jum;
                nilbin = nilbin + array[i];
                }System.out.println("Nilai Biner = "+nilbin);
                System.out.println("Nilai Desimal = "+jum1);break;
         default : System.out.println("Maaf Pilihan Anda Salah! Ulangi/Tutup");
            }
        }
}
