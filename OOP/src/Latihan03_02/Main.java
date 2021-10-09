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
public class Main {
    public static void main(String[] args) {
        Animal a = new Fish();
        Animal e = new Spider();
        
        e.eat();
        e.walk();
        
        a.walk();
    }
}
