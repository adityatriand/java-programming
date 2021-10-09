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
public class parityOfUnsignedInteger {
    public static String computeParity(int N) {
        // code here
        int N2 = N;
        String binary [];
        int n = 0;
        while(N>=1){
            N = N/2;
            n++;
        }
        binary = new String [n];
        for(int i=0;i<binary.length;i++){
            binary[i]= Integer.toString(N2%2);
            N2 = N2/2;
        }
        String oddEven = "";
        int n2 = 0;
        for(int i=0;i<binary.length;i++){
            if(binary[i].equals("1")){
                n2++;
            }
        }
        if(n2%2==0){
            return "even";
        }
        else{
            return "odd";
        }
    }
}
