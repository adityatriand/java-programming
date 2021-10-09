/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stackku;

/**
 *
 * @author Adit
 */
public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(10);
        s.push(10);
        s.push(20);
        s.push(16);
        s.push(30);
        s.push(50);
        s.push(25);
        s.printDec();
        System.out.println("");
        s.pop();
        s.printDec();
        
        System.out.println("\nNilai top / peek = "+s.peek());//ini fungsi
        s.peekProsedur();//ini prosedur
    }
}
