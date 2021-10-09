/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author Adit
 */
public class Rudal {
    private float luasPermukaanTabung;
    private float luasPermukaanKerucut;
    
    public Rudal(){
        luasPermukaanKerucut = 0;
        luasPermukaanTabung = 0;
    }

    public float getLuasPermukaanTabung() {
        return luasPermukaanTabung;
    }

    public void setLuasPermukaanTabung(float luasPermukaanTabung) {
        this.luasPermukaanTabung = luasPermukaanTabung;
    }

    public float getLuasPermukaanKerucut() {
        return luasPermukaanKerucut;
    }

    public void setLuasPermukaanKerucut(float luasPermukaanKerucut) {
        this.luasPermukaanKerucut = luasPermukaanKerucut;
    }
    
    public float luasPermukaan(){
        return luasPermukaanTabung + luasPermukaanKerucut;
    }
    
    public void Informasi(){
        System.out.println("Luas Permukaan Tabung = "+luasPermukaanTabung);
        System.out.println("Luas Permukaan Kerucut = "+luasPermukaanKerucut);
        System.out.println("Luas Permukaan Rudal = "+luasPermukaan());
    }
}