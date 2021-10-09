/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanLima;
import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Lima {
        public static void main(String[] args){
        int gt,gp,ti,ta,anak;
        String nama,status;
        Scanner input = new Scanner(System.in);
        System.out.println("Form Hitung Penghasilan Gaji Per Bulan");
        System.out.println("           Perusahaan XYZ             ");
        System.out.println("======================================");
        System.out.print("Masukan Nama Anda = ");
        nama=input.nextLine();
        System.out.print("Masukan Gaji Anda = ");
        gp=input.nextInt();
        System.out.print("Status Anda (lajang/kawin) = ");
        status=input.next();
        switch(status){
            case "lajang":System.out.println("Penghasilan Gaji Anda = "+gp);
            break;
            case "kawin":System.out.print("Jumlah Anak = ");
                         anak = input.nextInt();
                         if(anak==1){ta=100000;
                         }else{ta=anak*100000;}
                         ti=500000;
                         gt=gp+ti+ta;
                         System.out.println("Penghasilan Gaji Anda = "+gt);
            break;
            default:System.out.println("Pilihan Anda Salah. Ulangi Proses!");
        }
    }  
}
