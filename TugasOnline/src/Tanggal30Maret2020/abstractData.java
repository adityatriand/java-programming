/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal30Maret2020;

/**
 *
 * @author Adit
 */
class Adit
{
    String NIM;
    String Nama;
    double harian;
    double uts;
    double uas;
};

public class abstractData 
{
    private static Adit [] inputData ( Adit a [])
    {
        a[0].NIM = "09021181924019";
        a[0].Nama = "Aditya Tri Ananda";
        a[0].harian = 100;
        a[0].uts = 100;
        a[0].uas = 100;
       
        a[1].NIM = "09021181920000";
        a[1].Nama = "Rahmat Budi Putra";
        a[1].harian = 80;
        a[1].uts = 80;
        a[1].uas = 90;
        
        a[2].NIM = "09021181920000";
        a[2].Nama = "Agung Ari Satria ";
        a[2].harian = 75;
        a[2].uts = 90;
        a[2].uas = 70;
        
        return a;
    }
    
    private static void tampil ( Adit b [])
    {
        System.out.println("PENDATAAN NILAI AKHIR MAHASISWA");
        System.out.println("==========================================================================================================");
        System.out.println("| Nomor |         NIM         |             Nama            | Harian |  UTS   |  UAS   |  Rata  | Indeks |");
        System.out.println("==========================================================================================================");
        String tabel = "|   %d   |   %15s   |      %s      | %2.1f  | %2.1f  | %2.1f  | %2.1f  |    %s   |%n";
        for(int i=0;i<b.length;i++)
        {
            double rata = (b[i].harian+b[i].uts+b[i].uas)/3;
            String indeks;
            if(rata>=86)
            {
                indeks = "A";
            }
            else if(rata>=71 && rata<86)
            {
                indeks ="B";
            }
            else if(rata>=56 && rata<71)
            {
                indeks ="C";
            }
            else if(rata>=31 && rata<56)
            {
                indeks ="D";
            }
            else
            {
                indeks ="E";
            }
            
            //untuk format penulisan ditabel bagi nilai yang kurang dari 100
             if(b[i].uts < 100 && b[i].uas < 100)
            {
                 tabel = "|   %d   |   %15s   |      %s      |  %2.1f  |  %2.1f  |  %2.1f  |  %2.1f  |    %s   |%n";
            }
            System.out.printf(tabel,(i+1),b[i].NIM,b[i].Nama,b[i].harian,b[i].uts,b[i].uas,rata,indeks);
        }
    }
    
    public static void main (String [] args)
    {
        Adit mahasiswa[] = new Adit [3];
        
        for(int i=0;i<mahasiswa.length;i++)
        {
            mahasiswa[i] = new Adit();
        }
        tampil(inputData(mahasiswa));
    }

}
