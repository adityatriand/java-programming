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
public class Programmer extends Pegawai {
    
    public Programmer(String name,int salary){
        super(name,salary,"Programmer");
    }
    
    @Override
    public void showSalary(){
        super.showSalary();
        System.out.println("Total Salary = Rp."+super.getTotalSalary());
    }
}
