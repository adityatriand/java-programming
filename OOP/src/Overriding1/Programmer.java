/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding1;

/**
 *
 * @author Adit
 */
public class Programmer extends Pegawai {
    private int bonus;
    private int tunjangan;
    private int lembur;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public int getLembur() {
        return lembur;
    }

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }
    
    @Override
    public int hitungGaji(){
        return getGajiPokok() + tunjangan + bonus + lembur;
    }
    
}
