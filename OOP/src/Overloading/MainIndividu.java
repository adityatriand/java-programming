/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

/**
 *
 * @author Adit
 */
public class MainIndividu {
    public static void main(String[] args) {
        Individu Asep = new Individu();
        Asep.setIdentitas("Asep");
        Asep.cetakIdentitas();
        
        Individu Ujang = new Individu();
        Ujang.setIdentitas("Ujang", "Hitam");
        Ujang.cetakIdentitas();
        
        Individu Andri = new Individu();
        Andri.setIdentitas("Andri", "Putih", 157);
        Andri.cetakIdentitas();
        
        Individu Ayu = new Individu();
        Ayu.setIdentitas("Ayu","Langsat",165,53);
        Ayu.cetakIdentitas();
    }
}
