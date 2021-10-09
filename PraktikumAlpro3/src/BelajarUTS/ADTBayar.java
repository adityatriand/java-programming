/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BelajarUTS;

/**
 *
 * @author Adit
 */
public class ADTBayar {
    private ADTJualan A;
    public ADTBayar(){
        this.A = new ADTJualan();
    }
    public ADTBayar(ADTJualan newA){
        this.A = newA;
    }
    public ADTJualan getA(){
        return this.A ;
    }
    public void setA(ADTJualan newA){
        this.A = newA;
    }
    static double pay(int banyak){
        double bayar = 5000*banyak;
        return bayar;
    }
    @Override
    public String toString(){
        return this.A.getNama()+" membayar "+pay(this.A.getBeli());
    }
}
