
package Belajar1;
import java.util.Scanner;


class Record{
    String nama;
    int umur;
    boolean jk;
}

public class Fungsi_dan_Prosedur {
   static Scanner input = new Scanner(System.in);
   public static void main(String[]args){
       Rekaman();
       Rekaman1();
       System.out.print("Masukkan Banyak Nilai = ");
       int nilai = input.nextInt();
       float rata = RataArray(nilai);
       System.out.println("Rata-Rata = "+rata);
       Absen();
   }
   
   static void Rekaman(){
       Record rec = new Record();
       rec.nama="Irvan Jaya";
       rec.umur=10;
       rec.jk=true;
       System.out.println("Nama  = "+rec.nama);
       System.out.println("Umur  = "+rec.umur);
       if(rec.jk==true){System.out.println("Jenis =  Lanang");}
       else{System.out.println("Jenis = Betina");}
   }
   
   static void Rekaman1(){
       Record rek[]=new Record[3];
       for(int i = 0;i<rek.length;i++){
           rek[i]= new Record();
           System.out.print("\nMasukkan Nama Anda = ");
           rek[i].nama = input.next();
           System.out.print("Masukkan Umur Anda = ");
           rek[i].umur= input.nextInt();
           System.out.print("Masukka JK Anda = ");
           rek[i].jk = input.nextBoolean();
       }
       for(int i = 0;i<rek.length;i++){
            System.out.println("\nNama  = "+rek[i].nama);
            System.out.println("Umur  = "+rek[i].umur);
            if(rek[i].jk==true){System.out.println("Jenis = Lanang");}
            else{System.out.println("Jenis = Betina");}
       }
   }
   
   static float RataArray(int a){
       int nilai[]= new int [a],b=0;
       for(int i=0;i<nilai.length;i++){
           System.out.print("Nilai "+(i+1)+" = ");
           nilai[i]= input.nextInt();
           b+=nilai[i];
       }
       return (float)(b/a);
   }
   
   static void Absen(){
      double jam;
      int jum, a=0,b=0;
      boolean hadir;
      String Hari[]={"Senin","Selasa","Rabu","Kamis","Jum'at","Sabtu","Minggu"};
       System.out.println("ABSEN KANTOR");
       for(int i=1;i<=7;i++){
           System.out.println("Hari "+Hari[i-1]);
           System.out.print("Masukkan Jam Hadir Anda = ");
           jam = input.nextDouble();
           hadir = jam <= 08.00;
           if(hadir==true){a++;}
           else{b++;}
      }
       System.out.println("Jumlah Hadir Selama Seminggu = "+a);
   }
}
