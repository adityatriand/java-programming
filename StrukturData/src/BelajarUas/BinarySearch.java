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
public class BinarySearch {
    static class Node { 
        private int value; 
        private Node left, right; 
        
        Node(){
            this.value = 0;
            this.left = null;
            this.right = null;
        }
        
        Node(int data){
            this.value = data;
            this.left = null;
            this.right = null;
        }
        
        void setValue(int value){
            this.value = value;
        }
        
        void setLeft(Node left){
            this.left = left;
        }
        
        void setRight(Node right){
            this.right = right;
        }
        
        int getValue(){
            return this.value;
        }
        
        Node getLeft(){
            return this.left;
        }
        
        Node getRight(){
            return this.right;
        }
    }
    
    static class BST { 
    
        Node root; 

        BST(){ 
            root = null; 
        } 
        void deleteKey(int value) { 
            root = delete_Recursive(root, value); 
        } 

        Node delete_Recursive(Node root, int value)  { 
            if (root == null)  return root; 

            if (value < root.getValue())
                root.setLeft(delete_Recursive(root.getLeft(), value));
            else if (value > root.getValue())  
                root.setRight(delete_Recursive(root.getRight(), value)); 
            else  { 
                if (root.getLeft() == null) 
                    return root.getRight(); 
                else if (root.getRight() == null) 
                    return root.getLeft(); 
                
                root.setValue(minValue(root.getRight()));
                
                root.setRight(delete_Recursive(root.getRight(),root.getValue()));
            } 
            return root; 
        } 

        int minValue(Node root)  { 
            int minval = root.getValue(); 
            while (root.getLeft() != null)  { 
                minval = root.getLeft().getValue(); 
                root = root.getLeft(); 
            } 
            return minval; 
        } 

        void insert(int key)  { 
            root = insert_Recursive(root, key); 
        } 

        Node insert_Recursive(Node root, int value) { 
            if (root == null) { 
                root = new Node(value); 
                return root; 
            } 
            if (value < root.getValue())
                root.setLeft(insert_Recursive(root.getLeft(), value));
            else if (value > root.getValue())    
                root.setRight(insert_Recursive(root.getRight(), value)); 
            return root; 
        } 

        boolean search(int key)  { 
            root = search_Recursive(root, key); 
            return root!= null;
        } 

        Node search_Recursive(Node root, int cari)  { 
            if (root==null || root.getValue()==cari) 
                return root; 
            if (root.getValue() > cari) 
                return search_Recursive(root.getLeft(), cari); 
            return search_Recursive(root.getRight(), cari); 
        } 

        //Left-Right-Node
        void postOrder(Node node)  { 
            if (node == null) 
                return; 

            postOrder(node.getLeft()); 
            postOrder(node.getRight()); 
            System.out.print(node.getValue() + " "); 
        } 
      // Left-Node-Right 
        void inOrder(Node node)  { 
            if (node == null) 
                return; 

            inOrder(node.getLeft()); 
            System.out.print(node.getValue() + " "); 
            inOrder(node.getRight()); 
        } 

        //Node-Left-Right 
        void preOrder(Node node)  { 
            if (node == null) 
                return; 

            System.out.print(node.getValue() + " "); 
            preOrder(node.getLeft()); 
            preOrder(node.getRight()); 
        } 

        void postOrder_traversal()  
        {    
            postOrder(root);  
        } 

        void inOrder_traversal() 
        { 
            inOrder(root);   
        } 
        void preOrder_traversal()
        {
            preOrder(root);  
        } 
    }
    
    public static void main(String[] args) {
        BST bst = new BST(); 
        bst.insert(5); 
        bst.insert(9); 
        bst.insert(8); 
        bst.insert(3); 
        bst.insert(2); 
        bst.insert(1); 
        
        System.out.println("\nprint PreOrder :"); 
        bst.preOrder_traversal(); 
        
        System.out.println("\nprint InOrder :"); 
        bst.inOrder_traversal(); 
        
        System.out.println("\nprint PostOrder :"); 
        bst.postOrder_traversal(); 
        
        System.out.println("\nPrint delete 17:"); 
        bst.deleteKey(17); 
        bst.inOrder_traversal(); 
        
        System.out.println("\nPrint delete 80:"); 
        bst.deleteKey(80); 
        bst.inOrder_traversal(); 
                 
        System.out.println("\nPrint delete 40:"); 
        bst.deleteKey(40); 
        bst.inOrder_traversal(); 
        
    }
}
