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
public class ADTSegiEmpat {
    
    private ADTPoint P;
    private ADTPoint Q;
    
    public ADTSegiEmpat(){
        this.P = new ADTPoint();
        this.Q = new ADTPoint();
    }
    
    public ADTSegiEmpat(ADTPoint P,ADTPoint Q){
        this.P= P;
        this.Q = Q;
    }
    
    public int getX(ADTPoint P){
        return P.getX();
    }
    
    public int getY(ADTPoint Q){
        return Q.getY();
    }
     
    public int ukuranPanjang(){
        if(getX(this.Q)>getX(this.P)){
            return (getX(this.Q)-getX(this.P));
        }
        else{
            return 0; //tidak valid
        }
    }
    
    public int ukuranLebar(){
        if(getY(this.P)>getY(this.Q)){
            return (getY(this.P)-getY(this.Q));
        }
        else{
            return 0; //tidak valid
        }
    }
    
    public int LuasSegiEmpat(){
        return (ukuranPanjang()*ukuranLebar());
    }
    
    @Override
    public String toString(){
        return ("Titik P = "+this.P+" || Titik Q = "+this.Q);
    }
}
