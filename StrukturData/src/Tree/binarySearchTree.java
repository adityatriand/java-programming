/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author Adit
 */
public class binarySearchTree {
    private Node root;

    public binarySearchTree(){
        root = null;
    }
    
    public Node getRoot() {
        return this.root;
    }

    public boolean isEmpty() {
        return (this.root == null);
    }

    public Node find(Node root, int val) {
        if (root == null || root.data == val){
            return root;
        }
        
        else if (root.data < val){
            return find(root.right, val);
        }
        
        else{
            return find(root.left, val);
        }
    }

    public void insert(int val){
        root = insertNode(this.root, val);
    }

    private Node insertNode(Node root, int data) {
        if (root == null){
            root = new Node(data);
            return root;
        }
        
        if (data < root.data){
            root.left = insertNode(root.left, data);
        }
        
        else if (data > root.data){
            root.right = insertNode(root.right, data);
        }
        
        return root;
    }

    public void delete(int key) {
        deleteNode(this.root, key);
    }

    private Node deleteNode(Node root, int key) {
        if (root == null){
            return root;
        }

        if (key < root.data){
            root.left = deleteNode(root.left, key);
        }
        
        else if (key > root.data){
            root.right = deleteNode(root.right, key);
        }
        
        else {
            //berguna untuk mengecek apakah akar bagian kiri kosong.
            //jika kosong maka akan dialihkan ke akar bagian kanan
            if (root.left == null){
                return root.right;
            }
            
            //berguna untuk mengecek apakah akar bagian kanan kosong.
            //jika kosong maka akan dialihkan ke akar bagian kiri
            else if (root.right == null){
                return root.left;
            }
            
//            //jika ingin mengambil pengganti nilai dibagian kiri root
//            root.data = minValueLeft(root.right);
//            root.right = deleteNode(root.right, root.data);
            
            //jika ingin mengambil pengganti nilai dibagian kanan root
            root.data = minValueRight(root.left);
            root.left = deleteNode(root.left, root.data);
        }
        return root;
    }

    private int minValueLeft(Node root) {
        if (root.left != null) {
            return minValueLeft(root.left);
        }
        return root.data;
    }
    
    private int minValueRight(Node root) {
        if (root.right != null) {
            return minValueRight(root.right);
        }
        return root.data;
    }

    public void printPreOrder() {
        PreOrder(root);
    }

    private void PreOrder(Node root) {
        if (root != null){
            System.out.print(root.data + " ");
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }
}
