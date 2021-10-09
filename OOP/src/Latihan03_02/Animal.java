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
public abstract class Animal {
    protected int legs;
    protected Animal(int legs){
        this.legs = legs;
    }
    public abstract void eat();
    public void walk(){
        System.out.println("Hewan ini berjalan dengan "+this.legs+" kaki");
    }
}
