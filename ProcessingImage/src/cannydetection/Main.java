/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cannydetection;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Adit
 */
public class Main {
    //Canny parameters
    private static final double CANNY_THRESHOLD_RATIO = .2; //Suggested range .2 - .4
    private static final int CANNY_STD_DEV = 1;             //Range 1-3

    public static void main(String[] args) {
        File file = new File("lena.jpg");
        try {
            BufferedImage input = ImageIO.read(file);
            BufferedImage output = Canny.CannyEdges(input, CANNY_STD_DEV, CANNY_THRESHOLD_RATIO);
            File out = new File("lenacanny.jpg");
            ImageIO.write(output, "jpg", out);
        } catch (IOException ex) {
            System.out.println("ERROR ACCESING IMAGE FILE:\n" + ex.getMessage());
        }
    }    
}
