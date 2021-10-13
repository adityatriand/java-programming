/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edgedetection;

/**
 *
 * @author Adit
 */

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import edgedetection.Convolution.*;

public class EdgeDetection {
    public static File detectEdges(BufferedImage bufferedImage) throws IOException {
        double[][][] image = transformImageToArray(bufferedImage);
        double[][] filter = {{1, 2, 1}, {0, 0, 0}, {-1, -2, -1}}; //Filter Sobel Horizontal
        double[][] convolvedPixels = applyConvolution(bufferedImage.getWidth(),
        bufferedImage.getHeight(), image, filter);
        return createImageFromConvolutionMatrix(bufferedImage, convolvedPixels);
    }
    
    private static double[][][] transformImageToArray(BufferedImage bufferedImage) {
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        double[][][] image = new double[3][height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                Color color = new Color(bufferedImage.getRGB(j, i));
                image[0][i][j] = color.getRed();
                image[1][i][j] = color.getGreen();
                image[2][i][j] = color.getBlue();
            }
        }
        return image;
    }
    
    private static double[][] applyConvolution(int width, int height, double[][][] image, double[][] filter) {
        Convolution convolution = new Convolution();
        double[][] redConv = convolution.convolutionType2(image[0], height, width, filter, 3, 3, 1);
        double[][] greenConv = convolution.convolutionType2(image[1], height, width, filter, 3, 3, 1);
        double[][] blueConv = convolution.convolutionType2(image[2], height, width, filter, 3, 3, 1);
        double[][] finalConv = new double[redConv.length][redConv[0].length];
        for (int i = 0; i < redConv.length; i++) {
            for (int j = 0; j < redConv[i].length; j++) {
                finalConv[i][j] = redConv[i][j] + greenConv[i][j] + blueConv[i][j];
            }
        }
        return finalConv;
    }
    
    private static File createImageFromConvolutionMatrix(BufferedImage originalImage, double[][] imageRGB) throws IOException {
        BufferedImage writeBackImage = new BufferedImage(originalImage.getWidth(), originalImage.getHeight(), BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < imageRGB.length; i++) {
            for (int j = 0; j < imageRGB[i].length; j++) {
                Color color = new Color(fixOutOfRangeRGBValues(imageRGB[i][j]),
                fixOutOfRangeRGBValues(imageRGB[i][j]),
                fixOutOfRangeRGBValues(imageRGB[i][j]));
                writeBackImage.setRGB(j, i, color.getRGB());
            }
        }
        File outputFile = new File("kucingedge.jpg");
        ImageIO.write(writeBackImage,"jpg",outputFile);
        return outputFile;
    }
    
    private static int fixOutOfRangeRGBValues(double value) {
        if (value < 0.0) {
            value = -value;
        }
        if (value > 255) {
            return 255;
        } else {
            return (int) value;
        }
    }
    
    public static void main(String [] args) throws IOException{
        BufferedImage image;
        try{
            File input = new File("kucing.jpg");
            image = ImageIO.read(input);
            detectEdges(image);
        }catch(IOException e){
            System.out.println("Error: "+e);
        }
    }
}
