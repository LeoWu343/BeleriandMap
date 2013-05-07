import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

public class OssiriandPane extends JPanel {
    public OssiriandPane() {
        setBounds(625, 428, 210, 145);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(new ImageIcon("C:/Users/Leo Wu/Dropbox/School Things/History of Middle Earth/BeleriandMap/Ossiriand.png").getImage(), 0, 0, null);
        repaint();
    }
}
