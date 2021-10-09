package Tugas1;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Aditya Tri Ananda
 */
public class AdityaTriAnanda {
    public static void main(String [] args){
        String tabel = "|  %-6s   ||  %-3s||  %-3s|%n";
        String hari ="",tandaA, tandaB;
        double jamA=0,jamB=0;
        int gajiA,gajiB,banyakA1=0,banyakB1=0,banyak1,banyak2;
        Scanner input = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("              Absensi Perusahaan XYZ              ");
        System.out.println("==================================================");
        System.out.println("Perusahaan terdiri dari 2 Pekerja : A dan B");
        System.out.println("A bekerja shift pagi(07.00 - 12.00)");
        System.out.println("B bekerja shift siang(12.00 - 17.00)");
        System.out.println("Gaji Rp 30.000/hari");
        System.out.println("Jika pekerja terlambat, maka tidak di hitung masuk");
        System.out.println("==================================================");
        //Input Jam Masuk
        System.out.println("Contoh Inputnya/Pengetikannya : Senin = Jam 00.00 ");
        System.out.println("Absen A\n=======");
        System.out.print("Senin  = Jam ");
        double jamA1 = input.nextDouble();
        System.out.print("Selasa = Jam ");
        double jamA2 = input.nextDouble();
        System.out.print("Rabu   = Jam ");
        double jamA3 = input.nextDouble();
        System.out.print("Kamis  = Jam ");
        double jamA4 = input.nextDouble();
        System.out.print("Jum'at = Jam ");
        double jamA5 = input.nextDouble();
        System.out.print("Sabtu  = Jam ");
        double jamA6 = input.nextDouble();
        System.out.print("Minggu = Jam ");
        double jamA7 = input.nextDouble();
        System.out.println("==================");
        System.out.println("Absen B\n=======");
        System.out.print("Senin  = Jam ");
        double jamB1 = input.nextDouble();
        System.out.print("Selasa = Jam ");
        double jamB2 = input.nextDouble();
        System.out.print("Rabu   = Jam ");
        double jamB3 = input.nextDouble();
        System.out.print("Kamis  = Jam ");
        double jamB4 = input.nextDouble();
        System.out.print("Jum'at = Jam ");
        double jamB5 = input.nextDouble();
        System.out.print("Sabtu  = Jam ");
        double jamB6 = input.nextDouble();
        System.out.print("Minggu = Jam ");
        double jamB7 = input.nextDouble();
        //Tabel
        System.out.println("\n       TABEL ABSENSI      ");
        System.out.printf("|===========||=====||=====|%n");
        System.out.printf("|  Hari     ||  A  ||  B  |%n");
        for(int i=1;i<=7;i++){
            for(int j=i;j<=i;j++){
            System.out.printf("|===========||=====||=====|%n");
            }
            switch(i){
                case 1 :hari = "Senin";
                        jamA = jamA1;
                        jamB = jamB1;
                break;
                case 2 :hari = "Selasa";
                        jamA = jamA2;
                        jamB = jamB2;
                break;
                case 3 :hari = "Rabu";
                        jamA = jamA3;
                        jamB = jamB3;
                break;
                case 4 :hari = "Kamis";
                        jamA = jamA4;
                        jamB = jamB4;
                break;
                case 5 :hari = "Jum'at";
                        jamA = jamA5;
                        jamB = jamB5;
                break;
                case 6 :hari = "Sabtu";
                        jamA = jamA6;
                        jamB = jamB6;
                break;
                case 7 :hari = "Minggu";
                        jamA = jamA7;
                        jamB = jamB7;
                break;
            }
            if(jamA<=07.00){tandaA="V";
            }
            else{tandaA ="X";banyakA1++;
            }
            if(jamB<=12.00){tandaB="V";
            }
            else{tandaB = "X";banyakB1++;
            }
            System.out.printf(tabel,hari,tandaA,tandaB);
        }
        System.out.printf("|===========||=====||=====|%n");
        //Banyak Hadir
        banyak1=7-banyakA1;
        banyak2=7-banyakB1;
        System.out.println("\nJUMLAH KEHADIRAN");
        System.out.println("================");
        System.out.println("A = "+banyak1+" kali hadir dari 7 kali");
        System.out.println("B = "+banyak2+" kali hadir dari 7 kali");
        //Penghasilan
        gajiA = banyak1*30000;
        gajiB = banyak2*30000;
        System.out.println("\nGAJI");
        System.out.println("====");
        DecimalFormat angka = new DecimalFormat("###,###");
        System.out.println("Penghasilan Gaji A = Rp. "+angka.format(gajiA));
        System.out.println("Penghasilan Gaji B = Rp. "+angka.format(gajiB));
    }
}
