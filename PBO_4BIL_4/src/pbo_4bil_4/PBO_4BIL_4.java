/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_4bil_4;

/**
 *
 * @author KANDAJM
 */
public class PBO_4BIL_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Line l1 = new Line(0,0,3,4);
        //Line l2 = new Line(1,1,5,4);
        
        //System.out.println(l1.isEqual(l2));
        
        SegitigaSikuSiku s1 = new SegitigaSikuSiku(3, 4);
        SegitigaSikuSiku s2 = new SegitigaSikuSiku(3, 4);
        SegitigaSikuSiku s3 = new SegitigaSikuSiku(6, 8);
        
        
        System.out.println(s1.isCongruent(s2));
    }
    
}
