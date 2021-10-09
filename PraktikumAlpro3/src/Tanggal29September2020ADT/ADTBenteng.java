/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanggal29September2020ADT;

/**
 *
 * @author Adit
 */
public class ADTBenteng {
    private warna warna;
    private int posX;
    private int posY;
    private boolean status;
    
    public enum warna{
        Putih,Hitam;
    }
    
    public ADTBenteng(){
        this.warna = null;
        this.posX = 0;
        this.posY = 0;
    }
    
    public ADTBenteng(warna warna, int newPosX, int newPosY ){
        this.warna = warna;
        this.posX = newPosX;
        this.posY = newPosY;
    }
    
    public warna getWarna(){
        return this.warna;
    }
    
    public int getPosX(){
        return this.posX;
    }
    
    public int getPosY(){
        return this.posY;
    }
    
//    public boolean getStatus(){
//        return this.status;
//    }
    
    public void setWarna(warna warna){
        this.warna = warna;
    }
    
    public void setPosX(int newPostX){
        this.posX = newPostX;
    }
    
    public void setPosY(int newPostY){
        this.posY = newPostY;
    }
    
//    public void setStatus(boolean newStatus){
//        this.status = newStatus;
//    }
    
    @Override
    public String toString(){
        return "Posisi Benteng "+this.warna+" = "+this.posX+" , "+this.posY;
    }
    
    public void jalanMaju(int kotak){
        this.posY += kotak;
    }
    
    public void jalanMundur(int kotak){
        this.posY -= kotak;
    }
    
    public void jalanKiri(int kotak){
        this.posX -= kotak;
    }
    
    public void jalanKanan(int kotak){
        this.posX += kotak;
    }
}
