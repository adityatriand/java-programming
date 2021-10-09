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
public class DriverSegiEmpat {
    public static void main(String[] args) {
        ADTPoint P = new ADTPoint(5,10);
        ADTPoint Q = new ADTPoint(10,5);
        ADTSegiEmpat tes = new ADTSegiEmpat(P,Q);
        System.out.println(tes);
        System.out.println("Luas Segi Empat = "+tes.LuasSegiEmpat() );
    }
}
