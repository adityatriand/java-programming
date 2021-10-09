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
public class SegitigaSikuSiku extends BangunDatar{

    private double sisiMiring;

    public SegitigaSikuSiku() {
    }

    public SegitigaSikuSiku(double alas, double tinggi) {
        super(alas, tinggi);
    }
    
    public void hitungSisiMiring()
    {
        sisiMiring = Math.hypot(getAlas(), getTinggi());
    }
    
    public void hitungLuas()
    {
        setLuas(getAlas()*getTinggi()/2);
    }
    
    public void hitungKeliling()
    {
        hitungSisiMiring();
        setKeliling(getAlas()+getTinggi()+sisiMiring);
    }
    
    @Override
    public void cetak()
    {
        System.out.println("Alas : "+getAlas());
        System.out.println("Tinggi : "+getTinggi());
        System.out.println("Sisi Miring : "+sisiMiring);
        System.out.println("Keliling : "+getKeliling());
        System.out.println("Luas : "+getLuas());
        System.out.println("");
    }
}
