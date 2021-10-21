/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package grayscale;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
/**
 *
 * @author Iqbal
 */
public class GrayScale {
    BufferedImage image;
    int width;
    int height;
    public GrayScale(){
        try{
            File input = new File("lambangits.jpg");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();
            for(int i=0; i<height;i++){
                for(int j=0; j<width;j++){
                    Color c = new Color(image.getRGB(j,i));
                    int red = (int)(c.getRed()*0.299);
                    int green = (int)(c.getGreen()*0.587);
                    int blue = (int)(c.getBlue()*0.114);
                    Color newColor = new Color(red+green+blue,red+green+blue,red+green+blue);
                    image.setRGB(j,i,newColor.getRGB());
                }
            }
            File output = new File("lambangitsgrayscale.jpg");
            ImageIO.write(image,"jpg",output);
        }catch(IOException e){}
    }
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        GrayScale obj = new GrayScale();
    }

}
