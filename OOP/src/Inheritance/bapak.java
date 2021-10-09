/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Adit
 */
public class bapak {
    protected int i;
    bapak(){
        System.out.println("Konstruktor Bapak");
        i=0;
    }
    
    bapak(int i){
        System.out.println("Konstruktor Bapak dengan Parameter");
        this.i = i;
    }
    
    public void increament(){
        i++;
    }
}
