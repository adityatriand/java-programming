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
public class MainQueueIbu {
    public static void main(String[] args) {
        QueueIbu q = new QueueIbu(5);
        q.addQueue(10);
        q.addQueue(20);
        q.addQueue(30);
        q.print();
        q.delQueue();
        q.print();
    }
}
