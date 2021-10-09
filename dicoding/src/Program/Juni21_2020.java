/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

/**
 *
 * @author Adit
 */
public class Juni21_2020 
{
    String nama;
    int berat;
    int jumlahKaki;
    
    public Juni21_2020(String namaHewan)
    {
        nama = namaHewan;
    }
    
    public void beratHewan(int beratHewan)
    {
        berat = beratHewan;
    }
    
    public void jumlahKakiHewan(int jumlahKakiHewan)
    {
        jumlahKaki = jumlahKakiHewan;
    }
    
    public void cetakHewan()
    {
        System.out.println("Nama hewan : "+ nama);
        System.out.println("Berat hewan : "+ berat +" kg");
        System.out.println("Jumlah kaki : "+ jumlahKaki);
    }
    
    public static int methodOverload(int a, int b)
    {
        int c = a * b;
        return c;
    }
    
    public static double methodOverload(double a, double b)
    {
        double c = a * b;
        return c;
    }
    
}
