/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komputergrafiik;

import java.awt.*;
import javax.swing.JFrame;
/**
 *
 * @author ACER
 */
public class KomputerGrafiik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame frame = new JFrame();
        frame.setTitle("UAS - Ardiansyah Tria Sati");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 500));
        
        ContohGeometri panel = new ContohGeometri();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
    
}
