/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarjframe;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
/**
 *
 * @author Adit
 */
public class BelajarJframe {
    
    public JPanel adit()
    {
        JPanel panelKu = new JPanel();
        panelKu.setLayout(null);
        
        JPanel panelHijau = new JPanel();
        panelHijau.setBackground(Color.green);
        panelHijau.setLocation(10, 10);
        panelHijau.setSize(50,50);
        panelKu.add(panelHijau);
        
        JPanel panelMerah = new JPanel();
        panelMerah.setBackground(Color.red);
        panelMerah.setLocation(115, 10);
        panelMerah.setSize(50, 50);
        panelKu.add(panelMerah);
 
        JPanel panelOrange = new JPanel();
        panelOrange.setBackground(Color.orange);
        panelOrange.setLocation(220, 10);
        panelOrange.setSize(50, 50);
        panelKu.add(panelOrange);
        
        panelKu.setOpaque(true); 
        return panelKu;  
    }
    
    private static void buatDanTampilkanGUI() 
     {
         BelajarJframe paneKu = new BelajarJframe();
         JFrame frame = new JFrame("Frame Pertama");
         frame.setContentPane(paneKu.adit());
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(300, 150);
         frame.setVisible(true);
     }
    
     public class View extends JFrame {
     
          private Dimension screensize;
          public View() {
          buatDanTampilkanGUI();
 
          // Baris kode ini yang membuat JFrame tampil di tengah layar
         screensize = Toolkit.getDefaultToolkit().getScreenSize();
          setLocation((screensize.width / 2) - (getSize().width / 2), (screensize.height / 2) - (getSize().height / 2));
     }
      }
    
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() 
            {
                buatDanTampilkanGUI();
            }
         });
    }
  
}