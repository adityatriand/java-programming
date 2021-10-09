/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan03_02;

/**
 *
 * @author Adit
 */
public class Fish extends Animal {
    
    public Fish(){
        super(0);
    }
    
    @Override
    public void eat(){
        System.out.println("Ikan memakan jentik-jentik");
    }
    
    @Override
    public void walk(){
        System.out.println("Ikan tidak berjalan tetapi berenang");
    }
}
