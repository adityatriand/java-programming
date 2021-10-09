/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ESoalKelima;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class Lima {
    public static void main(String[] args) {
        String nama, status;
        int gp, anak, ta, ti;
        double gt,pajak,tk;
        Scanner key = new Scanner(System.in);
        System.out.println("Form Hitung Penghasilan Gaji Per Bulan");
        System.out.println("           Perusahaan XYZ             ");
        System.out.println("======================================");
        System.out.print("Masukan Nama Anda = ");
        nama = key.nextLine();
        System.out.print("Masukan Gaji Anda = ");
        gp = key.nextInt();
        tk=gp*0.05;
        System.out.print("Status Anda (lajang/kawin) = ");
        status=key.next();
        switch (status){
            case "lajang":if(gp<=3000000){pajak=gp*0.05;}
                          else {pajak=gp*0.1;}
                          gt = gp+tk-pajak;
                          System.out.println("Penghasilan Gaji Anda = "+gt);
                          break;
            case "kawin":if(gp<=3000000){pajak=gp*0.05;}
                         else {pajak=gp*0.1;}
                         System.out.print("Jumlah Anak = ");
                         anak = key.nextInt();
                         if(anak>2){ta=200000;
                         }else{ta =anak*100000;}
                         ti = 500000;
                         gt = gp+ti+ta+tk-pajak;
                         System.out.println("Penghasilan Gaji Anda = "+gt);
                         break;
            default:System.out.println("Pilihan Anda Salah. Ulangi Proses!");
        }
    }
}
