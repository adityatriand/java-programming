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
public abstract class Pegawai {
    private int salary;
    private String name;
    private String position;
    
    public Pegawai(String name,int salary, String position){
        this.salary = salary;
        this.name = name;
        this.position = position;
    }
    
    public int getSalary(){
        return this.salary;
    }
    
    public void setSalary(int salary){
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public int getTotalSalary(){
        return this.salary;
    }
    
    public void showSalary(){
        System.out.println("Name = "+this.name);
        System.out.println("Position = "+this.position);
        System.out.println("Your Salary = Rp."+getSalary());
    }
}
