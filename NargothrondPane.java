import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

public class NargothrondPane extends JPanel {
    public NargothrondPane() {
        setBounds(285, 314, 221, 147);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(new ImageIcon("./Nargothrond.png").getImage(), 0, 0, null);
        repaint();
    }
}
