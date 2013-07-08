import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

public class TaurPane extends JPanel {
    public TaurPane() {
        setBounds(471, 139, 210, 145);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(new ImageIcon("./Taur.png").getImage(), 0, 0, null);
        repaint();
    }
}
