
package chapter_12_assignment;
    import javax.swing.*;
import java.awt.*;

public class Exercise4Printer {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Printer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.setLayout(new GridBagLayout());
            frame.setResizable(false);

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5);
            gbc.anchor = GridBagConstraints.WEST;

            // Printer label
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.gridwidth = 2;
            frame.add(new JLabel("Printer: MyPrinter"), gbc);

            // Checkboxes (Left side)
            JCheckBox imageCheck = new JCheckBox("Image");
            JCheckBox textCheck = new JCheckBox("Text");
            JCheckBox codeCheck = new JCheckBox("Code");

            gbc.gridx = 0;
            gbc.gridy = 1;
            frame.add(imageCheck, gbc);
            gbc.gridy = 2;
            frame.add(textCheck, gbc);
            gbc.gridy = 3;
            frame.add(codeCheck, gbc);

            // Radio buttons (Right side)
            JRadioButton selectionRadio = new JRadioButton("Selection");
            JRadioButton allRadio = new JRadioButton("All", true);
            JRadioButton appletRadio = new JRadioButton("Applet");

            ButtonGroup group = new ButtonGroup();
            group.add(selectionRadio);
            group.add(allRadio);
            group.add(appletRadio);

            gbc.gridx = 1;
            gbc.gridy = 1;
            frame.add(selectionRadio, gbc);
            gbc.gridy = 2;
            frame.add(allRadio, gbc);
            gbc.gridy = 3;
            frame.add(appletRadio, gbc);

            // Print Quality Label and Dropdown
            JLabel qualityLabel = new JLabel("Print Quality:");
            gbc.gridx = 0;
            gbc.gridy = 4;
            frame.add(qualityLabel, gbc);

            String[] qualityOptions = {"High", "Medium", "Low"};
            JComboBox<String> qualityDropdown = new JComboBox<>(qualityOptions);
            gbc.gridx = 1;
            frame.add(qualityDropdown, gbc);

            // Print to File Checkbox
            JCheckBox printToFileCheck = new JCheckBox("Print to File");
            gbc.gridx = 2;
            frame.add(printToFileCheck, gbc);

            // Buttons (Right side)
            JPanel buttonPanel = new JPanel(new GridLayout(4, 1, 5, 5));
            buttonPanel.add(new JButton("OK"));
            buttonPanel.add(new JButton("Cancel"));
            buttonPanel.add(new JButton("Setup..."));
            buttonPanel.add(new JButton("Help"));

            gbc.gridx = 3;
            gbc.gridy = 0;
            gbc.gridheight = 5;
            gbc.anchor = GridBagConstraints.EAST;
            frame.add(buttonPanel, gbc);

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}


