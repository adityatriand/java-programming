/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequential;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Adit
 */
public class CariNama {
    
    public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    void tambahNama() throws Exception
    {
        int banyak;
        System.out.print("Masukkan Banyak Data = ");
        banyak = Integer.parseInt(input.readLine());
        String [] nama = new String [banyak];
        for(int i=0;i<nama.length;i++)
        {
            System.out.print("Nama ke-"+(i+1)+" = ");
            nama[i]=input.readLine();
        }
    }
}
