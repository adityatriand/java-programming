/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_4bil_4;

/**
 *
 * @author KANDAJM
 */
public class SegitigaSikuSiku extends BangunDatar implements Relation,Geometry{

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

    @Override
    public boolean isEqual(Object a) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        SegitigaSikuSiku temp = (SegitigaSikuSiku) a;
        
        this.hitungLuas();
        temp.hitungLuas();
        return this.getLuas() == temp.getLuas();
    }

    @Override
    public boolean isGreater(Object a) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        SegitigaSikuSiku temp = (SegitigaSikuSiku) a;
        
        this.hitungLuas();
        temp.hitungLuas();
        return this.getLuas() > temp.getLuas();
    }

    @Override
    public boolean isLess(Object a) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        SegitigaSikuSiku temp = (SegitigaSikuSiku) a;
        
        this.hitungLuas();
        temp.hitungLuas();
        return this.getLuas() < temp.getLuas();
    }

    @Override
    public boolean isIdentical(Object a) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        SegitigaSikuSiku temp = (SegitigaSikuSiku) a;
        if(this.getAlas() == temp.getAlas() && this.getTinggi() == temp.getTinggi())
            return true;
        else
            return false;
    }

    @Override
    public boolean isCongruent(Object a) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        SegitigaSikuSiku temp = (SegitigaSikuSiku) a;
        
        return this.getAlas()/this.getTinggi() == temp.getAlas()/temp.getTinggi();
    }
    
    
}
