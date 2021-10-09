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
public class LinkList {
    static class Node{
        private String name;
        private Node next;
        
        Node(){
            this.name = "-";
            this.next = null;
        }
        
        Node(String name){
            this.name = name;
            this.next = null;
        }
        
        String getName(){
            return this.name;
        }
        
        Node getNext(){
            return this.next;
        }
        
        void setName(String name){
            this.name = name;
        }
        
        void setNext(Node next){
            this.next = next;
        }
    }
    
    static class LinkedList{
        Node first;
        LinkedList(){
            this.first = null;
        }
        
        boolean isEmpty(){
            return this.first == null;
        }
        
        void insertFirst(String name){
            Node new_node = new Node(name);
            if(isEmpty()){
                first = new_node;
            }
            else{
                new_node.setNext(first);
                first = new_node;
            }
        }
        
        void insertLast(String name){
            Node new_node = new Node(name);
            if(isEmpty()){
                first = new_node;
            }
            else{
                Node temp;
                temp = first;
                while(temp.getNext()!=null){
                    temp = temp.getNext();
                }
                temp.setNext(new_node);
            }
        }
        
        void insertAfter(String name,int index){
            Node new_node = new Node(name);
            if(isEmpty()){
                first = new_node;
            }
            else{
                int i=0;
                Node temp;
                temp = first;
                while(temp!=null && i!=index){
                    temp = temp.getNext();
                    i++;
                }
                if(temp!=null){
                    new_node.setNext(temp.getNext());
                    temp.setNext(new_node);
                }
                else{
                    System.out.println("Tidak Valid\n");
                } 
            }
        }
        
        void insertBefore(String name, int index){
            Node new_node = new Node(name);
            if(isEmpty()){
                first = new_node;
            }
            else{
                Node temp,before;
                before=temp = first;
                int i=0;
                while(i!=index && temp!=null){
                    before = temp;
                    temp = temp.getNext();
                    i++;
                }
                if(temp!=null){
                    before.setNext(new_node);
                    new_node.setNext(temp);
                }
                else{
                    System.out.println("Tidak Valid\n");
                }
            }
        }
        
        Node deleteFirst(){
            Node temp = first;
            if(isEmpty()){
                System.out.println("List Kosong");
            }
            else{
                first = temp.getNext();
                System.out.println(temp.getName()+" telah dihapus\n");
                temp.setNext(null);
                temp.setName("");
            }
            return temp;
        }
        
        Node deleteLast(){
            Node end,temp;
            end =temp = first;
            if(isEmpty()){
                System.out.println("List Kosong");
            }
            else{
                while(temp.getNext()!= null){
                    end = temp;
                    temp = temp.getNext();
                }
                end.setNext(null);
                System.out.println(temp.getName()+" telah dihapus\n");
                temp.setNext(null);
                temp.setName("");
            }
            return temp;
        }
        
        Node deleteAfter(int index){
            Node temp;
            temp = first;
            if(isEmpty()){
                System.out.println("List Kosong");
            }
            else{
                int i=0;
                while(temp.getNext()!= null && i!=index){
                    temp = temp.getNext();
                    i++;
                }
                if(temp.getNext()!=null){
                    Node ptr = temp.getNext();
                    temp.setNext(ptr.getNext());
                    ptr.setNext(null);
                    System.out.println(ptr.getName()+" telah dihapus\n");
                    ptr.setName("");
                }
                else{
                    System.out.println("Tidak Valid\n");
                }
            }
            return temp;
        }
      
        void Print(){
            Node P;
            P = first;
            int i = 1;
            if(isEmpty()){
                System.out.println("List Kosong");
            }
            else{
                System.out.println("Starting Kesebelasan");
                while(P != null){
                    System.out.println(i+"."+P.getName());
                    P = P.getNext();
                    i++;
                }
            }
            System.out.println();
        } 
    }
    
    static class Main{
        public static void main(String[] args) {
            LinkedList MU = new LinkedList();
            MU.insertLast("De Gea");
            MU.insertLast("Maguire");
            MU.insertLast("Lindelof");
            MU.insertLast("Shaw");
            MU.insertLast("Aaron Wan-Bisasska");
            MU.Print();
            MU.insertFirst("Martial");
            MU.Print();
            MU.deleteFirst();
            MU.Print();
            MU.deleteLast();
            MU.Print();
            MU.insertBefore("Rashford", 3);
            MU.Print();
            MU.deleteAfter(3);
            MU.Print();
            
        }
    }
}
