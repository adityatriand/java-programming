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
public class SegitigaSamaKaki extends BangunDatar{
    
    private double sisiMiring;

    public SegitigaSamaKaki() {
    }

    public SegitigaSamaKaki(double alas, double tinggi) {
        super(alas, tinggi);
    }
    
    
    public void hitungSisiMiring()
    {
        sisiMiring = Math.hypot(getAlas()/2, getTinggi());
    }
    
    public void hitungLuas()
    {
        setLuas(getAlas()*getTinggi()/2);
    }
    
    public void hitungKeliling()
    {
        hitungSisiMiring();
        setKeliling(getAlas()+sisiMiring*2);
    }
}
