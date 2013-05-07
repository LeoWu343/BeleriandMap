import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

public class HithlumPane extends JPanel {
    public HithlumPane() {
        setBounds(214, 70, 280, 158);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(new ImageIcon("C:/Users/Leo Wu/Dropbox/School Things/History of Middle Earth/BeleriandMap/Hithlum.png").getImage(), 0, 0, null);
        repaint();
    }
}
