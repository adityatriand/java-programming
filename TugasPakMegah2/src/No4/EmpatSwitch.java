/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No4;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class EmpatSwitch {
    public static void main(String[] args){
        int gt,gp,ti,ta,anak, status;
        String nama;
        Scanner input = new Scanner(System.in);
        //
        System.out.println("Form Hitung Penghasilan Gaji Per Bulan");
        System.out.println("           Perusahaan XYZ             ");
        System.out.println("======================================");
        System.out.print("Masukan Nama Anda = ");
        nama=input.nextLine();
        System.out.print("Masukan Gaji Anda = ");
        gp=input.nextInt();
        System.out.print("Status Anda (lajang = 0 / kawin = 1) = ");
        status=input.nextInt();
        switch(status){
            case 0:System.out.println("Penghasilan Gaji Anda = Rp. "+gp);
            break;
            case 1:System.out.print("Jumlah Anak = ");
                         anak = input.nextInt();
                         if(anak>2){ta=200000;
                         }else{ta=anak*100000;}
                         ti=500000;
                         gt=gp+ti+ta;
                         System.out.println("Penghasilan Gaji Anda = Rp. "+gt);
            break;
            default:System.out.println("Maaf pilihan Anda salah. Ulangi Proses!");
                    break;
        }
    }
}
