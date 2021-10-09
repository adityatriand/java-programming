 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author Adit
 */
public class Main {
    public static void main(String[] args) {
        Rudal rudal = new Rudal();
        rudal.Informasi();
        rudal.luasPermukaan();
        
        System.out.println();
        Tabung tabung = new Tabung(3,10);
        tabung.Informasi();
        System.out.println();
        Kerucut kerucut = new Kerucut(3,4);
        kerucut.Informasi();
        
        System.out.println();
        rudal.setLuasPermukaanKerucut(kerucut.luasPermukaan());
        rudal.setLuasPermukaanTabung(tabung.luasPermukaan());
        rudal.Informasi();
    }
}
