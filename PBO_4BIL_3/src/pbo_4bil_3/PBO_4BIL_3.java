/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_4bil_3;

/**
 *
 * @author KANDAJM
 */
public class PBO_4BIL_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person refPerson;
        
        Employee refEmployee = new Employee("kanda");
        Student refStudent = new Student("januar");
        
        refPerson = refEmployee;
        refPerson.getName();
        
        refPerson = refStudent;
        refPerson.getName();
        
        //Person P1 = new Person("miraswan");
    }
    
}
