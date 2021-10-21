/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pixel;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
/**
 *
 * @author Iqbal
 */
class Pixel {
    BufferedImage image;
    int width;
    int height;
    
    public Pixel(){
        try{
            File input = new File("kucing.jpg");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();
            int count =0;
            for(int i=0; i<height;i++){
                for(int j=0; j<width;j++){
                    count++;
                    Color c = new Color(image.getRGB(j,i));
                    System.out.println("No:"+count+"Red :"+c.getRed()+"Green :"+c.getGreen()+"Blue :"+c.getBlue());
                }
            }
        }catch(Exception e){}
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Pixel obj = new Pixel();
    }

}
