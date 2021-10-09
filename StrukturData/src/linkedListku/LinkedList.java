/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedListku;

/**
 *
 * @author Adit
 */
public class LinkedList {
    Node first;
    public LinkedList(){
        first = null;
    }
    
    public LinkedList insertlast(LinkedList list, int data){
        
        Node new_node = new Node(data);
        new_node.next = null;
        if(list.first==null){
            list.first = new_node;
        }
        else{
            Node temp;
            temp = list.first;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = new_node;
        }
        return list;
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
    
    public LinkedList insertafter(LinkedList list, int data, int index){
        Node new_node = new Node(data);
        if(list.first==null){
            System.out.println("List Kosong");
        }
        else{
            Node temp;
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
    
    public LinkedList deleteFirst(LinkedList list){
        
        if(list.first==null){
            System.out.println("List Kosong");
        }
        else{
            Node temp = list.first;
            list.first = temp.next;
            temp.next = null;
            System.out.println("Data "+temp.info+" berhasil dihapus");
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
    
    public LinkedList deleteAfter(LinkedList list, int index){
        if(list == null){
            System.out.println("List Kosong"); // akan dieksekusi jika list nya masih kosong
        }
        else{ //jika list tidak kosong maka kode dibawah ini akan dieksekusi
            Node temp = list.first; //membuat variabel baru dengan tipe data Object Node dengan nilainya = nilai list pertama
            int i = 1; //sebagai acuan untuk menghitung apakah telah sampai sesuai index yang dimasukkan di parameter
            if(index==0){ // akan dieksekusi jika index inputnya 0. pada kodingan ini indexnya dimulai dari 1
                System.out.println("Penghitungan index dimulai dari 1");
            }
            else if(index==1){ //koding ini diperlukan untuk mengatasi jika user input indexnya 1. karena pada dasarnya
                //jika indexnya 1 sama saja seperti delete first sehingga dilempar saja ke fungsi deleteFirst()
                deleteFirst(list);
            }
            else{ // akan dieksekusi jika nilai index bukan 0 ataupun 1
                while(i<index-1 && temp!=null){ //iterasi dengan pengecekkan i < index-1 dan temp tidak sama dengan null
                    temp = temp.next; //temp akan terus bergeser ke simpul sebelahnya sampai dengan temp.next sesuai dengan 
                                      //index yang diinputkan
                    i++; //i terus bertambah 1 selagi while dijalankan
                    if(temp.next==null){ //terdapat sebuah kondisi untuk mencegah user input index lebih dari jumlah data
                        System.out.println("Index yang anda masukkan melebihi data");
                        break;
                    }
                }
                if(temp.next!=null){ //jika temp.next tidak sama dengan null, kode dibawah akan dieksekusi
                    Node P = temp.next; //membuat sebuah variabel baru yang nilainya = simpul selanjutnya setelah temp
                    temp.next = P.next; // merubah nilai pointer temp sebelumnya menjadi nilai pointer si P 
                    P.next = null; //mengosongkan si P atau menghapus si P
                    System.out.println("Data "+P.info+" berhasil dihapus"); //sebagai konfirmasi bahwa data telah dihapus
                }
            }
        }
        return list;
    }
    
    boolean cari(int data){
        Node P;
        P = first;
        boolean cek = false;
        while(P!=null && cek==false ){
            if(data == P.info){
                cek = true;    
            }
            P=P.next;
        }
        return cek;
    }
    
    
    public void print(LinkedList list){
        Node P;
        P = list.first;
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
