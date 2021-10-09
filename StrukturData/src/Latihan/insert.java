/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Adit
 */
public class insert {
    static class node{
        int info;
        node next;
        
        node(){
            this.info = 0;
            this.next = null;
        }
        
        node(int x){
            this.info = x;
            this.next = null;
        }
    }
    
    static class LinkedList{
        private node first;
        private node rear;
        LinkedList(){
            this.first = null;
            this.rear = null;
        }
        
        void push(int data){
            node new_node = new node(data);
            if(this.first==null){
                new_node.next = null;
                first = new_node;
            }
            else{
                new_node.next=first;
                first = new_node;
            }
        }
        
        void addQueue(int data){
            node new_node = new node(data);
            if(this.first==null){
                new_node.next = null;
                first = rear = new_node;
            }
            else{
                rear.next = new_node;
                rear = new_node;
                new_node.next = null;
            }
        }
        
        void pop(){
            if(isEmpty()){
                System.out.println("List Kosong");
            }
            else{
                node temp = first;
                this.first = this.first.next;
                System.out.println("Nilai "+temp.info+" telah dihapus\n");
                temp.next = null;
                temp.info = 0;
            }
        }
        
        void delQueue(){
            if(isEmpty()){
                System.out.println("List Kosong");
            }
            else{
                node temp = first;
                this.first = this.first.next;
                System.out.println("Nilai "+temp.info+" telah keluar\n");
                temp.next = null;
                temp.info = 0;
            }
        }
        
        void printStack(){
            node P;
            P = first;
            if(isEmpty()){
                System.out.println("List Kosong");
            }
            else{
                while(P!=null){
                    System.out.println(P.info);
                    P=P.next;
                }
                System.out.println("\nNilai yang berada di Top = "+getTop()+"\n");
            }
        }
        
        void printQueue(){
            node P;
            P = first;
            if(isEmpty()){
                System.out.println("List Kosong");
            }
            else{
                while(P!=null){
                    System.out.println(P.info);
                    P=P.next;
                }
            }
            System.out.println("\nNilai pertama di antri sekarang = "+getTop()+"\n");
        }
        
        boolean isEmpty(){
            return first == null;
        }
        
        int getTop(){
            return this.first.info;
        }
        
    }
    
    public static void main(String[] args) {
        System.out.println("Stack Linked List");
        System.out.println("=================\n");
        LinkedList tes = new LinkedList();
        tes.push(10);
        tes.push(11);
        tes.push(12);
        tes.printStack();
        tes.push(13);
        tes.printStack();
        tes.pop();
        tes.printStack();
        tes.pop();
        tes.pop();
        tes.pop();
        tes.printStack();
        
//        System.out.println("\n=================");
//        System.out.println("Queue Linked List");
//        System.out.println("=================\n");
        
//        LinkedList tes2 = new LinkedList();
//        tes2.addQueue(12);
//        tes2.addQueue(13);
//        tes2.addQueue(4);
//        tes2.addQueue(15);
//        tes2.printQueue();
//        tes2.delQueue();
//        tes2.printQueue();
//        tes2.delQueue();
//        tes2.printQueue();
    }
}
