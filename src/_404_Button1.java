import javafx.scene.text.FontSmoothingType;

import javax.swing.*;
import java.awt.*;

public class _404_Button1 {
    // Heads Up Java, Ch 13, p404
    JButton button;

    public static void main(String[] args) {
        _404_Button1 gui = new _404_Button1();
//        gui.goEastAndSmall();
//        gui.goEastAndLong();
//        gui.goNorth();
//        gui.goBold();
        gui.goAllOver();
    }

    private void goAllOver() {
        JFrame frame = new JFrame();

        JButton north = new JButton("North");
        JButton south = new JButton("South");
        JButton east = new JButton("East");
        JButton west = new JButton("West");
        JButton center = new JButton("Center");

        frame.getContentPane().add(BorderLayout.NORTH, north);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        frame.getContentPane().add(BorderLayout.EAST, east);
        frame.getContentPane().add(BorderLayout.WEST, west);
        frame.getContentPane().add(BorderLayout.CENTER, center);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    private void goBold() {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click This!");
        Font bigFont = new Font("serif", Font.BOLD, 28);
        button.setFont(bigFont);
        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);
    }

    private void goNorth() {
        JFrame frame = new JFrame();
        JButton button = new JButton("There is no spoon...");
        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);
    }


    public void goEastAndSmall() {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click me!");
        frame.getContentPane().add(BorderLayout.EAST, button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);
    }

    public void goEastAndLong() {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click me like you mean it!");
        frame.getContentPane().add(BorderLayout.EAST, button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
