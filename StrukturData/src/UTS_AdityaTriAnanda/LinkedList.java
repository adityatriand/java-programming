/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_AdityaTriAnanda;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class LinkedList {
    Node first;
    public LinkedList(){
        first = null;
    }
     
    public LinkedList insertfirst(LinkedList list, int data){
        Node new_node = new Node(data);
        if(list.first==null){
            new_node.next = null;
            list.first = new_node;
        }
        else{
            new_node.next=list.first;
            list.first = new_node;
        }
        return list;
    }
    
    public LinkedList deleteFirst(LinkedList list){
        
        if(list.first==null){
            System.out.println("List Kosong");
        }
        else{
            Node temp = list.first;
            list.first = temp.next;
            temp.next = null;
            Node P = list.first;
        }
        
        return list;
    }
    
    public LinkedList deleteLast(LinkedList list){
        if(list.first == null){
            System.out.println("List Kosong");
        }
        else{
            Node temp = null;
            Node last = list.first;
            while(last.next!=null){
                temp = last;
                last = last.next;
            }
            temp.next = null;
        }
        return list;
    }
    
    public void print(LinkedList list){
        Node P;
        P = list.first;
        if(P==null){
            System.out.println("Data Kosong");
        }
        else{
            System.out.print("Data = ");
            while(P!=null){
                if(P.next != null){
                    System.out.print(P.info+"  ");    
                }
                else{
                    System.out.print(P.info+".\n");
                }
                P=P.next;
            }
            System.out.println("");
        }
    }
    
    public void inputCek(LinkedList list){
        Scanner input = new Scanner(System.in);
        int data;
        do{
            System.out.print("Masukkan nilai : ");
            data = input.nextInt();
            if(data!=999){
                list.insertfirst(list, data);
            }
            else{
                System.out.println("Masukkan berhenti");
            }
        }while(data!=999);
    }

    public void inputUbah(LinkedList link1){
        Node P;
        P = link1.first;
        if(P!=null){
            while(P.next!=null){
                P=P.next;
            }
            if(link1.first.info >= 10 || P.info >= 10){
                if(link1.first.info >= 10 && P.info >= 10){
                    link1.deleteFirst(link1);
                    link1.deleteLast(link1);
                }
                else if(link1.first.info >= 10){
                    link1.deleteFirst(link1);
                }
                else{
                    link1.deleteLast(link1);
                }
            }
            else if(link1.first.info < 10){
                link1.deleteFirst(link1);
                link1.insertfirst(link1, 10);
            }
        }
    }
    
}
