import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

public class DoriathPane extends JPanel {
    public DoriathPane() {
        setBounds(466, 256, 263, 144);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(new ImageIcon("./Doriath.png").getImage(), 0, 0, null);
        repaint();
    }
}

