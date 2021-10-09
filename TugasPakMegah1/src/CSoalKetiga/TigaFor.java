package CSoalKetiga;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adit
 */
public class TigaFor {
    public static void main(String[]args){
        int N = 5;
        System.out.println("PANTULAN BOLA KARET");
        System.out.println("===================");
        for(int i=N;i>=1;i--){
            System.out.println("tinggi "+i+", mantul turun menjadi "+(i-1));    
        }
        System.out.println("tinggi 0, tidak mantul");
    }
}
