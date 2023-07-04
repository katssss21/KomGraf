/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komputergrafiik;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;


/**
 *
 * @author ACER
 */
public class ContohGeometri extends JPanel {
    public ContohGeometri(){
        this.setPreferredSize(new Dimension(500, 600));
        this.setBackground(Color.WHITE);

        
    }
    @Override
    public void paintComponent (Graphics g){
       super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        GradientPaint gradasiBiru = new GradientPaint(0,0, Color.BLUE, 300, 300, Color.CYAN);
        GradientPaint gradasiMerah = new GradientPaint(0, 300, Color.RED, 300, 0, Color.ORANGE);
        
        Path2D Segitiga1 = new Path2D.Double();
        Segitiga1.moveTo(350, 50);
        Segitiga1.lineTo(200, 200);
        Segitiga1.lineTo(350, 200);
        Segitiga1.closePath();
        g2.setPaint(gradasiBiru);
        g2.fill(Segitiga1);
        
        Path2D Segitiga2 = new Path2D.Double();
        Segitiga2.moveTo(200, 200);
        Segitiga2.lineTo(50, 400);
        Segitiga2.lineTo(50, 200);
        Segitiga2.closePath();
        g2.setPaint(gradasiMerah);
        g2.fill(Segitiga2);
    }
}