import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class Main extends JFrame implements MouseListener {
    private static final int WIDTH = 875;
    private static final int HEIGHT = 725;
    private static final JPanel HITHLUM = new HithlumPane();
    private static final JPanel ARVERNIEN = new ArvernienPane();
    private static final JPanel DORIATH = new DoriathPane();
    private static final JPanel FALAS = new FalasPane();
    private static final JPanel GONDOLIN = new GondolinPane();
    private static final JPanel NARGOTHROND = new NargothrondPane();
    private static final JPanel NEVRAST = new NevrastPane();
    private static final JPanel OSSIRIAND = new OssiriandPane();
    private static final JPanel ANFAUGLITH = new AnfauglithPane();
    private static final JPanel TAUR_NU_FUIN = new TaurPane();

    private boolean openPanel;
    private JButton[] buttons;
    private Container pane;

    public Main() {
        HITHLUM.addMouseListener(this);
        ARVERNIEN.addMouseListener(this);
        DORIATH.addMouseListener(this);
        FALAS.addMouseListener(this);
        GONDOLIN.addMouseListener(this);
        NARGOTHROND.addMouseListener(this);
        NEVRAST.addMouseListener(this);
        OSSIRIAND.addMouseListener(this);
        ANFAUGLITH.addMouseListener(this);
        TAUR_NU_FUIN.addMouseListener(this);
        openPanel = false;
        buttons = new JButton[10];
        setContentPane(new BackgroundPane());
        pane = getContentPane();
        pane.setLayout(null);
        pane.addMouseListener(this);
        buttons[0] = new JButton();
        buttons[0].setBounds(122, 2, 235, 165);
        buttons[0].addActionListener(new HithlumListener());
        buttons[1] = new JButton();
        buttons[1].setBounds(251, 487, 104, 77);
        buttons[1].addActionListener(new ArvernienListener());
        buttons[2] = new JButton();
        buttons[2].setBounds(324, 182, 261, 171);
        buttons[2].addActionListener(new DoriathListener());
        buttons[3] = new JButton();
        buttons[3].setBounds(72, 288, 175, 176);
        buttons[3].addActionListener(new FalasListener());
        buttons[4] = new JButton();
        buttons[4].setBounds(367, 139, 54, 35);
        buttons[4].addActionListener(new GondolinListener());
        buttons[5] = new JButton();
        buttons[5].setBounds(220, 270, 93, 65);
        buttons[5].addActionListener(new NargothrondListener());
        buttons[6] = new JButton();
        buttons[6].setBounds(674, 341, 176, 286);
        buttons[6].addActionListener(new OssiriandListener());
        buttons[7] = new JButton();
        buttons[7].setBounds(70, 144, 155, 82);
        buttons[7].addActionListener(new NevrastListener());
        buttons[8] = new JButton();
        buttons[8].setBounds(364, 2, 266, 83);
        buttons[8].addActionListener(new AnfauglithListener());
        buttons[9] = new JButton();
        buttons[9].setBounds(398, 97, 139, 59);
        buttons[9].addActionListener(new TaurListener());
        for (JButton button : buttons) {
            button.setOpaque(false);
            button.setContentAreaFilled(false);
            button.setBorderPainted(false);
            pane.add(button);
        }
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void mouseReleased(MouseEvent e) {
        if (openPanel) {
            pane.remove(ARVERNIEN);
            pane.remove(HITHLUM);
            pane.remove(DORIATH);
            pane.remove(FALAS);
            pane.remove(GONDOLIN);
            pane.remove(NARGOTHROND);
            pane.remove(NEVRAST);
            pane.remove(OSSIRIAND);
            pane.remove(ANFAUGLITH);
            pane.remove(TAUR_NU_FUIN);
            openPanel = false;
        }
    }

    public void mousePressed(MouseEvent e) { }
    public void mouseClicked(MouseEvent e) { }
    public void mouseEntered(MouseEvent e) { }
    public void mouseExited(MouseEvent e) { }

    private class HithlumListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!openPanel) {
                pane.add(HITHLUM);
                openPanel = true;
            }
        }
    }

    private class ArvernienListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!openPanel) {
                pane.add(ARVERNIEN);
                openPanel = true;
            }
        }
    }

    private class DoriathListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!openPanel) {
                pane.add(DORIATH);
                openPanel = true;
            }
        }
    }
    
    private class FalasListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!openPanel) {
                pane.add(FALAS);
                openPanel = true;
            }
        }
    }

    private class GondolinListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!openPanel) {
                pane.add(GONDOLIN);
                openPanel = true;
            }
        }
    }

    private class NargothrondListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!openPanel) {
                pane.add(NARGOTHROND);
                openPanel = true;
            }
        }
    }

    private class NevrastListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!openPanel) {
                pane.add(NEVRAST);
                openPanel = true;
            }
        }
    }

    private class OssiriandListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!openPanel) {
                pane.add(OSSIRIAND);
                openPanel = true;
            }
        }
    }

    private class AnfauglithListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!openPanel) {
                pane.add(ANFAUGLITH);
                openPanel = true;
            }
        }
    }

    private class TaurListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!openPanel) {
                pane.add(TAUR_NU_FUIN);
                openPanel = true;
            }
        }
    }

    private class BackgroundPane extends JPanel {
        Image background = new ImageIcon("C:/Users/Leo Wu/Dropbox/School Things/History of Middle Earth/BeleriandMap/Beleriand.png").getImage();
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(background, 0, 0, null);
            repaint();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
