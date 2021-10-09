/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BelajarUTS;

/**
 *
 * @author Adit
 */
public class NodeMHS {
    public String nama,NIM;
    public int nilai;
    public NodeMHS next;
    
    public NodeMHS(){
        nama = " ";
        NIM = "";
        nilai = 0;
        next = null;
    }
    
    public NodeMHS(String a, String b, int c){
        nama = a;
        NIM = b;
        nilai = c;
        next = null;
    }
}
