import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BetterMenuApp extends JFrame implements ActionListener {

    JTextArea textArea;
    JLabel statusBar;

    public BetterMenuApp() {

        // Frame Setup
        setTitle("Advanced Menu Application");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Text Area
        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Status Bar
        statusBar = new JLabel("Ready");
        statusBar.setBorder(BorderFactory.createEtchedBorder());
        add(statusBar, BorderLayout.SOUTH);

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();

        // ==== FILE MENU ====
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic('F');  

        JMenuItem newItem = new JMenuItem("New", 'N');
        JMenuItem openItem = new JMenuItem("Open", 'O');
        JMenuItem saveItem = new JMenuItem("Save", 'S');
        JMenuItem exitItem = new JMenuItem("Exit", 'E');

        // Keyboard shortcuts
        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));

        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // ==== EDIT MENU ====
        JMenu editMenu = new JMenu("Edit");
        editMenu.setMnemonic('E');

        JMenuItem cutItem = new JMenuItem("Cut", 'T');
        JMenuItem copyItem = new JMenuItem("Copy", 'C');
        JMenuItem pasteItem = new JMenuItem("Paste", 'P');

        cutItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        copyItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        pasteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));

        cutItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        // ==== HELP MENU ====
        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutItem = new JMenuItem("About");
        aboutItem.addActionListener(e -> JOptionPane.showMessageDialog(this,
                "Advanced Menu Application\nDeveloped in Java Swing",
                "About",
                JOptionPane.INFORMATION_MESSAGE));

        helpMenu.add(aboutItem);

        // Add to Menu Bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Set menu bar
        setJMenuBar(menuBar);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        statusBar.setText(cmd + " selected");

        switch (cmd) {
            case "Cut":
                textArea.cut();
                break;
            case "Copy":
                textArea.copy();
                break;
            case "Paste":
                textArea.paste();
                break;
            case "New":
                textArea.setText("");
                break;
            case "Save":
                JOptionPane.showMessageDialog(this, "Saving not implemented (demo)");
                break;
        }
    }

    public static void main(String[] args) {
        new BetterMenuApp();
    }
}
