/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

/**
 *
 * @author Adit
 */
public class Main {
    public static void main(String[] args) {
        Point P1= new Point(1, 2);
Point P2= new Point(3, 4);
Line L1 = new Line();
L1.setP1(P1);
L1.setP2(P2);

System.out.println("Panjang L1 : " + L1.getLength());
Line L2 = new Line(5, 6, 7, 8);
System.out.println("Panjang L2 : " + L2.getLength());
System.out.println("is greater ? " + L1.isGreater(L1, L2));
System.out.println("is less ? " + L1.isLess(L1, L2));
System.out.println("is equal ? " + L1.isEqual(L1, L2));
    }
}
