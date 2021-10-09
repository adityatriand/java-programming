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
public class Kubus extends PersegiPanjang implements VolumeLuaspermukaan {
    public Kubus (int sisi)
    {
        setLebar(sisi);
        setPanjang(sisi);
    }
    @Override
    public int getVolume() {
        //karena rumus volume dari kubus adalah s*s*s maka untuk satu lagi boleh menggunakan lebar ataupun panjang karena mempunyai nilai yang sama
        return getPanjang() * getLebar() * getPanjang() ;
    }
    @Override
    public int getLuasPemukaan()
    {
        //karena lebar dan panjang telah diset dengan nilai sisi yang sama maka boleh gunakan salah satu
        return 6 * getPanjang()*getLebar();
    }
}
