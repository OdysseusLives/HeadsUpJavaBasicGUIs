import javax.swing.*;
import java.awt.*;

public class _408_Panel1FlowLayout {
    //Heads Up Java, p 408-411
    public static void main(String[] args) {
        _408_Panel1FlowLayout gui = new _408_Panel1FlowLayout();
//        gui.goOneButtonOnPanel();
//        gui.goTwoButtonsOnPanel();
//        gui.goThreeButtons();
//        gui.makeBoxLayout();
    }

    private void goOneButtonOnPanel() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button = new JButton("Shock me!");  // Part of the panel, not the frame!
        panel.add(button);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    private void goTwoButtonsOnPanel() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        JButton button = new JButton("Shock me!");
        panel.add(button);
        JButton button1 = new JButton("Bliss");  // Cool! Inline
        panel.add(button1);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);

    }

    private void goThreeButtons() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        JButton button = new JButton("Shock me!");
        panel.add(button);
        JButton button1 = new JButton("Bliss");
        panel.add(button1);
        JButton button2 = new JButton("Huh? Where am I?"); // Derp. Line overflows
        panel.add(button2);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);

    }

    private void makeBoxLayout() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));  // Allows for stacking

        JButton button = new JButton("Shock me!");
        panel.add(button);
        JButton button1 = new JButton("Bliss");
        panel.add(button1);
        JButton button2 = new JButton("Huh? Where am I?");
        panel.add(button2);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
