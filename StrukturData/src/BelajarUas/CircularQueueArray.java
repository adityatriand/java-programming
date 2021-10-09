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
public class CircularQueueArray {
    static class QueueArr{
        public int [] arr;
        public int front;
        public int rear;
        public int size;
        
        QueueArr(int max){
            this.arr = new int [max];
            this.size = 0;
            this.front = 0;
            this.rear = -1;
        }
        
        boolean isEmpty(){
            return this.size == 0;
        }
        
        boolean isOneEl(){
            return this.front == this.rear;
        }
        
        boolean isFull(){
            int temp;
            if(this.rear==-1)temp=this.rear;
            else temp=this.rear+1;
            return (temp%this.arr.length) == this.front;
        }
        
        void enqueue(int data){
            if(isFull()){
                System.out.println("Data Full");
            }
            else{
                this.rear = (this.rear+1)%this.arr.length;
                this.arr[this.rear]= data;
                this.size++;
                System.out.println("Tambah Data Berhasil");
            }
        }
        
        int dequeue(){
            int data = arr[this.front];
            if(isOneEl()){
                this.front = 0;
                this.rear = -1;
            }
            else{
                this.arr[this.front]=0;
                this.front = (this.front+1)%this.arr.length;
            }
            System.out.println(data+" berhasil dihapus");
            this.size--;
            return data;
        }
        
        void print(){
            if(isEmpty()){
                System.out.println("Antrian Kosong");
            }
            else{
                for(int i=0;i<this.arr.length;i++){
                    System.out.print(this.arr[i]+" ");
                }
                System.out.println();
            }
        }  
    }
    
    static class main{
        public static void main(String[] args) {
            QueueArr arr = new QueueArr(5);
            arr.enqueue(10);
            arr.enqueue(11);
            arr.enqueue(9);
            arr.enqueue(8);
            arr.enqueue(7);
            arr.print();
            arr.dequeue();
            arr.print();
            arr.dequeue();
            arr.print();
            arr.enqueue(7);
            arr.enqueue(7);
            arr.enqueue(7);
            arr.print();
            arr.dequeue();
            arr.print();
            arr.enqueue(8);
            arr.print();
        }
    }
}
