import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class MyPanelGui {
    JFrame frame = null;
    JButton button = null;
public static void main(String[] args) {
    MyPanelGui gui = new MyPanelGui();
    gui.go();
}
public void go() {
    frame = new JFrame();
//    frame.setContentPane(new MyRectPanel());
//    frame.setContentPane(new MyImagePanel());
//    frame.setContentPane(new MyOvalPanel());
    frame.setContentPane(new MyOvalGradientPanel());

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);
    frame.setVisible(true);
    button = new JButton("click me");
    button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            button.setText("I've been clicked!");
            frame.repaint();
        }
        });
    frame.getContentPane().add(button);
}
}
