import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _358_SimpleGUI1B implements ActionListener {
    // Heads up, Java Ch12 p358-360
    // WIP once clicked
    JButton button;

    public static void main(String[] args) {
        _358_SimpleGUI1B gui = new _358_SimpleGUI1B();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click me!");
        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        button.setText("I've been clicked!");
    }
}
