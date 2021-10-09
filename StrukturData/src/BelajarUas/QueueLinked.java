/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BelajarUas;

/**
 *
 * @author Adit
 */
public class QueueLinked {
    static class QueueNode{
        private int data;
        private QueueNode next;
        
        QueueNode(){
            this.data = 0;
            this.next = null;
        }
        
        QueueNode(int data){
            this.data = data;
            this.next = null;
        }
        
        int getData(){
            return this.data;
        }
        
        QueueNode getNext(){
            return this.next;
        }
        
        void setData(int data){
            this.data = data;
        }
        
        void setNext(QueueNode next){
            this.next = next;
        }
    }
    
    static class QueueList{
        public QueueNode head;
        public QueueNode tail;
        public int size;
        
        QueueList(){
            this.head = null;
            this.tail = null;
            this.size = 0;
        }
        
        boolean isEmpty(){
            return this.head == null;
        }
        
        boolean isOneEl(){
            return this.head == this.tail;
        }
        
        void enqueue(int data){
            QueueNode new_node = new QueueNode(data);
            if(isEmpty()){
                this.head = new_node;
                this.tail = new_node;
            }
            else{
                this.tail.setNext(new_node);
                this.tail = new_node;
            }
            this.size++;
        }
        
        QueueNode dequeue(){
            QueueNode temp = this.head;
            if(isEmpty()){
                System.out.println("List Kosong");
            }
            else{
                if(isOneEl()){
                    this.head = null;
                    this.tail = null;
                }
                else{
                    this.head = temp.getNext();
                    temp.setNext(null);
                }
                System.out.println(temp.getData()+" telah dihapus");
                temp.setData(0);
                this.size--;
            }
            return temp;
        }
        
        void print(){
            QueueNode temp;
            temp = this.head;
            if(isEmpty()){
                System.out.println("List Kosong");
            }
            else{
                while(temp!=null){
                    System.out.print(temp.getData()+" ");
                    temp = temp.getNext();
                }
                System.out.println();
            }
        }
    }
    
    static class main{
        public static void main(String[] args) {
            QueueList antri = new QueueList();
            antri.enqueue(10);
            antri.enqueue(11);
            antri.enqueue(12);
            antri.print();
            antri.dequeue();
            antri.print();
            antri.dequeue();
            antri.print();
            antri.dequeue();
            antri.print();
        }
    }
}
