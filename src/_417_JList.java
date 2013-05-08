import com.sun.deploy.util.StringUtils;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Collator;
import java.util.Collection;
import java.util.TreeSet;

public class _417_JList implements ActionListener, ListSelectionListener {
    //Heads Up Java, p414-415

    protected JList list;
    protected Collection<String> chosen;

    public static void main(String[] args) {
        _417_JList gui = new _417_JList();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.lightGray);

        JLabel label = new JLabel("Choose!");

        JButton button = new JButton("Click it!");
        button.addActionListener(this);

        String[] listEntries = {"alpha", "beta", "gamma", "delta",
            "epsilon", "zeta", "eta", "theta"};
        list = new JList(listEntries);
        list.setVisibleRowCount(4);
        list.addListSelectionListener(this);
        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        panel.add(list);

        JScrollPane scroller = new JScrollPane(list) ;
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panel.add(scroller);

        chosen = new TreeSet<String>(Collator.getInstance());

        frame.getContentPane().add(BorderLayout.NORTH, label);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selection = (String) list.getSelectedValue();
        System.out.println("Final choice: " + selection);
        System.out.println("Choices that were clicked: " + StringUtils.join(chosen, ", "));

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            String selection = (String) list.getSelectedValue();
            System.out.println(selection);
            chosen.add(selection);
        }
    }
}
