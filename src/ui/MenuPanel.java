package ui;

import javax.swing.*;
import java.awt.*;

// Create the menu for the editor
public class MenuPanel extends JPanel {

    JButton file, insert;

    public static final int HEIGHT = 30;
    private static final Color backgroundColor = Color.lightGray;
    private static final String[] fileOptions = {"Save", "edit!!!"};
    private static final String[] insertOptions = {"Table", "Image"};

    public MenuPanel() {
        setPreferredSize(new Dimension(EditorUI.WIDTH, HEIGHT));
        setBackground(backgroundColor);
        initialize();
    }

    private void initialize() {
        insert = new JButton("Insert");
//        insert = new JComboBox(insertOptions);
        insert.setPreferredSize(new Dimension(100, HEIGHT));
        insert.setVisible(true);
        add(insert);
    }


}
