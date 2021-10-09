/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayObjek;

/**
 *
 * @author Adit
 */
public class Makanan {
    String nama;
    int banyak;
    
    public Makanan(String nama ,int banyak)
    {
        this.nama = nama;
        this.banyak = banyak;
    }
    
    public String format()
    {
        return nama + " = " + banyak ;
    }
}
