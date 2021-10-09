package line.chart;   
import java.awt.Graphics; 
import java.awt.*; 
import java.awt.event.*; 
import java.awt.geom.*; 
import javax.swing.*;   
public class LineChart extends JPanel{         
    public LineChart(){        
        //Membuat dimensi layar dengan warna background putih         
        this.setPreferredSize(new Dimension(500, 320));         
        this.setBackground(Color.WHITE);     
    }         
    
    protected void paintComponent(Graphics g) {         
        //Inisialisasi         
        super.paintComponent(g);         
        Graphics2D g2 = (Graphics2D) g;               
        GeneralPath gp = new GeneralPath(GeneralPath.WIND_NON_ZERO);                 
        //Membuat tabel line         
        gp.moveTo(28,50);         
        gp.lineTo(379,50);         
        gp.moveTo(30,50);         
        gp.lineTo(30,292);         
        gp.moveTo(28,290);         
        gp.lineTo(379,290);         
        gp.moveTo(28,90);         
        gp.lineTo(379,90);         
        gp.moveTo(28,130);         
        gp.lineTo(379,130);         
        gp.moveTo(28,170);         
        gp.lineTo(379,170);         
        gp.moveTo(28,210);         
        gp.lineTo(379,210);         
        gp.moveTo(28,250);         
        gp.lineTo(379,250);         
                
        //Membuat Line Chartnya         
        gp.moveTo(45,230);         
        gp.lineTo(80,192);         
        gp.moveTo(80,192);         
        gp.lineTo(115,90);             
        gp.moveTo(115,90);         
        gp.lineTo(150,130);         
        gp.moveTo(150,130);         
        gp.lineTo(185,122);         
        gp.moveTo(185,122);         
        gp.lineTo(220,94);         
        gp.moveTo(220,94);         
        gp.lineTo(255,144);         
        gp.moveTo(255,144);         
        gp.lineTo(290,72);         
        gp.moveTo(290,72);         
        gp.lineTo(325,218);         
        gp.moveTo(325,218);         
        gp.lineTo(360,218);         
        gp.moveTo(400,180);         
        gp.lineTo(400,180);         
        //Pemberian warna         
        g2.setColor(Color.blue);         
        g2.setStroke(new BasicStroke(2.5f));         
        g2.draw(gp);               
        //Membuat Label No nya beserta peletakannya         
        g2.setColor(Color.black);         
        g2.drawString("N01",38,310);         
        g2.drawString("N02",70,310);         
        g2.drawString("N03",105,310);         
        g2.drawString("N04",140,310);         
        g2.drawString("N05",175,310);         
        g2.drawString("N06",210,310);         
        g2.drawString("N07",245,310);         
        g2.drawString("N08",280,310);         
        g2.drawString("N09",315,310);         
        g2.drawString("N10",350,310);                 
        //Pembuatan data nya beserta peletakannya         
        g2.drawString("120",2,55);         
        g2.drawString("100",2,94);         
        g2.drawString("80",8,134);         
        g2.drawString("60",8,174);         
        g2.drawString("40",8,214);         
        g2.drawString("20",8,254);         
        g2.drawString("0",14,294);                 
        //Membuat titik merah diantara line chart         
        Shape ling1 = new Ellipse2D.Double(42,223,11,11); //30         
        Shape ling2 = new Ellipse2D.Double(73,190,11,11); //51         
        Shape ling3 = new Ellipse2D.Double(110,88,11,11); //100         
        Shape ling4 = new Ellipse2D.Double(145,123,11,11); //80         
        Shape ling5 = new Ellipse2D.Double(183,115,11,11); //84         
        Shape ling6 = new Ellipse2D.Double(215,90,11,11); //98         
        Shape ling7 = new Ellipse2D.Double(250,138,11,11); // 73         
        Shape ling8 = new Ellipse2D.Double(285,66,11,11); // 109         
        Shape ling9 = new Ellipse2D.Double(321,212,11,11); //36         
        Shape ling10 = new Ellipse2D.Double(358,212,11,11); //36                      
        //Pemberian warna pada titik         
        g2.setColor(Color.RED);         
        g2.fill(ling1);         
        g2.fill(ling2);         
        g2.fill(ling3);         
        g2.fill(ling4);         
        g2.fill(ling5);         
        g2.fill(ling6);         
        g2.fill(ling7);         
        g2.fill(ling8);         
        g2.fill(ling9);         
        g2.fill(ling10);              
    }       
    public static void main(String[] args) {         
        // TODO code application logic here         
        JFrame frame = new JFrame();                 
        frame.setTitle("Line Chart Billy");         
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                 
        LineChart canvas = new LineChart();         
        frame.getContentPane().add(canvas);                 
        frame.pack();         
        frame.setLocationRelativeTo(null);         
        frame.setVisible(true);     
    }     
}
