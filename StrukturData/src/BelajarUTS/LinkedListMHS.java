/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BelajarUTS;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class LinkedListMHS {
    NodeMHS first;
    public static Scanner input = new Scanner(System.in);
    public static Scanner in = new Scanner(System.in);
    public LinkedListMHS(){
        first = null;
    }
    
    public LinkedListMHS insertlast(LinkedListMHS list){
        String nama,NIM;
        int nilai;
        System.out.print("Masukkan Nama           : ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM            : ");
        NIM = in.nextLine();
        System.out.print("Masukkan Nilai Strukdat : ");
        nilai = input.nextInt();
        NodeMHS new_node = new NodeMHS(nama,NIM,nilai);
        new_node.next = null;
        if(list.first==null){
            list.first = new_node;
        }
        else{
            NodeMHS temp;
            temp = list.first;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = new_node;
        }
        return list;
    }
    
    public LinkedListMHS insertfirst(LinkedListMHS list){
        String nama,NIM;
        int nilai;
        System.out.print("Masukkan Nama           : ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM            : ");
        NIM = in.nextLine();
        System.out.print("Masukkan Nilai Strukdat : ");
        nilai = input.nextInt();
        NodeMHS new_node = new NodeMHS(nama,NIM,nilai);
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
    
    public LinkedListMHS insertafter(LinkedListMHS list, int index){
        String nama,NIM;
        int nilai;
        System.out.print("Masukkan Nama           : ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM            : ");
        NIM = in.nextLine();
        System.out.print("Masukkan Nilai Strukdat : ");
        nilai = input.nextInt();
        NodeMHS new_node = new NodeMHS(nama,NIM,nilai);
        if(list.first==null){
            System.out.println("List Kosong");
        }
        else{
            NodeMHS temp;
            temp = list.first;
            int i = 0;
            while(i<index-1 && temp!=null){
                temp = temp.next;
                i++;
            }
            if(temp != null){
                new_node.next = temp.next;
                temp.next = new_node;
            }
            else{
                System.out.println("Datanya Kurang");
            }
        }
        return list;
    }
    
    public LinkedListMHS deleteFirst(LinkedListMHS list){
        
        if(list.first==null){
            System.out.println("List Kosong");
        }
        else{
            NodeMHS temp = list.first;
            list.first = temp.next;
            temp.next = null;
            System.out.println("Data "+temp.NIM+" berhasil dihapus");
        }
        
        return list;
    }
    
    public LinkedListMHS deleteLast(LinkedListMHS list){
        if(list.first == null){
            System.out.println("List Kosong");
        }
        else{
            NodeMHS temp = null;
            NodeMHS last = list.first;
            while(last.next!=null){
                temp = last;
                last = last.next;
            }
            temp.next = null;
            System.out.println("Data "+last.NIM+" berhasil dihapus");
        }
        return list;
    }
    
    public LinkedListMHS deleteAfter(LinkedListMHS list, int index){
        if(list == null){
            System.out.println("List Kosong"); 
        }
        else{ 
            NodeMHS temp = list.first;  
            int i = 1; 
            if(index==0){ 
                System.out.println("Penghitungan index dimulai dari 1");
            }
            else if(index==1){ 
                deleteFirst(list);
            }
            else{ 
                while(i<index-1 && temp!=null){ 
                    temp = temp.next; 
                                      
                    i++; 
                    if(temp.next==null){ 
                        System.out.println("Index yang anda masukkan melebihi data");
                        break;
                    }
                }
                if(temp.next!=null){ 
                    NodeMHS P = temp.next;
                    temp.next = P.next; 
                    P.next = null; 
                    System.out.println("Data "+P.NIM+" berhasil dihapus"); 
                }
            }
        }
        return list;
    }
    
    
    public void view(LinkedListMHS list){
        NodeMHS P;
        P = list.first;
        while(P!=null){
            System.out.println("Nama           : "+P.nama);
            System.out.println("NIM            : "+P.NIM);
            System.out.println("Nilai Strukdat : "+P.nilai);
            System.out.println("=====================================");
            P=P.next;
        }
    }
}
