/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan01_02;

/**
 *
 * @author Adit
 */
public abstract class PersegiPanjang {
    private int panjang;
    private int lebar;
    public void setPanjang(int panjang)
    {
    this.panjang = panjang;
    }
    public int getPanjang()
    {
    return panjang;
    }
    public void setLebar(int lebar)
    {
    this.lebar = lebar;
    }
    public int getLebar(){
        return lebar;
    }
}
