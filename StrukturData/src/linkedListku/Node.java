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
public class Node {
    public int info; //datanya
    public Node next; //pointernya
    
    public Node(){
        info = 0;
        next = null;
    }
    
    public Node(int x){
        info = x;
        next = null;
    }
}
