import javax.swing.*;

public class InputDialog {
    public static void main(String[] args) {

        // Custom Title
        UIManager.put("OptionPane.titleText", "User Input Window");

        // Asking user for input
        String name = JOptionPane.showInputDialog(
                null,
                "Please enter your full name:",
                "Input Dialog",
                JOptionPane.QUESTION_MESSAGE
        );

        // If user presses Cancel or closes dialog
        if (name == null || name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "No name entered. Exiting...",
                    "Message",
                    JOptionPane.WARNING_MESSAGE
            );
            System.exit(0);
        }

        // Ask for Age
        String age = JOptionPane.showInputDialog(
                null,
                "Enter your age:",
                "Input Dialog",
                JOptionPane.QUESTION_MESSAGE
        );

        if (age == null || age.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "No age entered. Exiting...",
                    "Message",
                    JOptionPane.WARNING_MESSAGE
            );
            System.exit(0);
        }

        // Final message
        JOptionPane.showMessageDialog(
                null,
                "Welcome, " + name + "!\nYour age is: " + age,
                "User Details",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
