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
public class Main {
    public static void main(String[] args) {
        binarySearchTree a = new binarySearchTree();
        a.insert(30);
        a.insert(15);
        a.insert(7);
        a.insert(26);
        a.insert(19);
        a.insert(28);
        a.insert(37);
        a.insert(32);
        a.insert(45);
        a.insert(35);
        a.insert(42);
        System.out.println("Dicetak dalam bentuk tranversal Pre Order");
        System.out.println("=========================================");
        a.printPreOrder();
        System.out.println();
        a.delete(37);
        a.printPreOrder();
        System.out.println();
        a.delete(30);
        a.printPreOrder();
    }
}
