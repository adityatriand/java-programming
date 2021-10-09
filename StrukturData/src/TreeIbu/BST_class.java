/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeIbu;

/**
 *
 * @author Adit
 */
public class BST_class {
    static class Node { 
        int value; 
        Node left, right; 
   
        public Node(int data){ 
            value = data; 
            left = right = null; 
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

            if (value < root.value)    
                root.left = delete_Recursive(root.left, value); 
            else if (value > root.value)  
                root.right = delete_Recursive(root.right, value); 
            else  { 
                if (root.left == null) 
                    return root.right; 
                else if (root.right == null) 
                    return root.left; 

                root.value = minValue(root.right); 

                root.right = delete_Recursive(root.right, root.value); 
            } 
            return root; 
        } 

        int minValue(Node root)  { 
            int minval = root.value; 
            while (root.left != null)  { 
                minval = root.left.value; 
                root = root.left; 
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
            if (value < root.value)     
                root.left = insert_Recursive(root.left, value); 
            else if (value > root.value)    
                root.right = insert_Recursive(root.right, value); 
            return root; 
        } 

        boolean search(int key)  { 
            root = search_Recursive(root, key); 
            if (root!= null)
                return true;
            else
                return false;
        } 

        Node search_Recursive(Node root, int cari)  { 
            if (root==null || root.value==cari) 
                return root; 
            if (root.value > cari) 
                return search_Recursive(root.left, cari); 
            return search_Recursive(root.right, cari); 
        } 

        //Left-Right-Node
        void postOrder(Node node)  { 
            if (node == null) 
                return; 

            postOrder(node.left); 
            postOrder(node.right); 
            System.out.print(node.value + " "); 
        } 
      // Left-Node-Right 
        void inOrder(Node node)  { 
            if (node == null) 
                return; 

            inOrder(node.left); 
            System.out.print(node.value + " "); 
            inOrder(node.right); 
        } 

        //Node-Left-Right 
        void preOrder(Node node)  { 
            if (node == null) 
                return; 

            System.out.print(node.value + " "); 
            preOrder(node.left); 
            preOrder(node.right); 
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
        bst.insert(40); 
        bst.insert(9); 
        bst.insert(8); 
        bst.insert(17); 
        bst.insert(80); 
        bst.insert(20); 
        
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
        
        boolean cari = bst.search (20);
        System.out.println("\nCari nilai 20 :" + cari );
        cari = bst.search (12);
        System.out.println("\nCari nilai 12 :" + cari );
    }
}
