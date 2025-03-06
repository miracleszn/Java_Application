package chapter_12_assignment;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Exercise12EcofrontApp extends JFrame {
    private JLabel displayLabel;
    private JTextField inputField;
    private int fontSize = 9; // Default font size
    private Font ecoFont;

    public EcofrontApp() {
        setTitle("Ecofont Viewer");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Load Ecofont
        try {
            ecoFont = Font.createFont(Font.TRUETYPE_FONT, new File("Spranq_eco_sans_regular.ttf"));
            ecoFont = ecoFont.deriveFont((float) fontSize);
        } catch (FontFormatException | IOException e) {
            JOptionPane.showMessageDialog(this, "Ecofont not found. Please install it first.");
            ecoFont = new Font("Verdana", Font.PLAIN, fontSize); // Fallback to Verdana
        }

        // Input Field
        inputField = new JTextField("Type here...");
        inputField.setFont(ecoFont);
        inputField.addActionListener(e -> updateText());
        add(inputField, BorderLayout.NORTH);

        // Display Label
        displayLabel = new JLabel("Your text will appear here", SwingConstants.CENTER);
        displayLabel.setFont(ecoFont);
        add(displayLabel, BorderLayout.CENTER);

        // Control Panel with Buttons
        JPanel controlPanel = new JPanel();
        JButton increaseButton = new JButton("Increase Font Size");
        JButton decreaseButton = new JButton("Decrease Font Size");

        increaseButton.addActionListener(e -> changeFontSize(1));
        decreaseButton.addActionListener(e -> changeFontSize(-1));

        controlPanel.add(increaseButton);
        controlPanel.add(decreaseButton);
        add(controlPanel, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void changeFontSize(int change) {
        fontSize += change;
        if (fontSize < 6) fontSize = 6; // Prevent extremely small fonts
        ecoFont = ecoFont.deriveFont((float) fontSize);
        displayLabel.setFont(ecoFont);
        inputField.setFont(ecoFont);
    }

    private void updateText() {
        displayLabel.setText(inputField.getText());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EcofrontApp::new);
    }
}
