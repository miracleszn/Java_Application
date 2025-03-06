
package chapter_12_assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Exercise7GuessTheNumber {
    private int randomNumber;
    private int previousGuess;
    private JFrame frame;
    private JTextField guessField;
    private JLabel messageLabel;
    private JButton newGameButton;

    public GuessTheNumber() {
        // Setup frame
        frame = new JFrame("Guess the Number");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // Initialize components
        messageLabel = new JLabel("I have a number between 1 and 1000. Can you guess it?");
        guessField = new JTextField(10);
        JButton guessButton = new JButton("Guess");
        newGameButton = new JButton("New Game");
        newGameButton.setEnabled(false); // Initially disabled

        // Add components to frame
        frame.add(messageLabel);
        frame.add(new JLabel("Enter your guess:"));
        frame.add(guessField);
        frame.add(guessButton);
        frame.add(newGameButton);

        // Generate random number
        generateNewNumber();

        // Action listener for guess button
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processGuess();
            }
        });

        // Action listener for new game button
        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateNewNumber();
            }
        });

        // Show frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void generateNewNumber() {
        Random random = new Random();
        randomNumber = random.nextInt(1000) + 1;
        previousGuess = 0; // Reset previous guess
        messageLabel.setText("I have a number between 1 and 1000. Can you guess it?");
        guessField.setText("");
        guessField.setEditable(true);
        guessField.setBackground(Color.WHITE);
        newGameButton.setEnabled(false);
    }

    private void processGuess() {
    try {
        int guess = Integer.parseInt(guessField.getText()); // Read user input

        if (guess < 1 || guess > 1000) {
            messageLabel.setText("Guess a number between 1 and 1000.");
            return;
        }

        // Determine if warmer or colder
        if (previousGuess != 0) {
            if (Math.abs(guess - randomNumber) < Math.abs(previousGuess - randomNumber)) {
                guessField.setBackground(Color.RED); // Warmer
            } else {
                guessField.setBackground(Color.BLUE); // Colder
            }
        }

        previousGuess = guess;

        // Check if guess is correct
        if (guess < randomNumber) {
            messageLabel.setText("Too Low! Try again.");
        } else if (guess > randomNumber) {
            messageLabel.setText("Too High! Try again.");
        } else {
            messageLabel.setText("Correct! You got it!");
            guessField.setBackground(Color.GREEN);
            guessField.setEditable(false);
            newGameButton.setEnabled(true);
        }
    } catch (NumberFormatException ex) {
        messageLabel.setText("Invalid input! Enter a number.");
    }
    }
    public static void main(String[] args) {
    SwingUtilities.invokeLater(GuessTheNumber::new);
}

}

