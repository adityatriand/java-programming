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
public class anak extends bapak {
    private int j;
    anak(){
        System.out.println("Konstruktor Anak");
        j=0;
    }
    
    anak(int x){
        System.out.println("Konstruktor Anak dengan Parameter");
        j = x;
    }
    
    @Override
    public void increament(){
        i++;
        j++;
        System.out.println("i = "+i+" | j = "+j);
    }
}
