/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
/**
 *
 * @author Adit
 */
public class Main {
    public static void main(String[] args) {
        
        String a = Mathematics.parityOfUnsignedInteger.computeParity(13);
        System.out.println(a);
        
        String b = Mathematics.ArmstrongNumbers.armstrongNumber(153);
        System.out.println(b);
        
        int c = Mathematics.SeriesAP.nthTermOfAP(10, 7, 3);
        System.out.println(c);
        
    }
    
}
