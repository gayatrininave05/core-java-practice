import javax.swing.*;

public class InputDialogExample {
    public static void main(String[] args) {

        // Show Input Dialog
        String name = JOptionPane.showInputDialog(null, "Enter your name:");

        // Display the entered value
        JOptionPane.showMessageDialog(null, "You entered: " + name);
    }
}
