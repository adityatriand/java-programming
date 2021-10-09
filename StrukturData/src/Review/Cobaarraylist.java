/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adit
 */
public class Cobaarraylist 
{
    
    public static void main(String[]args)
    {
        List<String> mahasiswa = new ArrayList<>();
        System.out.println(mahasiswa.size());
        mahasiswa.add("ani");
        mahasiswa.add("budi");
        mahasiswa.add("citra");
        System.out.println(mahasiswa.get(0));
        System.out.println(mahasiswa.get(1));
        System.out.println(mahasiswa.get(2));
        System.out.println(mahasiswa.isEmpty());
        System.out.println(mahasiswa.size());
        int a= mahasiswa.indexOf("citra");
        System.out.println(a);
    
    }
    
}
