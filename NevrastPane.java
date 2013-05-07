import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

public class NevrastPane extends JPanel {
    public NevrastPane() {
        setBounds(125, 180, 210, 145);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(new ImageIcon("C:/Users/Leo Wu/Dropbox/School Things/History of Middle Earth/BeleriandMap/Nevrast.png").getImage(), 0, 0, null);
        repaint();
    }
}
