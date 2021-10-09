/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materi;

/**
 *
 * @author Adit
 */
class segi_4
{
    double panjang;
    double lebar;
}
public class AdtPoint {
    public static void main(String [] args)
    {
        segi_4 panggil = new segi_4();
        panggil.panjang = 5;
        panggil.lebar = 4;
        double luas = panggil.panjang * panggil.lebar;
        System.out.println("Panjang = "+panggil.panjang);
        System.out.println("Lebar = "+panggil.lebar);
        System.out.println("Luas = "+luas);
    }
}
