/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WholePart;

/**
 *
 * @author Adit
 */
public class MainKomputer {
    public static void main(String[] args) {
        Komputer Komp1 = new Komputer();
        Komp1.infoKomputer();
        
        Komp1.setCPU("Intel i5", 4, 500);
        Komp1.setKeyboard("Votre");
        Komp1.setMonitor("LED","HP");
        Komp1.setMouse("Logitech",800);
        
        System.out.println();
        Komp1.infoKomputer();
        
    }
}
