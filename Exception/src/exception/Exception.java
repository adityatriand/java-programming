/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.*;

/**
 *
 * @author Adit
 */
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        try {
            int b = input.nextInt();
        }
//        catch(ArithmeticException ex){
//            System.out.println("Pembagi tidak boleh 0");
//        }
        catch(InputMismatchException ex){
            System.out.println("Bilangan tidak boleh desimal");
        }
    }
    
}
