/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package changecolor;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
/**
 *
 * @author Iqbal
 */
public class ChangeColor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedImage image = null;
        File file = null;
        try{
            file = new File("lambangits.jpg");
            image = ImageIO.read(file);
        }catch(IOException e){
            System.out.println(e);
        }
        int width = image.getWidth();
        int height = image.getHeight();
        for(int i=0; i<height;i++){
            for(int j=0; j<width;j++){
                int red = image.getRGB(j,i);
                int green = (red>>24)&0xff;
                int blue = (red)&0xff;
                red = (green<<24)|(0<<16)|(0<<8)|blue;
                image.setRGB(j,i,red);
            }
        }
        try{
            File output = new File("lambangitsgreen.jpg");
            ImageIO.write(image,"jpg",output);
        }catch(IOException e){
            System.out.println(e);
        }
    }

}
