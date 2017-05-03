import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class MyPanelGui2 {
    JFrame frame = null;
    JButton button = null;
public static void main(String[] args) {
    MyPanelGui gui = new MyPanelGui();
    gui.go();
}
public void go() {
    frame = new JFrame();
    MyOvalGradientPanel panel = new MyOvalGradientPanel();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    button = new JButton("click me");
    button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            button.setText("I've been clicked!");
            frame.repaint();
        }
        });
    frame.getContentPane().add(BorderLayout.EAST, button);
    frame.getContentPane().add(BorderLayout.CENTER, panel);
    frame.setSize(300, 300);
    frame.setVisible(true);
}
}
