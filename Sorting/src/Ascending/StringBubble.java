package Ascending;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author Adit
 */
public class StringBubble {
    
    public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) 
    {
        String [] nama = Input();
        Sort(Index(Pecah(nama)),nama);
    }
    
    public static void Tampil(String [] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println((i+1)+". "+a[i]);
        }
    } 
    
    public static String [] Input()
    {
        int banyak = 0;
        System.out.print("Masukkan banyak data = ");
        try
        {
            banyak = Integer.parseInt(input.readLine());
        } catch (IOException e){
            System.out.println("Error!");
        }
        String [] daftar = new String [banyak];
        for(int i =0;i<daftar.length;i++)
        {
            System.out.println("\nData ke-"+(i+1));
            System.out.print("Nama Mahasiswa = ");
            try
            {
                daftar[i]=input.readLine();
            } catch(IOException e){
                System.out.println("Error!");
            }
        }
        System.out.println("\nData Sebelum di Sorting");
        System.out.println("=======================");
        Tampil(daftar);
        return daftar;
    }
    
    public static String [] Pecah(String [] b)
    {
        String pecah [] = new String [b.length];
        for(int i=0;i<pecah.length;i++)
        {
            pecah [i]= (b[i].toLowerCase()).substring(0,1);
        }
        return pecah;
    }
    
    public static int [] Index (String[]c)
    {
        String [] a = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int [] index = new int [c.length];
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(c[i].equals(a[j]))
                {
                    index [i] = j;
                }
            }
        }
        
        return index;
    }
    
    public static void Sort(int [] b, String []d)
    {
        for(int i=0;i<b.length;i++)
        {
            for(int j=(i+1);j<b.length;j++)
            {
                if(b[i]>b[j])
                {
                    int temp = b[i];
                    b[i]=b[j];
                    b[j]=temp;
                    
                    String te = d[i];
                    d[i]=d[j];
                    d[j]=te;
                }
            }
        }
        System.out.println("\nData Setelah di Sorting");
        System.out.println("========================");
        Tampil(d);
    }
}
