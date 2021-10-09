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
public class StackLinked {
    static class StackNode{
        private int data;
        private StackNode next;
        
        StackNode(){
            this.data = 0;
            this.next = null;
        }
        
        StackNode(int data){
            this.data = data;
            this.next = null;
        }
        
        int getData(){
            return this.data;
        }
        
        StackNode getNext(){
            return this.next;
        }
        
        void setData(int data){
            this.data = data;
        }
        
        void setNext(StackNode next){
            this.next = next;
        }
    }
    
    static class StackList{
        public StackNode head;
        public int size;
        
        StackList(){
            this.head = null;
            this.size = 0;
        }
        
        boolean isEmpty(){
            return this.size == 0;
        }
        
        void push(int data) {
            StackNode newNode = new StackNode(data);
                if(isEmpty()) {
                    this.head = newNode;
                } 
                else {
                    newNode.setNext(this.head);
                    this.head= newNode;
                }
            this.size++;
        }
        StackNode pop() {
            StackNode delNode;
            delNode = this.head;
            this.head = this.head.getNext();
            delNode.setNext(null);
            this.size--;
            return delNode;
        }
        
        int peek() {
            int data;
            if(isEmpty()) {
                return -1;
            } 
            else {
                data = this.head.getData();
                return data;
            }
        }
        
        void print(){
            if(isEmpty()){
                System.out.println("Tumpukkan Kosong");
            }
            else{
                StackNode P = this.head;
                while(P!= null){
                    System.out.print(P.getData()+" ");
                    P = P.getNext();
                }
                System.out.println();
            }
        }
    }
    
    static class main{
        public static void main(String[] args) {
            StackList stack = new StackList();
            stack.push(10);
            stack.push(12);
            stack.push(13);
            stack.push(14);
            stack.push(15);
            stack.push(11);
            stack.print();
            System.out.println(stack.peek());
            System.out.println(stack.size);
        }
    }
}
