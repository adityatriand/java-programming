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
public class Sales extends Pegawai {
    private int bonus = 1000000;
    
    public Sales(String name,int salary){
        super(name,salary,"Sales");
    }
    
    public int getBonus(){
        return this.bonus;
    }
    
    public void setBonus(int bonus){
        this.bonus = bonus;
    }
        
    @Override
    public int getTotalSalary(){
        return super.getSalary()+ this.bonus;
    } 
            
    @Override
    public void showSalary(){
        super.showSalary();
        System.out.println("Bonus = Rp."+getBonus());
        System.out.println("Total Salary = Rp."+getTotalSalary());
    }

}
