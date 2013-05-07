import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

public class FalasPane extends JPanel {
    public FalasPane() {
        setBounds(152, 351, 251, 132);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(new ImageIcon("C:/Users/Leo Wu/Dropbox/School Things/History of Middle Earth/BeleriandMap/Falas.png").getImage(), 0, 0, null);
        repaint();
    }
}
