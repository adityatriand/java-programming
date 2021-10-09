/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan04;

/**
 *
 * @author Adit
 */
public class Main {
    public static void main(String[] args) {
        Programmer P1 = new Programmer("George Harry",8000000);
        Programmer P2 = new Programmer("Adin Chandra",8000000);
        Programmer P3 = new Programmer("Albertina", 8000000);
        Sales S1 = new Sales("Baikhaqi",3000000);
        Manager M1 = new Manager("Bernard", 8000000);
        Direktur D1 = new Direktur("Albert", 10000000);
        
        P1.showSalary();
        System.out.println("=============================");
        P2.showSalary();
        System.out.println("=============================");
        P3.showSalary();
        System.out.println("=============================");
        S1.showSalary();
        System.out.println("=============================");
        M1.showSalary();
        System.out.println("=============================");
        D1.showSalary();
        
    }
}
