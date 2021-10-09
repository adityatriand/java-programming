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
public class Balok extends PersegiPanjang implements VolumeLuaspermukaan {
    private int tinggi;
    public void setTinggi(int tinggi)
    {
        this.tinggi = tinggi;
    }
    public int getTinggi()
    {
        return tinggi;
    }
    @Override
    public int getVolume()
    {
        int hasil = getPanjang() * getLebar() * getTinggi();
        return hasil;
    }
    @Override
    public int getLuasPemukaan()
    {
        return 2 *(getPanjang() * getLebar() + getPanjang() * getTinggi() + getLebar() * getTinggi());
    }
}
