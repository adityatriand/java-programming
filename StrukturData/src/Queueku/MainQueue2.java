/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queueku;

/**
 *
 * @author Adit
 */
public class MainQueue2 {
    public static void main(String[] args) {
        Queue2 q = new Queue2(6);
        q.addQueue(1);
        q.printQueue();
        q.addQueue(2);
        q.printQueue();
        q.addQueue(3);
        q.printQueue();
        q.addQueue(4);
        q.printQueue();
        q.addQueue(5);
        q.printQueue();
        q.addQueue(6);
        q.printQueue();
        q.addQueue(7);
        
        q.delQueue();
        q.printQueue();
        q.delQueue();
        q.printQueue();
        q.delQueue();
        q.printQueue();
        q.delQueue();
        q.printQueue();
        q.delQueue();
        q.printQueue();
        q.delQueue();
        q.printQueue();      
        q.delQueue();
        
        q.addQueue(1);
        q.printQueue();
        q.addQueue(10);
        q.printQueue();
        q.addQueue(11);
        q.printQueue();
    }
}
