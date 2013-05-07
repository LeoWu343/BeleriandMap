import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

public class ArvernienPane extends JPanel {
    public ArvernienPane() {
        setBounds(284, 519, 295, 131);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(new ImageIcon("C:/Users/Leo Wu/Dropbox/School Things/History of Middle Earth/BeleriandMap/Arvernien.png").getImage(), 0, 0, null);
        repaint();
    }
}
