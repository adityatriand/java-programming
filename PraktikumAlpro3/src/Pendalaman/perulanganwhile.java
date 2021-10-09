/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pendalaman;

/**
 *
 * @author Adit
 */
public class perulanganwhile {
    public static void main(String[] args) {
        boolean cek = false;
        int idx = 0;
        while(!cek){
            idx++;
            System.out.println("True");
            if(idx == 5) cek = true;
        }
    }
}
