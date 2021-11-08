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
    
    public static void CitraNot(){
        BufferedImage image;
        int width;
        int height;
        try{
            File input = new File("gajah.jpg");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();
            BufferedImage image2 = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
            for(int i=0; i<height;i++){
                for(int j=0; j<width;j++){
                    Color c = new Color(image.getRGB(j,i));
                    int red = (int)(c.getRed());
                    int green = (int)(c.getGreen());
                    int blue = (int)(c.getBlue());
                    int BW = (red+green+blue)/3;
                    if(BW<255) BW = 255;
                    else BW = 0;
                    Color newColor = new Color(BW,BW,BW);
                    image2.setRGB(j,i,newColor.getRGB());
                }
            }
            File output = new File("gajahnot.jpg");
            ImageIO.write(image2,"jpg",output);
        }catch(IOException e){
            System.out.println("Error = "+e);
        }         
    }
    
    public static void CitraAnd(){
        BufferedImage image1, image2;
        int width1, width2;
        int height1, height2;
        try{
            File input1 = new File("gambar1.jpg");
            File input2 = new File("gambar2.jpg");
            image1 = ImageIO.read(input1);
            image2 = ImageIO.read(input2);
            width1 = image1.getWidth();
            height1 = image1.getHeight();
            width2 = image2.getWidth();
            height2 = image2.getHeight();
            if(width1 == width2 && height1 == height2){
                BufferedImage image3 = new BufferedImage(width1, height1,BufferedImage.TYPE_INT_RGB);
                for(int i=0; i<height1;i++){
                    for(int j=0; j<width1;j++){
                        Color newColor;
                        Color c = new Color(image1.getRGB(j,i));
                        int red = (int)(c.getRed());
                        int green = (int)(c.getGreen());
                        int blue = (int)(c.getBlue());
                        int RGB = red+green+blue;
                        Color c2 = new Color(image2.getRGB(j,i));
                        int red2 = (int)(c2.getRed());
                        int green2 = (int)(c2.getGreen());
                        int blue2 = (int)(c2.getBlue());
                        int RGB2 = red2+green2+blue2;
                        if(RGB == 0 && RGB2 == 0)newColor = new Color(0,0,0);
                        else newColor = new Color(255,255,255);
                        image3.setRGB(j, i, newColor.getRGB());
                    }
                }
                File output = new File("gambarand.jpg");
                ImageIO.write(image3,"jpg",output);
            }else{
                System.out.println("Maaf tidak bisa diproses karena ukuran gambar berbeda");
            }
        }catch(IOException e){
            System.out.println("Error = "+e);
        }   
    }
    
    public static void CitraOR(){
        BufferedImage image1, image2;
        int width1, width2;
        int height1, height2;
        try{
            File input1 = new File("gambar1.jpg");
            File input2 = new File("gambar2.jpg");
            image1 = ImageIO.read(input1);
            image2 = ImageIO.read(input2);
            width1 = image1.getWidth();
            height1 = image1.getHeight();
            width2 = image2.getWidth();
            height2 = image2.getHeight();
            if(width1 == width2 && height1 == height2){
                BufferedImage image3 = new BufferedImage(width1, height1,BufferedImage.TYPE_INT_RGB);
                for(int i=0; i<height1;i++){
                    for(int j=0; j<width1;j++){
                        Color newColor;
                        Color c = new Color(image1.getRGB(j,i));
                        int red = (int)(c.getRed());
                        int green = (int)(c.getGreen());
                        int blue = (int)(c.getBlue());
                        int RGB = red+green+blue;
                        Color c2 = new Color(image2.getRGB(j,i));
                        int red2 = (int)(c2.getRed());
                        int green2 = (int)(c2.getGreen());
                        int blue2 = (int)(c2.getBlue());
                        int RGB2 = red2+green2+blue2;
                        if(RGB == 0 || RGB2 == 0)newColor = new Color(0,0,0);
                        else newColor = new Color(255,255,255);
                        image3.setRGB(j, i, newColor.getRGB());
                    }
                }
                File output = new File("gambaror.jpg");
                ImageIO.write(image3,"jpg",output);
            }else{
                System.out.println("Maaf tidak bisa diproses karena ukuran gambar berbeda");
            }
        }catch(IOException e){
            System.out.println("Error = "+e);
        }   
    }
    
    public static void CitraXOR(){
        BufferedImage image1, image2;
        int width1, width2;
        int height1, height2;
        try{
            File input1 = new File("gambar1.jpg");
            File input2 = new File("gambar2.jpg");
            image1 = ImageIO.read(input1);
            image2 = ImageIO.read(input2);
            width1 = image1.getWidth();
            height1 = image1.getHeight();
            width2 = image2.getWidth();
            height2 = image2.getHeight();
            if(width1 == width2 && height1 == height2){
                BufferedImage image3 = new BufferedImage(width1, height1,BufferedImage.TYPE_INT_RGB);
                for(int i=0; i<height1;i++){
                    for(int j=0; j<width1;j++){
                        Color newColor;
                        Color c = new Color(image1.getRGB(j,i));
                        int red = (int)(c.getRed());
                        int green = (int)(c.getGreen());
                        int blue = (int)(c.getBlue());
                        int RGB = red+green+blue;
                        Color c2 = new Color(image2.getRGB(j,i));
                        int red2 = (int)(c2.getRed());
                        int green2 = (int)(c2.getGreen());
                        int blue2 = (int)(c2.getBlue());
                        int RGB2 = red2+green2+blue2;
                        if(RGB == 0 ^ RGB2 == 0)newColor = new Color(0,0,0);
                        else newColor = new Color(255,255,255);
                        image3.setRGB(j, i, newColor.getRGB());
                    }
                }
                File output = new File("gambarxor.jpg");
                ImageIO.write(image3,"jpg",output);
            }else{
                System.out.println("Maaf tidak bisa diproses karena ukuran gambar berbeda");
            }
        }catch(IOException e){
            System.out.println("Error = "+e);
        }   
    }
    
    public static void CitraTambah(){
        BufferedImage image1, image2;
        int width1, width2;
        int height1, height2;
        try{
            File input1 = new File("gambar3.jpg");
            File input2 = new File("gambar4.jpg");
            image1 = ImageIO.read(input1);
            image2 = ImageIO.read(input2);
            width1 = image1.getWidth();
            height1 = image1.getHeight();
            width2 = image2.getWidth();
            height2 = image2.getHeight();
            if(width1 == width2 && height1 == height2){
                BufferedImage image3 = new BufferedImage(width1, height1,BufferedImage.TYPE_INT_RGB);
                for(int i=0; i<height1;i++){
                    for(int j=0; j<width1;j++){
                        Color c = new Color(image1.getRGB(j,i));
                        int red = (int)(c.getRed());
                        int green = (int)(c.getGreen());
                        int blue = (int)(c.getBlue());
                        int RGB = (red+green+blue)/3;
                        Color c2 = new Color(image2.getRGB(j,i));
                        int red2 = (int)(c2.getRed());
                        int green2 = (int)(c2.getGreen());
                        int blue2 = (int)(c2.getBlue());
                        int RGB2 = (red2+green2+blue2)/3;
                        int temp = RGB + RGB2;
                        if(temp > 255)image3.setRGB(j, i, new Color(255,255,255).getRGB());
                        else image3.setRGB(j, i,new Color(0,0,0).getRGB());
                    }
                }
                File output = new File("gambartambah.jpg");
                ImageIO.write(image3,"jpg",output);
            }else{
                System.out.println("Maaf tidak bisa diproses karena ukuran gambar berbeda");
            }
        }catch(IOException e){
            System.out.println("Error = "+e);
        } 
    }
    
    public static void CitraKurang(){
        BufferedImage image1, image2;
        int width1, width2;
        int height1, height2;
        try{
            File input1 = new File("gambar5.jpg");
            File input2 = new File("gambar6.jpg");
            image1 = ImageIO.read(input1);
            image2 = ImageIO.read(input2);
            width1 = image1.getWidth();
            height1 = image1.getHeight();
            width2 = image2.getWidth();
            height2 = image2.getHeight();
            if(width1 == width2 && height1 == height2){
                BufferedImage image3 = new BufferedImage(width1, height1,BufferedImage.TYPE_INT_RGB);
                for(int i=0; i<height1;i++){
                    for(int j=0; j<width1;j++){
                        Color c = new Color(image1.getRGB(j,i));
                        int red = (int)(c.getRed());
                        int green = (int)(c.getGreen());
                        int blue = (int)(c.getBlue());
                        int RGB = (red+green+blue)/3;
                        Color c2 = new Color(image2.getRGB(j,i));
                        int red2 = (int)(c2.getRed());
                        int green2 = (int)(c2.getGreen());
                        int blue2 = (int)(c2.getBlue());
                        int RGB2 = (red2+green2+blue2)/3;
                        int temp = RGB - RGB2;
                        if(temp != 0)image3.setRGB(j, i, new Color(255,255,255).getRGB());
                        else image3.setRGB(j, i,new Color(0,0,0).getRGB());
                    }
                }
                File output = new File("gambarkurang.jpg");
                ImageIO.write(image3,"jpg",output);
            }else{
                System.out.println("Maaf tidak bisa diproses karena ukuran gambar berbeda");
            }
        }catch(IOException e){
            System.out.println("Error = "+e);
        } 
    }
    
    public static void CitraKali(){
        BufferedImage image1, image2;
        int width1, width2;
        int height1, height2;
        try{
            File input1 = new File("kucing.jpg");
            File input2 = new File("filter.jpg");
            image1 = ImageIO.read(input1);
            image2 = ImageIO.read(input2);
            width1 = image1.getWidth();
            height1 = image1.getHeight();
            width2 = image2.getWidth();
            height2 = image2.getHeight();
            if(width1 == width2 && height1 == height2){
                BufferedImage image3 = new BufferedImage(width1, height1,BufferedImage.TYPE_INT_RGB);
                for(int i=0; i<height1;i++){
                    for(int j=0; j<width1;j++){
                        for(int k = 0; k<width1;k++){
                            Color c = new Color(image1.getRGB(j,i));
                            int red = (int)(c.getRed());
                            int green = (int)(c.getGreen());
                            int blue = (int)(c.getBlue());
                            int RGB = (red+green+blue)/3;
                            Color c2 = new Color(image2.getRGB(j,i));
                            int red2 = (int)(c2.getRed());
                            int green2 = (int)(c2.getGreen());
                            int blue2 = (int)(c2.getBlue());
                            int RGB2 = (red2+green2+blue2)/3;
                            int temp = RGB * RGB2;
                            if(temp > 255)image3.setRGB(j, i, new Color(255,255,255).getRGB());
                            else image3.setRGB(j, i,new Color(0,0,0).getRGB());
                        } 
                    }
                }
                File output = new File("gambarkali.jpg");
                ImageIO.write(image3,"jpg",output);
            }else{
                System.out.println("Maaf tidak bisa diproses karena ukuran gambar berbeda");
            }
        }catch(IOException e){
            System.out.println("Error = "+e);
        }      
    }
    
    public static void CitraTranslasi(int x)
    {
        BufferedImage image;
        int width;
        int height;
        try{
            File input = new File("lena.jpg");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();
            BufferedImage image2 = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
            int height2 = image2.getHeight();
            int width2 = image2.getWidth();
            int k = 0;
            for(int i=0; i<height2;i++){
                int l = 0;
                for(int j=0; j<width2;j++){
                    if(i < x || j < x ){
                        Color c = new Color(0,0,0);
                        image2.setRGB(j,i,c.getRGB());
                    }
                    else{
                        Color c = new Color(image.getRGB(l,k));
                        image2.setRGB(j,i,c.getRGB());
                        l++;
                        if(l>=(width-x)) k++;
                    }
                }
            }
            File output = new File("gambartranslasi.jpg");
            ImageIO.write(image2,"jpg",output);
        }catch(IOException e){
            System.out.println("Error = "+e);
        }        
    }
    
    public static void CitraZoomOut(int x)
    {
        BufferedImage image;
        int width;
        int height;
        try{
            File input = new File("lena.jpg");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();
            BufferedImage image2 = new BufferedImage(width*x, height*x,BufferedImage.TYPE_INT_RGB);
            int m=0, n=0;
            for(int i=0; i<height;i++){
                for(int j=0; j<width;j++){
                    int p = image.getRGB(j, i);
                    for(int k=0;k<x;k++){
                        image2.setRGB(n,m+k,p);
                    }
                    for(int l=0;l<x;l++){
                        image2.setRGB(n+l, m, p);
                    }
                    n= n+x;
                }
                m= m+x;
                n = 0;
            }
            File output = new File("gambarzoomout.jpg");
            ImageIO.write(image2,"jpg",output);
        }catch(IOException e){
            System.out.println("Error = "+e);
        }    
    }
    
    public static void CitraZoomIn(int x)
    {
        BufferedImage image;
        int width;
        int height;
        try{
            File input = new File("lena.jpg");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();
            BufferedImage image2 = new BufferedImage(width/x, height/x,BufferedImage.TYPE_INT_RGB);
            int width2 = image2.getWidth();
            int height2 = image2.getHeight();
            int m =0, n=0;
            for(int i=0; i<height2;i++){
                for(int j=0; j<width2;j++){
                    int red=0,green=0,blue=0;
                    Color c;
                    for(int k=0;k<x;k++){
                        c = new Color(image.getRGB(n,m+k));
                        red += (int)(c.getRed());
                        green += (int)(c.getGreen());
                        blue += (int)(c.getBlue());
                    }
                    for(int l=0;l<x;l++){
                        c = new Color(image.getRGB(n+l,m));
                        red += (int)(c.getRed());
                        green += (int)(c.getGreen());
                        blue += (int)(c.getBlue());
                    }
                    red /= (int)Math.pow(x,2);
                    green /= (int)Math.pow(x,2);
                    blue /= (int)Math.pow(x,2);
                    n += x;
                    image2.setRGB(j,i,new Color(red,green,blue).getRGB());
                }
                m += x;
                n = 0;
            }
            File output = new File("gambarzoomin.jpg");
            ImageIO.write(image2,"jpg",output);
        }catch(IOException e){
            System.out.println("Error = "+e);
        }    
    }
    
    public static void main(String[] args) throws Exception {
        CitraZoomOut(2);
    }
    
}
