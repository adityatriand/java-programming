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
public class StackArray {
    static class Stack{
        public int arr[];
        public int top;
        public int max;
        
        Stack(int size){
            this.arr = new int [size];
            this.top = -1;
            this.max = size;
        }
        
        boolean isEmpty(){
            return this.top == -1;
        }
        
        boolean isFull(){
            return this.top == this.max-1;
        }
        
        void push(int nilai){
            if(isFull()){
                System.out.println("Tumpukkan Penuh");
            }
            else{
                this.top++;
                this.arr[this.top] = nilai;
            }
        }
        
        int pop(){
            int data = this.arr[this.top];
            if(isEmpty()){
                System.out.println("Tumpukkan Kosong");
            }
            else{
                this.top--;
            }
            return data;
        }
        
        int peek(){
            if(isEmpty()){
                return -1;
            }
            else{
                return this.arr[this.top];
            }
        }
        
        void print(){
            if(isEmpty()){
                System.out.println("Tumpukkan Kosong");
            }
            else{
                for(int i=this.top;i>=0;i--){
                    if(i==this.top) System.out.println(i+" "+this.arr[i]+"--> top");
                    else System.out.println(i+" "+this.arr[i]);
                }
                System.out.println();
            }
        }
    }
    
    static class main{
        public static void main(String[] args) {
            Stack tes = new Stack(3);
            tes.push(10);
            tes.push(11);
            tes.push(12);
            tes.push(13);
            System.out.println(tes.peek());
            tes.print();
            tes.pop();
            tes.print();
            System.out.println(tes.peek());
            
            //Contoh Reverse Data
            int arr[]={1,2,3,4,5};
            
            System.out.println();
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            
            Stack stack = new Stack(arr.length);
            for(int i=0;i<arr.length;i++){
                stack.push(arr[i]);
            }
            for(int i=0;i<arr.length;i++){
                arr[i] = stack.pop();
            }
            
            System.out.println();
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
