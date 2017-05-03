import java.awt.*;
import javax.swing.*;

public class MyImagePanel extends JPanel{
    public void paintComponent(Graphics g) {
        Image image = new ImageIcon("cat.jpg").getImage();
        g.drawImage(image, 3, 4, this);
    }
}
