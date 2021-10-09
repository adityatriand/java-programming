/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restartfromjava;

/**
 *
 * @author Adit
 */
public class RestartFromJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Runtime r = Runtime.getRuntime();
        r.exec("shutdown -r");
    }
    
}
