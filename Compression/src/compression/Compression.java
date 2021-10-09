/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compression;
import java.io.*;
import java.util.*;
import javax.imageio.*;
import java.awt.image.*;
import javax.imageio.stream.ImageOutputStream;
/**
 *
 * @author Iqbal
 */
public class Compression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        File input = new File("lambangits.jpg");
BufferedImage image = ImageIO.read(input);
File compressedImageFile = new File("compress.jpg");
OutputStream os =new FileOutputStream(compressedImageFile);
Iterator<ImageWriter>writers =
ImageIO.getImageWritersByFormatName("jpg");
ImageWriter writer = (ImageWriter) writers.next();
ImageOutputStream ios = ImageIO.createImageOutputStream(os);
writer.setOutput(ios);
ImageWriteParam param = writer.getDefaultWriteParam();
param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
param.setCompressionQuality(0.05f);
writer.write(null, new IIOImage(image, null, null), param);
os.close();
ios.close();
writer.dispose();
    }

}
