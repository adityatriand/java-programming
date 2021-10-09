/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;
/**
 *
 * @author Adit
 */
public class DuaIfnoscan {
     public static void main(String[] args){
        //silahkan ganti karakter ukuran
         char ukuran = 'S';
        //
        System.out.println("UKURAN BAJU");
        System.out.println("===========");
        System.out.println("Masukan Pilihan Ukuran Baju (S/M/L) = "+ukuran);
        if(ukuran=='S'){System.out.println("Ukuran kecil");}
        else if(ukuran == 'M'){System.out.println("Ukuran sedang");}
        else if(ukuran=='L'){System.out.println("Ukuran besar");}
        else{System.out.println("Maaf pilihan Anda salah.Ulangi!!!");}
        }
}
