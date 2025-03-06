
package chapter_12_assignment;
import javax.swing.*;
import java.awt.*;


public class Exercise2Calculator {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(250, 300);
            frame.setLayout(new BorderLayout());
            frame.setResizable(false);

            // Text field at the top
            JTextField display = new JTextField();
            display.setEditable(false);
            display.setHorizontalAlignment(JTextField.RIGHT);
            frame.add(display, BorderLayout.NORTH);

            // Panel for buttons with GridLayout
            JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));

            // Button labels
            String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
            };

            // Add buttons to the panel
            for (String text : buttons) {
                buttonPanel.add(new JButton(text));
            }

            frame.add(buttonPanel, BorderLayout.CENTER);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}


