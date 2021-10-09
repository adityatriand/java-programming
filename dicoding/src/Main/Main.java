/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Program.*;

/**
 *
 * @author Adit
 */
public class Main {
    public static void main(String [] args)
    {
        Program.Juni17_2020.Hello();
        Program.Juni17_2020.waktu();
        Program.Juni18_2020.InputOutput();
        Program.Juni18_2020.BufferReader();
        Program.Juni18_2020.chartoString();
        Program.Juni18_2020.getChar();
        Program.Juni19_2020.array2D();
        System.out.println(Program.Juni21_2020.methodOverload(8.5, 4));
        System.out.println(Program.Juni21_2020.methodOverload(8,4));
        
        Program.Juni21_2020 Elang = new Program.Juni21_2020("Elang");
        Elang.beratHewan(5);
        Elang.jumlahKakiHewan(2);
        Elang.cetakHewan();
        
        Program.Juni21_2020 Kucing = new Program.Juni21_2020("Kucing");
        Kucing.beratHewan(3);
        Kucing.jumlahKakiHewan(4);
        Kucing.cetakHewan();
    }
}
