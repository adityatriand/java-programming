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
public class Student extends Person{

    public Student(String name) {
        super(name);
    }
    
    @Override
    public String getName() {
        System.out.println("Student Name : "+name);
        return name;
    }

    @Override
    public void talk() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Hey");
    }
    
    
}
