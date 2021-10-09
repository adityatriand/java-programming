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
public class Main {
    static class listNode{
        float value;
        listNode head;
        listNode(){
            value = 0;
            head = null;
        }
        
        listNode(float value){
            this.value = value;
        }
        
        listNode getNext(){
            return this.head;
        }
        
        void setNext(listNode node){
            this.head = node;
        }
        
        void append (float newValue){
            listNode newNode = new listNode(newValue);
            listNode NodePtr;
            if(this.head==null){
                this.head = newNode;
            }
            else{
                NodePtr = this.head;
                while(NodePtr.getNext()!= null){
                    NodePtr = NodePtr.getNext();
                }
                NodePtr.setNext(newNode);
            }
        }
        
        void print(listNode list){
        listNode P;
        P = list.head;
        System.out.print("Data = ");
        while(P!=null){
            if(P.head != null){
                System.out.print(P.value+"  ");    
            }
            else{
                System.out.print(P.value+".\n");
            }
            P=P.head;
        }
        System.out.println("");
    }
    }
    
    public static void main(String[] args) {
        listNode tes = new listNode();
        tes.append(0.5f);
        tes.append(0.4f);
        tes.append(0.3f);
        tes.print(tes);

    }
    
}
