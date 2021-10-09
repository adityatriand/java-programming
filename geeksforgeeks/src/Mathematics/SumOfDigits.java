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
public class SumOfDigits {
    static int sumOfDigits(int N) {
        // code here
        int count=0;
        while(N>0)
        {
            // extract the last digit
            int b=N%10;
            // add it to count
            count+=b;
            //remove the last digit
            N=N/10;
 
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(12));
    }
}
