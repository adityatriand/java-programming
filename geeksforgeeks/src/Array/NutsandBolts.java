/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.*;
/**
 *
 * @author Adit
 */
public class NutsandBolts {
    
    void matchPairs(char nuts[], char bolts[], int n) {
    // code here
    int idx;
    for(int i=0;i<n-1;i++){
        idx = i;
        for(int j=idx+1;j<n;j++){
            if((int)nuts[idx]>(int)nuts[j]){
                idx = j;
            }
        }
        char temp = nuts[idx];
        nuts[idx] = nuts[i];
        nuts[i] = temp;

        if(nuts[i]!=bolts[i]){
            for(int k=0;k<n;k++){
                if(bolts[k]==nuts[i]){
                    idx = k;
                }
            }
            char temp2 = bolts[idx];
            bolts[idx] = bolts[i];
            bolts[i] = temp2;
        }

    }
    }
}
