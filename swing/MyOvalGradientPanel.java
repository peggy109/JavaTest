import java.awt.*;
import javax.swing.*;

public class MyOvalGradientPanel extends JPanel{
    public void paintComponent(Graphics g) {
        System.out.println("g="+g);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        int red = (int)(Math.random() * 255);
        int green = (int)(Math.random() * 255);
        int blue = (int)(Math.random() * 255);
        Color colorStart = new Color(red, green, blue);
        int red2 = (int)(Math.random() * 255);
        int green2 = (int)(Math.random() * 255);
        int blue2 = (int)(Math.random() * 255);
        Color colorEnd = new Color(red2, green2, blue2);
        GradientPaint paint = new GradientPaint(100, 100, colorStart, 150,150, colorEnd);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setPaint(paint);
        g.fillOval(100, 100, 100, 100);
    }
}
