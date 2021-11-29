/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicubicInterpolation;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Adit
 */
public class bicubicInterpolation {
        public static BufferedImage Resize(BufferedImage image, int x) {
        int width = image.getWidth();
        int height = image.getHeight();

        BufferedImage imageResize = new BufferedImage(width * x, height * x, BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < (int) (width * x); i++) {
            for (int j = 0; j < (int) (height * x); j++) {
                imageResize.setRGB(i, j, image.getRGB((int) (i / x), (int) (j / x)));
            }
        }

        return imageResize;
    }

    public static void interpolationBicubic(String nama_file, String tipe_file, int newSize) {
        try {
            String input_name1 = nama_file + "." + tipe_file;
            File input1 = new File(input_name1);
            BufferedImage image1 = ImageIO.read(input1);

            BufferedImage imageResize = Resize(image1, newSize);

            BufferedImage imageBicubic = new BufferedImage(imageResize.getWidth(null), imageResize.getHeight(null),
                    BufferedImage.TYPE_INT_RGB);

            int newWidth = imageResize.getWidth();
            int newHeight = imageResize.getHeight();
            for (int y = 0; y < newHeight; y++) {
                for (int x = 0; x < newWidth; x++) {
                    int valueRGB;
                    if (x > 1 && x < newWidth - 2 && y < newHeight - 2 && y > 1)
                        valueRGB = bicubicInter(imageResize, x, y);
                    else
                        valueRGB = imageResize.getRGB(x, y);

                    imageBicubic.setRGB(x, y, valueRGB);
                }
            }

            String output_name = nama_file + "_bicubicInter." + tipe_file;
            File output = new File(output_name);
            ImageIO.write(imageBicubic, tipe_file, output);

        } catch (IOException e) {
            System.out.println("Error = " + e);
        }
    }

    public static int interpolasiCubic(int A, int B, int C, int D) {
        int red = 0, green = 0, blue = 0;

        red += (A & 0x00ff0000) >> 16;
        green += (A & 0x0000ff00) >> 8;
        blue += A & 0x000000ff;

        red += (B & 0x00ff0000) >> 16;
        green += (B & 0x0000ff00) >> 8;
        blue += B & 0x000000ff;

        red += (C & 0x00ff0000) >> 16;
        green += (C & 0x0000ff00) >> 8;
        blue += C & 0x000000ff;

        red += (D & 0x00ff0000) >> 16;
        green += (D & 0x0000ff00) >> 8;
        blue += D & 0x000000ff;

        Color color = new Color(red / 4, green / 4, blue / 4);
        int rgb = color.getRGB();

        return rgb;
    }

    public static int bicubicInter(BufferedImage image, int x, int y) {

        int p00 = image.getRGB(x - 1, y - 1);
        int p10 = image.getRGB(x + 0, y - 1);
        int p20 = image.getRGB(x + 1, y - 1);
        int p30 = image.getRGB(x + 2, y - 1);
        int p01 = image.getRGB(x - 1, y + 0);
        int p11 = image.getRGB(x + 0, y + 0);
        int p21 = image.getRGB(x + 1, y + 0);
        int p31 = image.getRGB(x + 2, y + 0);
        int p02 = image.getRGB(x - 1, y + 1);
        int p12 = image.getRGB(x + 0, y + 1);
        int p22 = image.getRGB(x + 1, y + 1);
        int p32 = image.getRGB(x + 2, y + 1);
        int p03 = image.getRGB(x - 1, y + 2);
        int p13 = image.getRGB(x + 0, y + 2);
        int p23 = image.getRGB(x + 1, y + 2);
        int p33 = image.getRGB(x + 2, y + 2);

        int col0 = interpolasiCubic(p00, p10, p20, p30);
        int col1 = interpolasiCubic(p01, p11, p21, p31);
        int col2 = interpolasiCubic(p02, p12, p22, p32);
        int col3 = interpolasiCubic(p03, p13, p23, p33);
        int value = interpolasiCubic(col0, col1, col2, col3);

        int valueRGB = value;

        return valueRGB;
    }
}
