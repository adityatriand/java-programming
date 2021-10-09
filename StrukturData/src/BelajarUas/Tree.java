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
public class Tree {
    static class TreeNode{
        private int value;
        private TreeNode left;
        private TreeNode right;
        
        TreeNode(){
            this.value = 0;
            this.left = null;
            this.right = null;
        }
        
        TreeNode(int data){
            this.value = data;
            this.left = null;
            this.right = null;
        }
        
        void setValue(int value){
            this.value = value;
        }
        
        void setLeft(TreeNode left){
            this.left = left;
        }
        
        void setRight(TreeNode right){
            this.right = right;
        }
        
        int getValue(){
            return this.value;
        }
        
        TreeNode getLeft(){
            return this.left;
        }
        
        TreeNode getRight(){
            return this.right;
        }
    }
    
    static class BinaryTree{
        TreeNode root;
        BinaryTree(){
            root = null;
        }
        
        public boolean isEmpty(){
            return this.root == null;
        }
        public boolean isOneElmt(){
            return (this.root.getLeft() == null &&
            this.root.getRight() == null);
        }
        
        public boolean isLeaf(TreeNode N){
            return (N.getLeft()==null && N.getRight()==null);
        }
        
        //Add
        public boolean addLeft(TreeNode parent, int value){
            if (parent.getLeft() == null){
                TreeNode child = new TreeNode (value);
                parent.setLeft(child);
                return true;
            }
            else {
                return false;
            }
        }
        
        public boolean addRight(TreeNode parent, int value){
            if (parent.getRight() == null){
                TreeNode child = new TreeNode (value);
                parent.setRight(child);
                return true;
            }
            else {
                return false;
            }
        }
        
        
        //Delete
        public TreeNode delRight(TreeNode N){
            TreeNode delNode = N.getRight();
            N.setRight(null);
            return delNode;
        }
        
        public TreeNode delLeft(TreeNode N){
            TreeNode delNode = N.getLeft();
            N.setLeft(null);
            return delNode;
        }
        
        //Left-Right-Node
        void postOrder(TreeNode node)  { 
            if (node == null) 
                return; 

            postOrder(node.left); 
            postOrder(node.right); 
            System.out.print(node.value + " "); 
        } 
        // Left-Node-Right 
        void inOrder(TreeNode node)  { 
            if (node == null) 
                return; 

            inOrder(node.left); 
            System.out.print(node.value + " "); 
            inOrder(node.right); 
        } 

        //Node-Left-Right 
        void preOrder(TreeNode node)  { 
            if (node == null) 
                return; 

            System.out.print(node.value + " "); 
            preOrder(node.left); 
            preOrder(node.right); 
        } 
    }
    
    static class main{
        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            TreeNode tr = new TreeNode(12);
            tree.addLeft(tr, 10);
            tree.addRight(tr,11);
            tree.delLeft(tr);
            tree.addLeft(tr, 9);
            tree.inOrder(tr);
        }
    }
}
