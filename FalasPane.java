import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

public class FalasPane extends JPanel {
    public FalasPane() {
        setBounds(152, 351, 251, 132);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(new ImageIcon("./Falas.png").getImage(), 0, 0, null);
        repaint();
    }
}
