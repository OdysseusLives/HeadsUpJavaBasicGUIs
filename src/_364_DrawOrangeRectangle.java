import javax.swing.*;
import java.awt.*;

public class _364_DrawOrangeRectangle extends JPanel {
    // Heads up, Java Ch12 p364
    public void paintComponent(Graphics g) { // override
        g.setColor(Color.orange);
        g.fillRect(20,50,100,100);
    }

}
