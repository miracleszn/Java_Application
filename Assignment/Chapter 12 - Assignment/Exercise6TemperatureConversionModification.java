
package chapter_12_assignment;



 import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise6TemperatureConversionModification {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TemperatureConversionModification().createGUI());
    }

    public void createGUI() {
        // Create Frame
        JFrame frame = new JFrame("Temperature Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // Create Components
        JLabel inputLabel = new JLabel("Enter Temperature:");
        JTextField inputField = new JTextField(5);
        String[] scales = {"Celsius", "Fahrenheit", "Kelvin"};
        JComboBox<String> fromScale = new JComboBox<>(scales);
        JLabel toLabel = new JLabel("to");
        JComboBox<String> toScale = new JComboBox<>(scales);
        JButton convertButton = new JButton("Convert");
        JLabel resultLabel = new JLabel("Result: ");

        // Action Listener for Conversion
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double inputTemp = Double.parseDouble(inputField.getText());
                    String from = (String) fromScale.getSelectedItem();
                    String to = (String) toScale.getSelectedItem();
                    double convertedTemp = convertTemperature(inputTemp, from, to);
                    resultLabel.setText(String.format("Result: %.2f %s", convertedTemp, to));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input! Enter a valid number.");
                }
            }
        });

        // Add Components to Frame
        frame.add(inputLabel);
        frame.add(inputField);
        frame.add(fromScale);
        frame.add(toLabel);
        frame.add(toScale);
        frame.add(convertButton);
        frame.add(resultLabel);

        // Display Frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Conversion Logic
    private double convertTemperature(double value, String from, String to) {
        if (from.equals(to)) {
            return value; // No conversion needed
        }

        double celsius;
        // Convert from input scale to Celsius first
        switch (from) {
            case "Fahrenheit": celsius = (value - 32) * 5 / 9; break;
            case "Kelvin": celsius = value - 273.15; break;
            default: celsius = value; // Already in Celsius
        }

        // Convert from Celsius to target scale
        switch (to) {
            case "Fahrenheit": return (celsius * 9 / 5) + 32;
            case "Kelvin": return celsius + 273.15;
            default: return celsius; // Already in Celsius
        }
    }
}
   

