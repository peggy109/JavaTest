import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class MyPanelGui2 {
    JFrame frame = null;
    JLabel label = null;
public static void main(String[] args) {
    MyPanelGui2 gui = new MyPanelGui2();
    gui.go();
}
public void go() {
    frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    MyOvalGradientPanel panel = new MyOvalGradientPanel();
    JButton buttonLabel = new JButton("change label");
    JButton buttonColor = new JButton("change circle");
    label = new JLabel("a label~");
    buttonLabel.addActionListener(new LabelListener());
    buttonColor.addActionListener(new ColorListener());
    frame.getContentPane().add(BorderLayout.WEST, label);
    frame.getContentPane().add(BorderLayout.CENTER, panel);
    frame.getContentPane().add(BorderLayout.EAST, buttonLabel);
    frame.getContentPane().add(BorderLayout.SOUTH, buttonColor);
    frame.setSize(300, 300);
    frame.setVisible(true);
}
class LabelListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        label.setText("has been changed");
    }
}
class ColorListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        frame.repaint();
    }
}
}
