package ui;

import javax.swing.*;
import java.awt.*;

public class CanvasPanel extends JPanel {

    public CanvasPanel() {
        setPreferredSize(new Dimension(EditorUI.WIDTH, EditorUI.HEIGHT - MenuPanel.HEIGHT));
    }

}
