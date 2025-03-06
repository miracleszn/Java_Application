
package chapter_12_assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise11AtmFrame extends JFrame{
   


    private double balance = 1000.00; // Default balance
    private JTextField inputField;
    private JLabel messageLabel;
    private JButton removeCashButton, insertEnvelopeButton;

    public AtmFrame() {
        // Set up the frame
        setTitle("ATM Machine");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Message Label
        messageLabel = new JLabel("Welcome! Select an option:", SwingConstants.CENTER);
        add(messageLabel, BorderLayout.NORTH);

        // Input Field
        inputField = new JTextField();
        add(inputField, BorderLayout.CENTER);

        // Buttons Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 2, 5, 5));

        JButton withdrawButton = new JButton("Withdraw");
        JButton depositButton = new JButton("Deposit");
        JButton balanceButton = new JButton("Check Balance");
        JButton exitButton = new JButton("Exit");

        removeCashButton = new JButton("Remove Cash");
        insertEnvelopeButton = new JButton("Insert Envelope");

        removeCashButton.setEnabled(false);
        insertEnvelopeButton.setEnabled(false);

        buttonPanel.add(withdrawButton);
        buttonPanel.add(depositButton);
        buttonPanel.add(balanceButton);
        buttonPanel.add(exitButton);
        buttonPanel.add(removeCashButton);
        buttonPanel.add(insertEnvelopeButton);

        add(buttonPanel, BorderLayout.SOUTH);

        // Event Listeners
        withdrawButton.addActionListener(e -> withdraw());
        depositButton.addActionListener(e -> deposit());
        balanceButton.addActionListener(e -> checkBalance());
        exitButton.addActionListener(e -> System.exit(0));
        removeCashButton.addActionListener(e -> removeCash());
        insertEnvelopeButton.addActionListener(e -> insertEnvelope());

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void withdraw() {
        try {
            double amount = Double.parseDouble(inputField.getText());
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                messageLabel.setText("Please take your cash.");
                removeCashButton.setEnabled(true);
            } else {
                messageLabel.setText("Invalid amount or insufficient funds.");
            }
        } catch (NumberFormatException e) {
            messageLabel.setText("Enter a valid amount.");
        }
    }

    private void deposit() {
        messageLabel.setText("Insert your envelope.");
        insertEnvelopeButton.setEnabled(true);
    }

    private void checkBalance() {
        messageLabel.setText("Current Balance: $" + balance);
    }

    private void removeCash() {
        messageLabel.setText("Cash removed. Thank you!");
        removeCashButton.setEnabled(false);
    }

    private void insertEnvelope() {
        try {
            double amount = Double.parseDouble(inputField.getText());
            if (amount > 0) {
                balance += amount;
                messageLabel.setText("Deposit successful! New balance: $" + balance);
                insertEnvelopeButton.setEnabled(false);
            } else {
                messageLabel.setText("Enter a valid deposit amount.");
            }
        } catch (NumberFormatException e) {
            messageLabel.setText("Enter a valid amount.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AtmFrame::new);
    }
}
 

