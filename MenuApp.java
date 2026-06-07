import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuApp {
    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Menu Application");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create Menu Bar
        JMenuBar menuBar = new JMenuBar();

        // Create Menus
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        // Create Menu Items
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        JMenuItem aboutItem = new JMenuItem("About");

        // Add Menu Items to Menus
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        helpMenu.add(aboutItem);

        // Add Menus to Menu Bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Add MenuBar to Frame
        frame.setJMenuBar(menuBar);

        // Add action for Exit item
        exitItem.addActionListener(e -> System.exit(0));

        // Display Frame
        frame.setVisible(true);
    }
}
