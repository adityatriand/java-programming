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
public class DuaSwitchnoscan {
        public static void main(String[] args){
        //silahkan rubah karakter ukuran
        char ukuran='L';
        System.out.println("UKURAN BAJU");
        System.out.println("===========");
        System.out.println("Masukan Pilihan Ukuran Baju (S/M/L) = "+ukuran);
        switch(ukuran){
            case 'S':System.out.println("Ukuran kecil");break;
            case 'M':System.out.println("Ukuran sedang");break;
            case 'L':System.out.println("Ukuran besar");break;
            default :System.out.println("Maaf pilihan Anda salah.Ulangi!!!");break;
        }
    }
}
