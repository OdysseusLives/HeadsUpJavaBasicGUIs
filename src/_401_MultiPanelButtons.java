import javax.swing.*;

public class _401_MultiPanelButtons {
    // Heads Up Java, Ch 13, p401
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();

        panelB.add(new JButton("button1"));
        panelB.add(new JButton("button2"));
        panelB.add(new JButton("button3"));
        panelA.add(new JButton("button!!!!"));
        panelA.add(panelB);

        frame.getContentPane().add(panelA);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
