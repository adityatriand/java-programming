/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedreader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Adit
 */
public class tulisFile {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        File myFile = new File("newFile.txt");
        FileOutputStream fout;
        try{
            fout = new FileOutputStream(myFile);
        }
        catch(FileNotFoundException e){
            System.out.println("File tidak ditemukan");
            return;
        }
        int i =0;
        try{
            do{
                fout.write(A[i]);
                i++;
            }while(i<A.length);
        }
        
        catch(IOException e){
            System.out.println("File Error");
        }
    }
}
