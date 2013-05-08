import javax.swing.*;

public class _353_BasicFrame {
    // Heads Up Java, Ch 12, p353
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JButton button = new JButton("Click me!");
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
