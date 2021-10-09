/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_AdityaTriAnanda;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class MainLinkedList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList link1 = new LinkedList();
        link1.inputCek(link1);
        System.out.println("");
        link1.print(link1);
        link1.inputUbah(link1);
        System.out.println("Data setelah diubah ");
        link1.print(link1);
        
    }
}
