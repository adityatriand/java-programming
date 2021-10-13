/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package processingimage;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Adit
 */
public class ProcessingImage {

    public static void CitraBiner(int T){
        BufferedImage image;
        int width;
        int height;
        try{
            File input = new File("lena.jpg");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();
            for(int i=0; i<height;i++){
                for(int j=0; j<width;j++){
                    Color c = new Color(image.getRGB(j,i));
                    int red = (int)(c.getRed());
                    int green = (int)(c.getGreen());
                    int blue = (int)(c.getBlue());
                    int gray = (red+green+blue)/3;
                    if(gray<T) gray = 0;
                    else gray = 255;
                    Color newColor = new Color(gray,gray,gray);
                    image.setRGB(j,i,newColor.getRGB());
                }
            }
            File output = new File("lenabiner.jpg");
            ImageIO.write(image,"jpg",output);
        }catch(IOException e){}
    }
    
    public static void CitraNegative(){
        BufferedImage image;
        int width;
        int height;
        try{
            File input = new File("lena.jpg");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();
            for(int i=0; i<height;i++){
                for(int j=0; j<width;j++){
                    Color c = new Color(image.getRGB(j,i));
                    int red = 255 - (int)(c.getRed());
                    int green = 255 - (int)(c.getGreen());
                    int blue = 255 - (int)(c.getBlue());
                    Color newColor = new Color(red,green,blue);
                    image.setRGB(j,i,newColor.getRGB());
                }
            }
            File output = new File("lenanegative.jpg");
            ImageIO.write(image,"jpg",output);
        }catch(IOException e){}
    }
    
    public static void CitraBright(int k){
        BufferedImage image;
        int width;
        int height;
        try{
            File input = new File("lena.jpg");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();
            for(int i=0; i<height;i++){
                for(int j=0; j<width;j++){
                    Color c = new Color(image.getRGB(j,i));
                    int red = (int)(c.getRed()) + k;
                    if(red < 0) red = 0;
                    else if(red > 255) red = 255;
                    
                    int green = (int)(c.getGreen()) + k;
                    if(green < 0) green = 0;
                    else if(green > 255) green = 255;
                    
                    int blue = (int)(c.getBlue()) + k;
                    if(blue < 0) blue = 0;
                    else if(blue > 255) blue = 255;
                    
                    Color newColor = new Color(red,green,blue);
                    image.setRGB(j,i,newColor.getRGB());
                }
            }
            File output = new File("lenabright.jpg");
            ImageIO.write(image,"jpg",output);
        }catch(IOException e){}
    }
    
    public static void CitraGrayscale(){
        BufferedImage image;
        int width;
        int height;
        try{
            File input = new File("kucing.jpg");
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
            File output = new File("kucinggrayscale.jpg");
            ImageIO.write(image,"jpg",output);
        }catch(IOException e){}
    }
    
    public static void CitraHorizontalFlip(){
        BufferedImage image;
        int width;
        int height;
        try{
            File input = new File("lena.jpg");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();
            BufferedImage image2 = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
            for(int i=0; i<height;i++){
                int k = width-1;
                for(int j=0;j<width;j++){ 
                    int p = image.getRGB(j,i);
                    image2.setRGB(k,i,p);
                    k--;
                }
            }
            File output = new File("lenahorizontalflip.jpg");
            ImageIO.write(image2,"jpg",output);
        }catch(IOException e){}
    }
    
    public static void CitraVerticalFlip(){
        BufferedImage image;
        int width;
        int height;
        try{
            File input = new File("lena.jpg");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();
            BufferedImage image2 = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
            int k = width - 1;
            for(int i=0; i<height;i++){
                for(int j=0; j<width;j++){
                    int p = image.getRGB(j,k);
                    image2.setRGB(j,i,p);
                }
                k--;
            }
            File output = new File("lenavertikalflip.jpg");
            ImageIO.write(image2,"jpg",output);
        }catch(IOException e){}
    }
    
    public static void CitraRotasi90CCW(){
        BufferedImage image;
        int width;
        int height;
        try{
            File input = new File("lena.jpg");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();
            BufferedImage image2 = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
            for(int i=0; i<height;i++){
                int k = width -1;
                for(int j=0; j<width;j++){
                    int p = image.getRGB(j,i);
                    image2.setRGB(i, k, p);
                    k--;
                }
            }
            File output = new File("lenarotasiccw.jpg");
            ImageIO.write(image2,"jpg",output);
        }catch(IOException e){}
    }
    
    public static void CitraRotasi90CW(){
        BufferedImage image;
        int width;
        int height;
        try{
            File input = new File("lena.jpg");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();
            BufferedImage image2 = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
            int k = width -1;
            for(int i=0; i<height;i++){
                for(int j=0; j<width;j++){
                    int p = image.getRGB(j,i);
                    image2.setRGB(k, j, p);
                }
                k--;
            }
            File output = new File("lenarotasicw.jpg");
            ImageIO.write(image2,"jpg",output);
        }catch(IOException e){}
    }
    
     
    public static void main(String[] args) throws Exception {
        CitraVerticalFlip();
    }
    
}
