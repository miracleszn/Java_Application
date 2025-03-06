
package chapter_12_assignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise5TemperatureConversion {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create the frame
            JFrame frame = new JFrame("Temperature Converter");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(350, 150);
            frame.setLayout(new FlowLayout());

            // Create components
            JLabel promptLabel = new JLabel("Enter Fahrenheit:");
            JTextField fahrenheitField = new JTextField(5);
            JButton convertButton = new JButton("Convert");
            JLabel resultLabel = new JLabel("Celsius: ");

            // Action listener for the button
            convertButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        // Get Fahrenheit input
                        double fahrenheit = Double.parseDouble(fahrenheitField.getText());
                        
                        // Convert to Celsius
                        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

                        // Display the result
                        resultLabel.setText(String.format("Celsius: %.2f", celsius));
                    } catch (NumberFormatException ex) {
                        resultLabel.setText("Invalid input! Please enter a number.");
                    }
                }
            });

            // Add components to the frame
            frame.add(promptLabel);
            frame.add(fahrenheitField);
            frame.add(convertButton);
            frame.add(resultLabel);

            // Display the frame
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
