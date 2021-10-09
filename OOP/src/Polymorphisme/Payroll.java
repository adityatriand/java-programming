/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphisme;

/**
 *
 * @author Adit
 */
public class Payroll {
    private int gajiPokok;

    public Payroll(){
        this.gajiPokok = 0;
    }
    
    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    public int hitungGaji(){
        return gajiPokok;
    }
    
    public void Gaji(){
        System.out.println("Gaji : "+hitungGaji());
    }
    
    
}

class Programmer extends Payroll{
    @Override
    public int hitungGaji(){
        return getGajiPokok();
    }
}

class Sales extends Payroll{
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public int hitungGaji(){
        return getGajiPokok()+bonus;
    }
}

class Manajer extends Payroll{
    private int tunjangan;

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }
    
    @Override
    public int hitungGaji(){
        return getGajiPokok() + tunjangan;
    }
}

class MainPayroll{
    public static void main(String[] args) {
        Programmer harry = new Programmer();
        harry.setGajiPokok(3000000);
        Programmer chandra = new Programmer();
        chandra.setGajiPokok(3000000);
        Programmer albertina = new Programmer();
        albertina.setGajiPokok(3000000);
        
        Sales Baikhaqi = new Sales();
        Baikhaqi.setGajiPokok(2000000);
        Baikhaqi.setBonus(500000);
        
        Manajer Bernard = new Manajer();
        Bernard.setGajiPokok(3000000);
        Bernard.setTunjangan(1000000);
        
        harry.Gaji();
        chandra.Gaji();
        albertina.Gaji();
        Baikhaqi.Gaji();
        Bernard.Gaji();
    }
}