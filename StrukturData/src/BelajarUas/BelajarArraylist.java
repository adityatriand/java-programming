/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BelajarUas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author Adit
 */
public class BelajarArraylist {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        //tanda < > berguna sebagai penentu tipe data. apabila sudah dikasih tipe data maka
        //harus memasukkan nilai sesuai dengan tipe data yang telah didefinisikan
        arr.add(1);
        arr.add("adit");
        Object [] ob = arr.toArray(); //mengkonfersikan dari ArrayList ke Array
        System.out.println(ob[1]);
        //
        
        ArrayList<Integer> id = new ArrayList<>();
        for(int i=0;i<10;i++){
            id.add(i);
        }
        System.out.println(id);
        for(int i=0;i<5;i++){
            id.add(i);
        }
        System.out.println(id);
        for(int i=0;i<5;i++){
            id.set(i, 0);
        }
        System.out.println(id);
        //untuk menghapus karakter tertentu sekali banyak
        Iterator itr = id.iterator(); 
        while (itr.hasNext()) 
        { 
            int x = (Integer)itr.next(); 
            if (x == 0) 
                itr.remove(); 
        } 
        System.out.println(id);
        id.sort(Comparator.naturalOrder()); //Sorting ascending
        System.out.println(id);
        id.sort((Comparator<? super Integer>) Comparator.naturalOrder().reversed()); //Sorting descending
        System.out.println(id);
        
        int cari = 10;
        System.out.println("Apakah angka "+cari+" ada dalam array list ? "+id.contains(cari));
        System.out.println(id.indexOf(4));
        System.out.println("Apakah arraylist kosong ?"+id.isEmpty());
        System.out.println("Ukuran Array List : "+id.size());
        System.out.println("Nilai yang berada pada index 5 adalah "+id.get(5));
    }
}
