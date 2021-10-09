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
public class QueueIbu {
    public int queue[];
    public int tail;
    public int max;
    
    public QueueIbu(int size){
        queue = new int[size];
        tail = -1;
        max = size;
    }
    
    public void addQueue(int value){
        if(isFull()){
            System.out.println("Maaf Antrian Penuh");
        }
        else{
            tail++;
            queue[tail]=value;
        }
    }
    
    public void delQueue(){
        if(isEmpty()){
            System.out.println("Antrean Kosong");
        }
        else
        {
            int val = queue[0];
            queue[0]=0;
            for(int i=1;i<=tail;i++){
                queue[i-1]=queue[i];
                queue[i]=0;
            }
            tail--;
            System.out.println("Nilai "+val+" Telah Terhapus");
        }
    }
    
    public boolean isFull(){
        return tail == max-1;
    }
    
    public boolean isEmpty(){
        return tail == -1;
    }
    
    public void print(){
        for(int i=0;i<=tail;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println("");
    }
}
