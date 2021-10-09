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
public class LinearQueueArray {
    static class Queue2{
        public int data[];
        public int front;
        public int rear;
        public int max;

        public Queue2(int size){
            data = new int[size];
            max = size;
            front = 0;
            rear = -1;
        }

        public void addQueue(int value){
            if(isFull()){
                System.out.println("Maaf Antrian Penuh\n");
            }
            else{
                rear++;
                data[rear]=value;
            }
        }

        int delQueue(){
            int val = data[front];
            if(isEmpty()){
                System.out.println("Antrian Kosong\n");
            }
            else{
                data[front]=0;
                front++;
                System.out.println("Data "+val+" berhasil dihapus\n");
                if(front==max){
                    front = 0;
                    rear = -1;
                }
            }
            return val;
        }

        public boolean isEmpty(){
            return rear==-1;
        }

        public boolean isFull(){
            return rear == max-1;
        }

        public void printQueue(){
            for(int i=0;i<max;i++){
                if(i==front){
                    System.out.println(data[i]+" --> ini front");
                }
                else if(i==rear){
                    System.out.println(data[i]+" --> ini rear");
                }
                else{
                    System.out.println(data[i]);
                }
            }
            System.out.println("");
        }
    }
    
    static class main{
        public static void main(String[] args) {
            Queue2 antri = new Queue2(5);
            antri.addQueue(10);
            antri.addQueue(11);
            antri.addQueue(13);
            antri.addQueue(14);
            antri.addQueue(15);
            antri.printQueue();
            antri.addQueue(13);
            antri.delQueue();
            antri.printQueue();
            antri.addQueue(11);
            
            
        }
    }
}
