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
public class BelajarMainQueue {
    public static void main(String[] args) {
        BelajarQueue queue = new BelajarQueue(3);
        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);
        queue.tampilkan();
        queue.Dequeue();
        queue.tampilkan();
        queue.Dequeue();
        queue.tampilkan();
        queue.Dequeue();
        queue.tampilkan();
    }
}
