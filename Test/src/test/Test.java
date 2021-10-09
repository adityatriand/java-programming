/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Iqbal
 */
public class Test extends JPanel{

    /**
     * @param args the command line arguments
     */
    public void paint(Graphics g){
     Image img = createImageWithText();
     g.drawImage(img, 20,20,this);
    }
    private Image createImageWithText(){
     BufferedImage bufferedImage = new BufferedImage(200,200,BufferedImage.TYPE_INT_RGB);
     Graphics g = bufferedImage.getGraphics();
     
     g.drawString("latihan",20,20);
     g.drawString("latihan",20,20);
     g.drawString("latihan",20,100);
     return bufferedImage;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.getContentPane().add(new Test());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);
    }

}
