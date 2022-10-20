package ui;

import javax.swing.*;
import java.awt.*;

// Main UI
public class EditorUI extends JFrame {

    public static final int WIDTH = 1200;
    public static final int HEIGHT = 1200;
    public JFrame frame;

    public EditorUI() {
        frame = new JFrame("HTML Editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));

        CanvasPanel cp = new CanvasPanel();
        MenuPanel menu = new MenuPanel(cp);
        frame.add(menu, BorderLayout.NORTH);
        frame.add(cp, BorderLayout.SOUTH);
        menu.setVisible(true);

        centreOnScreen();

        frame.pack();
        frame.setVisible(true);
    }

    private void centreOnScreen() {
        Dimension scrn = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((scrn.width - getWidth()) / 2, (scrn.height - getHeight()) / 2);
    }

    public JFrame getFrame() {
        return frame;
    }
}
