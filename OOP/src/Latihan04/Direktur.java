/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan04;

/**
 *
 * @author Adit
 */
public class Direktur extends Pegawai {
    private int tunjangan = 2000000;
    private int keuntunganPT = 5000000;
    
    public Direktur(String name,int salary){
        super(name,salary,"Direktur");
    }
    
    public int getTunjangan(){
        return this.tunjangan;
    }
    
    public void setTunjangan(int tunjangan){
        this.tunjangan = tunjangan;
    }

    public int getKeuntunganPT() {
        return keuntunganPT;
    }

    public void setKeuntunganPT(int keuntunganPT) {
        this.keuntunganPT = keuntunganPT;
    }
    
        
    @Override
    public int getTotalSalary(){
        return super.getSalary()+ this.tunjangan + this.keuntunganPT;
    } 
            
    @Override
    public void showSalary(){
        super.showSalary();
        System.out.println("Tunjangan = Rp."+getTunjangan());
        System.out.println("Keuntungan Perusahaan = Rp."+getKeuntunganPT());
        System.out.println("Total Salary = Rp."+getTotalSalary());
    }
}
