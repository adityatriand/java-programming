/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author KANDAJM
 */
public class StudentRecord {
    private String name;
    private String idStudent;
    private int age;
    
    public static StudentRecord create()
    {
        return new StudentRecord();
    }
    
    public StudentRecord() {
        this("0", "", 17);
    }

    public StudentRecord(String name) {
        this.name = name;
    }

    public StudentRecord(String idStudent, String name) {
        //this.name = name;
        this(name);
        this.idStudent = idStudent;
    }

    public StudentRecord(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public StudentRecord(int age,String idStudent) {
        this.idStudent = idStudent;
        this.age = age;
    }

    public StudentRecord(String idStudent, String name, int age) {
        this.name = name;
        this.idStudent = idStudent;
        this.age = age;
    }
   
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public StudentRecord _setAge(int age) {
        this.age = age;
        return this;
    }
    
    public String getName() {
        return name;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    public StudentRecord _setName(String name) {
        this.name = name;
        return this;
    }

    public String getIdStudent() {
        return idStudent;
    }
    
    
    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }
    
    
    public StudentRecord _setIdStudent(String idStudent) {
        this.idStudent = idStudent;
        return this;
    }
    
    
    public void print()
    {
        System.out.println("ID : "+idStudent);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        //System.out.println("");
    }
    
    public void print(String address)
    {   
        /*
        System.out.println("ID : "+idStudent);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        */
        System.out.println("Address : "+address);
        System.out.println("");
    }
    
    public void print(String address,int height)
    {
        System.out.println("ID : "+idStudent);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Address : "+address);
        System.out.println("Height : "+height);
        System.out.println("");
    }
    
    public void print(int weight,int height)
    {
        System.out.println("ID : "+idStudent);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Weight : "+weight);
        System.out.println("Height : "+height);
        System.out.println("");
    }
    
    public void print(int weight,String address)
    {
        System.out.println("ID : "+idStudent);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Weight : "+weight);
        System.out.println("Address : "+address);
        System.out.println("");
    }
}
