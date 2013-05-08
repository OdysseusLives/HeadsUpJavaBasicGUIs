import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _416_JCheckBox implements ActionListener {
    //Heads Up Java, p416

    protected JCheckBox checkBox;

    public static void main(String[] args) {
        _416_JCheckBox gui = new _416_JCheckBox();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.lightGray);

        JLabel label = new JLabel("Tell me yea or nay.");

        checkBox = new JCheckBox("It's sunny outside.");
        checkBox.addActionListener(this);

        panel.add(checkBox);

        frame.getContentPane().add(BorderLayout.NORTH, label);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String onOrOff = "Off";
        if (checkBox.isSelected()) onOrOff = "On";
        System.out.println("Check box is " + onOrOff);
    }
}
