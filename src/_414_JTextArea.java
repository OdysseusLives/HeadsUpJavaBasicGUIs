import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _414_JTextArea implements ActionListener {
    //Heads Up Java, p414-415

    protected JTextArea textArea;

    public static void main(String[] args) {
        _414_JTextArea gui = new _414_JTextArea();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.lightGray);

        JLabel label = new JLabel("Tell me something interesting.");

        JButton button = new JButton("Click it!");
        button.addActionListener(this);

        textArea = new JTextArea(10,20);
        textArea.setText("Not all who are lost are wandering.");
        textArea.selectAll();

        panel.add(button);
        panel.add(textArea);

        frame.getContentPane().add(BorderLayout.NORTH, label);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textArea.getText();
        textArea.append("\n\nbutton clicked");
        JOptionPane.showMessageDialog(null, "Your message is:  " + text);
        System.out.println(text);
    }
}
