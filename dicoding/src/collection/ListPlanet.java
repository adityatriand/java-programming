/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adit
 */
public class ListPlanet {
    
    public static void main(String [] args)
    {
        List<String> planet = new ArrayList<>();
        planet.add("Namek");
        planet.add("Venus");
        planet.add("Mercury");
        planet.add("Earth");
        
        System.out.println("Planet Awal : ");
        panggil(planet);
        
        planet.remove(3);
        System.out.println("Planet Akhir : ");
        panggil(planet);
    }
    
    private static void panggil(List a)
    {
        for(int i=0;i<a.size();i++)
        {
            System.out.println("Planet ke-"+(i+1)+" = "+a.get(i));
        }
    }
}
