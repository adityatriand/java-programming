/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Adit
 */
public class SetPlanet {
    
    public static void main(String [] args)
    {
        Set<String> planets = new HashSet<>();
        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("earth");
        planets.add("earth");
        planets.add("mars");
        
        System.out.println("Set Planets Awal : (size : "+ planets.size()+")" );
        for(String planet : planets)
        {
            System.out.println("\t "+planet);
        }
        
        planets.remove("venus");
        System.out.println("Set Planet Akhir : (size : "+planets.size()+")");
        for(Iterator iterator = planets.iterator();iterator.hasNext();)
        {
            System.out.println("\t "+iterator.next());
        }
    }
    
}
