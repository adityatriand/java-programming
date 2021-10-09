/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sequence;

/**
 *
 * @author Adit
 */
public class BangunDatar 
{
    
    public static double PersegiPanjang(String tipe,double p, double l)
    {
        if(tipe.equals("luas")||tipe.equals("Luas"))
        {
            return p*l;
        }
        
        else if(tipe.equals("keliling")||tipe.equals("Keliling"))
        {
            return 2*(p+l);
        }
        
        return -1;
        
    }
    
    public static double Segitiga(String tipe, double a, double t)
    {
        if(tipe.equals("luas")||tipe.equals("Luas"))
        {
            return 0.5*a*t;
        }
        
        else if(tipe.equals("keliling")||tipe.equals("Keliling"))
        {
            return 0;
        }
        
        return -1;
        
    }
    
}
