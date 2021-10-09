/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asalpro1;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class perkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Bilangan pertama = ");
        a = input.nextInt();
        System.out.print("Bilangan Kedua = ");
        b = input.nextInt();
        int hasil = 0;
        if(a>0){
            for (int i = 1; i <= a; i++) {
                hasil += b;
            }
        }
        else{
            for (int i = a; i < 0; i++) {
                hasil -= b;
            }
        }
//        if(a>0&&b>0){
//            for(int i=a;i>0;i--){
//                hasil += b;
//            }
//        }
//        else if(a<0&&b>0 || a>0&&b<0 ){
//            if(a>b){
//                for(int i=b;i<0;i++){
//                    hasil += a;
//                }
//                hasil= -(hasil);
//            }
//            else{
//                for(int i=a;i<0;i++){
//                    hasil += b;
//                }
//                hasil= -(hasil);
//            }   
//        }
//        else{
//            for(int i=a;i<0;i++){
//                hasil += b;
//            }
//            hasil = -(hasil);
//        }
//        
        System.out.println("Hasilnya = "+hasil);
    }
}
