/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubProgram;

/**
 *
 * @author Adit
 */
public class SubProgram {
    public static void main(String[] args) {
        int s = 12;
        int luas = luasKubus(s);
        System.out.println(luas);
    }
    static int luasPersegi(int sisi){
        return sisi*sisi;
    }
    static int luasKubus(int sisi){
        return 6*luasPersegi(sisi);
    }
}
