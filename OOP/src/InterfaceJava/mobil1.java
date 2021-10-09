/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceJava;

/**
 *
 * @author Adit
 */
public class mobil1 implements Mesin {
    private String merk;
    private String noMesin;
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public String getMerk(){
        return this.merk;
    }
    
    public void setNoMesin(String noMesin){
        this.noMesin = noMesin;
    }
    
    public String getNoMesin(){
        return this.noMesin;
    }
}

//class main

class main{
    public static void main(String[] args) {
        mobil1 m1 = new mobil1();
        m1.setMerk("Ford");
        m1.setNoMesin("010101");
        System.out.println(m1.getMerk());
        System.out.println(m1.getNoMesin());
    }
}
