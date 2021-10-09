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
public class Manager extends Pegawai{
    private int tunjangan = 2000000;
    
    public Manager(String name,int salary){
        super(name,salary,"Manager");
    }
    
    public int getTunjangan(){
        return this.tunjangan;
    }
    
    public void setTunjangan(int tunjangan){
        this.tunjangan = tunjangan;
    }
        
    @Override
    public int getTotalSalary(){
        return super.getSalary()+ this.tunjangan;
    } 
            
    @Override
    public void showSalary(){
        super.showSalary();
        System.out.println("Tunjangan = Rp."+getTunjangan());
        System.out.println("Total Salary = Rp."+getTotalSalary());
    }
}
