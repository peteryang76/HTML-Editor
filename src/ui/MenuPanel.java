package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

// Create the menu for the editor
public class MenuPanel extends JPanel {

    CanvasPanel cp;

    JButton save, insert;

    private String currentState = "mainPanel";

    public static final int HEIGHT = 30;
    private static final Color backgroundColor = Color.lightGray;
    private static final String[] fileOptions = {"Save", "edit!!!"};
    private static final String[] insertOptions = {"Table", "Image"};

    public MenuPanel(CanvasPanel cp) {
        this.cp = cp;
        setPreferredSize(new Dimension(EditorUI.WIDTH, HEIGHT));
        setBackground(backgroundColor);
        initialize();
    }

    private void initialize() {
        initializeInsert();
    }

    private void initializeInsert() {
        insert = new JButton("Insert");
        insert.setPreferredSize(new Dimension(100, HEIGHT));
        insert.setVisible(true);
        insert.addActionListener(this::performActions);
        add(insert);
    }

    private void insertSelectedItem(String selected) {
        if (selected.equals("Table")) {
            int row = Integer.parseInt(JOptionPane.showInputDialog(this,
                    "Number of row", "Insert Table", JOptionPane.PLAIN_MESSAGE));
            int col = Integer.parseInt(JOptionPane.showInputDialog(this,
                    "Number of col", "Insert Table", JOptionPane.PLAIN_MESSAGE));
            JTable table = new JTable(row, col);
            cp.add(table);
        }
    }


    public void performActions(ActionEvent e) {
        String d = e.getActionCommand();
        if (d.equals("Insert")) {
            String selected = String.valueOf(JOptionPane.showInputDialog(this, "Choose", "Menu",
                    JOptionPane.PLAIN_MESSAGE, null, insertOptions, insertOptions[0]));
            currentState = selected;
            insertSelectedItem(selected);
        }
    }


}
