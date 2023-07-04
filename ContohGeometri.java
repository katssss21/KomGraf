package komputergrafiik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import javax.swing.JPanel;
import javax.swing.Timer;

public class ContohGeometri extends JPanel {
    private int x = 200; 
    private int y = 200; 
    private int dx = 1;  
    private int dy = 1; 
    
    public ContohGeometri() {
        this.setPreferredSize(new Dimension(500, 600));
        this.setBackground(Color.WHITE);
        
        Timer timer = new Timer(10, e -> {
            x += dx;
            y += dy;
            if (x <= 0 || x >= 350) {
                dx = -dx;
            }
            if (y <= 0 || y >= 400) {
                dy = -dy;
            }
            repaint(); 
        });
        timer.start(); 
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        GradientPaint gradasiBiru = new GradientPaint(0, 0, Color.BLUE, 300, 300, Color.CYAN);
        GradientPaint gradasiMerah = new GradientPaint(0, 300, Color.RED, 300, 0, Color.ORANGE);
        
        Path2D Segitiga1 = new Path2D.Double();
        Segitiga1.moveTo(x + 150, y - 150);
        Segitiga1.lineTo(x, y);
        Segitiga1.lineTo(x + 150, y);
        Segitiga1.closePath();
        g2.setPaint(gradasiBiru);
        g2.fill(Segitiga1);
        
        Path2D Segitiga2 = new Path2D.Double();
        Segitiga2.moveTo(x, y);
        Segitiga2.lineTo(x - 150, y + 200);
        Segitiga2.lineTo(x - 150, y);
        Segitiga2.closePath();
        g2.setPaint(gradasiMerah);
        g2.fill(Segitiga2);
    }
}
