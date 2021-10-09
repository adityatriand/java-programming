/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizProsedur;

/**
 *
 * @author Adit
 */
public class Soal {
    public static void main(String[] args) {
        int n = 5, N=5, M=3;
        float X = faktor1(N)/faktor2(M); 
        Segitiga(n);
        System.out.println("2. nilai X = "+X);
        
    }
    
    static void Segitiga(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2==1){
                    System.out.print("*");
                }
                else if(j%2==1){
                    System.out.print("#");
                }
                else{
                    System.out.print("%");
                }
            }
            System.out.println(" ");
        }
    }
    
    static int faktor1(int N){
        if(N==1){
            return N;
        }
        return N*faktor1(N-1);
    }
    
    static int faktor2(int M){
        if(M==1){
            return M;
        }
        return M*faktor2(M-1);
    }
}
