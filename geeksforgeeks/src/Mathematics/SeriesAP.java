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
public class SeriesAP {
    public static int nthTermOfAP(int A1, int A2, int N) {
        // code here
        int [] set = new int [N+1];
        int selisih = A2 - A1;
        for(int i=0;i<set.length;i++){
            if(i==0){
                set[i]= A1;
            }
            else{
                set[i]=set[i-1]+selisih;
            }
        }
        return set[N-1];
    }
}
