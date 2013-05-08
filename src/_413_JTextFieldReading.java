import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _413_JTextFieldReading implements ActionListener {
    protected JTextField textField;

    public static void main(String[] args) {
        _413_JTextFieldReading gui = new _413_JTextFieldReading();
        gui.textField();
    }

    private void textField() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.lightGray);

        JLabel label = new JLabel("What is your name?");
        textField = new JTextField("Your name", 10);
        textField.selectAll();

        panel.add(label);
        panel.add(textField);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);

        textField.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textField.getText();
        JOptionPane.showMessageDialog(null, "There's a name!  It's " + text);
        System.out.println("Yep, a name is entered.");
        System.out.println(text);
    }

}
