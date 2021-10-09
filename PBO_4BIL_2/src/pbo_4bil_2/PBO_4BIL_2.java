/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_4bil_2;

/**
 *
 * @author KANDAJM
 */
public class PBO_4BIL_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SegitigaSikuSiku S1 = new SegitigaSikuSiku(3,4);
        //S1.setAlas(3);
        //S1.setTinggi(4);
        S1.hitungKeliling();
        S1.hitungLuas();
        S1.cetak();
        
        
        
        SegitigaSamaKaki S2 = new SegitigaSamaKaki(3,4);
        //S2.setAlas(3);
        //S2.setTinggi(4);
        S2.hitungKeliling();
        S2.hitungLuas();
        S2.cetak();
        
        
    }
    
}
