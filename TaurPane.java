import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

public class TaurPane extends JPanel {
    public TaurPane() {
        setBounds(471, 139, 210, 145);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(new ImageIcon("C:/Users/Leo Wu/Dropbox/School Things/History of Middle Earth/BeleriandMap/Taur.png").getImage(), 0, 0, null);
        repaint();
    }
}
