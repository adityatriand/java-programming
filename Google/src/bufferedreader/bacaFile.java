/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Adit
 */
public class bacaFile {
    public static void main(String[] args) {
        File myFile = new File("newFile.txt");
        FileInputStream fin;
        try{
            fin = new FileInputStream(myFile);
        }catch(FileNotFoundException e){
            System.out.println("File Tidak Ditemukan");
            return;
        }
        
        try{
            int x = fin.read();
            while(x!=-1){
                System.out.println(x);
                x = fin.read();
            }
        }catch(IOException e){
            System.out.println("Masukkan Error");
        }
    }
}
