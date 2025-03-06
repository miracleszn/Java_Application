
package chapter_12_assignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Exercise9CrapsGame extends JFrame {

    private final JTextField die1Field, die2Field, sumField, pointField;
    private final JButton rollButton;
    private int point = 0; // Stores the point value
    private boolean firstRoll = true; // Track if it's the first roll
    private final Random random = new Random();

    public CrapsGame() {
        super("Craps Game");

        // Layout setup
        setLayout(new GridLayout(5, 2, 10, 10));

        // Labels and TextFields
        add(new JLabel("Die 1:"));
        die1Field = new JTextField(5);
        die1Field.setEditable(false);
        add(die1Field);

        add(new JLabel("Die 2:"));
        die2Field = new JTextField(5);
        die2Field.setEditable(false);
        add(die2Field);

        add(new JLabel("Sum:"));
        sumField = new JTextField(5);
        sumField.setEditable(false);
        add(sumField);

        add(new JLabel("Point:"));
        pointField = new JTextField(5);
        pointField.setEditable(false);
        add(pointField);

        // Roll Button
        rollButton = new JButton("Roll Dice");
        rollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rollDice();
            }
        });
        add(rollButton);

        // Frame settings
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void rollDice() {
        int die1 = random.nextInt(6) + 1; // Random 1-6
        int die2 = random.nextInt(6) + 1;
        int sum = die1 + die2;

        // Display results
        die1Field.setText(String.valueOf(die1));
        die2Field.setText(String.valueOf(die2));
        sumField.setText(String.valueOf(sum));

        if (firstRoll) {
            // First roll rules
            if (sum == 7 || sum == 11) {
                JOptionPane.showMessageDialog(this, "You rolled " + sum + "! You win!");
                resetGame();
            } else if (sum == 2 || sum == 3 || sum == 12) {
                JOptionPane.showMessageDialog(this, "You rolled " + sum + "! You lose.");
                resetGame();
            } else {
                // Set point and continue game
                point = sum;
                pointField.setText(String.valueOf(point));
                firstRoll = false;
            }
        } else {
            // Subsequent rolls
            if (sum == point) {
                JOptionPane.showMessageDialog(this, "You rolled the point " + point + "! You win!");
                resetGame();
            } else if (sum == 7) {
                JOptionPane.showMessageDialog(this, "You rolled a 7! You lose.");
                resetGame();
            }
        }
    }

    private void resetGame() {
        firstRoll = true;
        point = 0;
        pointField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CrapsGame::new);
    }
}
 

