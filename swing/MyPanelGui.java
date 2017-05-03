import javax.swing.*;

public class MyPanelGui {
public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setContentPane(new MyRectPanel());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);
    frame.setVisible(true);
}
}
