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
public class tree {
    static class treeNode { 
        private char value; 
        private treeNode left, right; 
   
        public treeNode(){
            value = '-';
            left = right = null;
            
        }
        
        public treeNode(char data){ 
            value = data; 
            left = right = null; 
        }
        
        char getValue(){
            return this.value;
        }
        
        treeNode getLeft(){
            return this.left;
        }
        
        treeNode getRigth(){
            return this.right;
        }
        
        void setValue(char data){
            this.value = data;
        }
        
        void setLeft(treeNode newLeft){
            this.left = newLeft;
        }
        
        void setRight(treeNode newRight){
            this.right = newRight;
        }
    }
}
