/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedListku;

/**
 *
 * @author Adit
 */
public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList L1 = new LinkedList();
        L1.insertfirst(L1,5);
        L1.insertlast(L1, 25);
        L1.insertlast(L1, 17);
        L1.insertlast(L1, 20);
        L1.insertlast(L1, 15);
        L1.insertlast(L1, 27);
        L1.insertlast(L1, 30);
        L1.print(L1);
        
        L1.insertfirst(L1, 10);
        L1.print(L1);
        
        L1.insertafter(L1, 29, 2); //index diitung mulai dari 0
        L1.print(L1);
        
        L1.deleteFirst(L1);
        L1.print(L1);
        
        L1.deleteLast(L1);
        L1.print(L1);
        
        L1.deleteAfter(L1, 6);
        L1.print(L1);
        
        System.out.println(L1.cari(5));
    }
}
