/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 *
 * @author Adit
 */
public class Planet {
    private String name;
    private double mass;
    
    public Planet(String name, double mass) 
    {
        this.name = name;
        this.mass = mass;
    }
    
    @Override
    public String toString() {
        return "Planet " + name + ", mass: " + mass;
    }
}
