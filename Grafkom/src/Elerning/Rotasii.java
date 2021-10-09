/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elerning;

/**
 *
 * @author lenovo
 */
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;

public class Rotasii extends JFrame {

public static void main(String[] args)
{
new Rotasii(); 
}

public Rotasii() {
this.setTitle("Elerning Pertemuan 8 ROTASI");
this.setSize(500, 500); 
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.add(new PaintSurface(), BorderLayout.CENTER);
Thread t = new AnimationThread(this); 
t.start();
this.show();
}

}


class AnimationThread extends Thread {
JFrame c;

public AnimationThread(JFrame c){
this.c = c;
}

public void run(){
while(true){
c.repaint(); 
try{
Thread.sleep(30); 
}
catch(InterruptedException ex){
}
}

}
}
class PaintSurface extends JComponent{
double x_pos = 100;
double y_pos = 100;
int rotation = 0;
double angle = 0;

public void paint(Graphics g){
Graphics2D g2 = (Graphics2D)g; 
g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
if(rotation == 360) {
rotation = 0;
}
else {
rotation += 20; 
angle -= 0.05;
x_pos = 100*Math.cos(angle)+150; 
y_pos = 100*Math.sin(angle)+150;
}

Shape ball = new Ellipse2D.Float((int)x_pos,(int)y_pos, 70, 30); 
g2.rotate(Math.toRadians(rotation), x_pos + 50/2, y_pos + 20/2); 
g2.setColor(Color.BLUE); 
g2.fill(ball); 
}

}
