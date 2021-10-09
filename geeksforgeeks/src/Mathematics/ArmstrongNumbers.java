/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mathematics;

/**
 *
 * @author Adit
 */
public class ArmstrongNumbers {
    public static String armstrongNumber(int n) {
        int n2 = n;
        int a = n/100;
        n%=100;
        int b = n/10;
        n%=10;
        int sum = (int)(Math.pow(a,3) + Math.pow(b,3) + Math.pow(n,3));
        if(sum == n2){
            return ("Yes");
        }
        else{
            return ("No");
        }
    }
    
}
