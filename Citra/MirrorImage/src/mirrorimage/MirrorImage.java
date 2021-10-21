/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mirrorimage;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
/**
 *
 * @author Iqbal
 */
public class MirrorImage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedImage image1 = null;
        File file = null;
        try{
            file = new File("Picture Of Me 001.jpg");
            image1 = ImageIO.read(file);
        }catch(IOException e){
            System.out.println(e);
        }
        int width = image1.getWidth();
        int height = image1.getHeight();

        BufferedImage image2 = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
        long start = System.currentTimeMillis();
        for(int i=0; i<height;i++){
            for(int j=0,k = width-1; j<width;j++,k--){
                int p = image1.getRGB(j,i);
                image2.setRGB(k,i,p);
            }
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Time Complexity : "+time);
        try{
            File output = new File("Picture Of Me 001 Mirror.jpg");
            ImageIO.write(image2,"jpg",output);
        }catch(IOException e){
            System.out.println(e);
        }
    }

}
