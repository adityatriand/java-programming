/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author Adit
 */
public class contoh {
    public static void main(String[]args)
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String nama;
        System.out.print("Masukkan nama Anda = ");
        try
        {
            nama = input.readLine();
        }
        catch(IOException e)
        {
            System.out.println("Error!");
        }
    }
}
