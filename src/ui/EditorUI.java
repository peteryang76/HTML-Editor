package ui;

import javax.swing.*;
import java.awt.*;

// Main UI
public class EditorUI extends JFrame {

    public static final int WIDTH = 1200;
    public static final int HEIGHT = 1200;

    public EditorUI() {
        super("HTML Editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        MenuPanel menu = new MenuPanel();
        add(menu, BorderLayout.NORTH);
        menu.setVisible(true);

        centreOnScreen();

        pack();
        setVisible(true);
    }

    private void centreOnScreen() {
        Dimension scrn = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((scrn.width - getWidth()) / 2, (scrn.height - getHeight()) / 2);
    }
}
