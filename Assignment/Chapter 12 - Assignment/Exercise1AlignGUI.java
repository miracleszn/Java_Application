package chapter_12_assignment;


import javax.swing.*;
import java.awt.*;

public class Exercise1AlignGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Align");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(250, 150);
            frame.setLayout(new GridBagLayout());
            frame.setResizable(false);
            
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5);
            gbc.anchor = GridBagConstraints.WEST;
            
            JCheckBox snapToGrid = new JCheckBox("Snap to Grid");
            JCheckBox showGrid = new JCheckBox("Show Grid");
            JLabel xLabel = new JLabel("X:");
            JLabel yLabel = new JLabel("Y:");
            JTextField xField = new JTextField("8", 3);
            JTextField yField = new JTextField("8", 3);
            JButton okButton = new JButton("Ok");
            JButton cancelButton = new JButton("Cancel");
            JButton helpButton = new JButton("Help");

            // First column (Checkboxes)
            gbc.gridx = 0;
            gbc.gridy = 0;
            frame.add(snapToGrid, gbc);

            gbc.gridy = 1;
            frame.add(showGrid, gbc);

            // Second column (Labels)
            gbc.gridx = 1;
            gbc.gridy = 0;
            frame.add(xLabel, gbc);

            gbc.gridy = 1;
            frame.add(yLabel, gbc);

            // Third column (TextFields)
            gbc.gridx = 2;
            gbc.gridy = 0;
            frame.add(xField, gbc);

            gbc.gridy = 1;
            frame.add(yField, gbc);

            // Buttons (Bottom Row)
            gbc.gridx = 3;
            gbc.gridy = 0;
            gbc.gridheight = 2;
            gbc.anchor = GridBagConstraints.EAST;
            gbc.fill = GridBagConstraints.VERTICAL;

            JPanel buttonPanel = new JPanel(new GridLayout(3, 1, 5, 5));
            buttonPanel.add(okButton);
            buttonPanel.add(cancelButton);
            buttonPanel.add(helpButton);

            frame.add(buttonPanel, gbc);

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
 

