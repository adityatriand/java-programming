/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_4bil_1;

import student.StudentRecord;
import student.Transkrip;


/**
 *
 * @author KANDAJM
 */
public class PBO_4BIL_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentRecord S1 = new StudentRecord("001","Kanda");
        StudentRecord S2 = new StudentRecord("002", "Willy", 11);
        StudentRecord S3 = new StudentRecord("003","Zakia",14);
        
        
        
        //StudentRecord S4 = StudentRecord.create()._setAge(17)._setName("Abdul");
        
        //S1.setIdStudent("001");
        //S1.setName("Kanda");
        
        //S2.setIdStudent("002");
        //S2.setName("Willy");
        //S2.setAge(11);
        
        //S3.setIdStudent("003");
        //S3.setName("Zakia");
        //S3.setAge(14);
        
        S1.print(60, 167);
        S2.print("Kenten");
        S3.print();
        //S4.print();
        
        /*
        System.out.println("ID : "+S1.getIdStudent());
        System.out.println("Name : "+S1.getName());
        System.out.println("Age : "+S1.getAge());
        
        System.out.println("ID : "+S2.getIdStudent());
        System.out.println("Name : "+S2.getName());
        System.out.println("Age : "+S2.getAge());
        
        System.out.println("ID : "+S3.getIdStudent());
        System.out.println("Name : "+S3.getName());
        System.out.println("Age : "+S3.getAge());
        */
    }
    
}

