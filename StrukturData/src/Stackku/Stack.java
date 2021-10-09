/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stackku;

/**
 *
 * @author Adit
 */
public class Stack {
    private int[]stack;
    private int max;
    private int top;
    
    public Stack(int size){
        this.max = size;
        this.stack = new int [this.max];
        this.top = -1;
    }
    
    public boolean isFull(){
        return this.top == this.max-1;
    }

    public boolean isEmpty(){
        return this.top == -1;
    }
    
    public void push(int value){
        if(isFull()==false){
            this.top++;
            this.stack[this.top] = value;
        }
        else{
            System.out.println("Stack Penuh");
        }
    }
    
    public void pop(){
        if(isEmpty()== false){
            System.out.println("\nNilai yang dihapus : " + this.stack[this.top]);
            this.stack[this.top]=0;
            this.top--;
        }
        else{
            System.out.println("Stack kosong");
        }
    }
    
    public void printDec(){
        for(int i=this.max-1;i>=0;i--){
            if(i==this.top) System.out.println(i+" "+this.stack[i]+"--> top");
            else System.out.println(i+" "+this.stack[i]);
        }
    }
    
    public void printInc(){
        for(int i=0;i<this.max;i++){
            if(i==this.top) System.out.println(i+" "+this.stack[i]+"--> top");
            else System.out.println(i+" "+this.stack[i]);
        }
    }
    
    public int peek(){
        return this.stack[this.top];
    }
    
    public void peekProsedur(){
        System.out.println("\nNilai top / peek = "+this.stack[this.top]);
    }
   
    
}
