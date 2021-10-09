/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RSoalTujuhbelas;

import java.util.Scanner;

/**
 *
 * @author Adit
 */
public class TujuhBelas {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        int angka;
        System.out.print("Masukkan angka digital = ");
        angka = input.nextInt();
        Lampu(angka);
    }
    
    static void Lampu(int a){
        if (a==0){
            System.out.println("1=ON,2=ON,3=ON,4=ON,5=ON,6=ON,7=ON");
        }
        else if (a==1){
            System.out.println("1=OFF,2=ON,3=ON,4=OFF,5=OFF,6=OFF,7=OFF");
        }
        else if (a==2){
            System.out.println("1=ON,2=ON,3=ON,4=ON,5=ON,6=OFF,7=ON");
        }
        else if (a==3){
            System.out.println("1=ON,2=ON,3=ON,4=ON,5=OFF,6=OFF,7=ON");
        }
        else if (a==4){
            System.out.println("1=ON,2=ON,3=ON,4=OFF,5=OFF,6=ON,7=OFF");
        }
        else if (a==5){
            System.out.println("1=ON,2=ON,3=ON,4=ON,5=OFF,6=ON,7=ON");
        }
        else if (a==6){
            System.out.println("1=ON,2=OFF,3=ON,4=ON,5=ON,6=ON,7=ON");
        }
        else{
            System.out.println("1=ON,2=ON,3=ON,4=OFF,5=OFF,6=OFF,7=OFF");
        }
    }
    
}
