/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kondisiperulangan;

import java.util.Random;

/**
 *
 * @author Adit
 */
public class kondisi {
    public static void main(String[] args) {
        Random ran = new Random();
        int mu, liv,number_player;
        mu = (int) (Math.random() * 10);
        liv = (int) (Math.random() * 10);
        System.out.println("MU VS LIV = : "+mu+" - "+liv);
        
        String [] player_mu = {"Cavani","Rashford","Martial","Maguire","Pogba"};
        String [] player_liv = {"Salah","Mane","Firmino","Robetson","Matip"};
        
        if(mu!=0){
            System.out.println("Pencetak Gol MU");
            for(int i=0;i<mu;i++){
                number_player = ran.nextInt(5);
                System.out.println((i+1)+"."+player_mu[number_player]);
            }
        }
        if(liv!=0){
            System.out.println("Pencetak Gol Liverpol");
            for(int i=0;i<liv;i++){
                number_player = ran.nextInt(5);
                System.out.println((i+1)+"."+player_liv[number_player]);
            }
        }
    }
}
