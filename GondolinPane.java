import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

public class GondolinPane extends JPanel {
    public GondolinPane() {
        setBounds(388, 155, 251, 132);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(new ImageIcon("./Gondolin.png").getImage(), 0, 0, null);
        repaint();
    }
}
