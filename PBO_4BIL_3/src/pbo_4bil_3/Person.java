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
public abstract class Person {  // class abstrak
    public String name;

    public Person(String name) {
        this.name = name;
    }
    
    
    public abstract String getName(); // method abstrak
    
    public abstract void talk();
    
    /*
    public String getName()
    {
        System.out.println("Person Name : "+name);
        return name;
    }
    */
}
