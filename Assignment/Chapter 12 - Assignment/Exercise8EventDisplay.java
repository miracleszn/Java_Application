
package chapter_12_assignment;


import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;

public class Exercise8EventDisplay extends JFrame implements
        ActionListener, ItemListener, ListSelectionListener, 
        MouseListener, MouseMotionListener, KeyListener {
    
    private JTextArea eventDisplay;
    private JButton actionButton;
    private JCheckBox itemCheckBox;
    private JList<String> list;

    public EventDisplay() {
        super("Event Display Application");

        // Setup layout
        setLayout(new BorderLayout());

        // Text area to display events
        eventDisplay = new JTextArea(15, 40);
        eventDisplay.setEditable(false);
        add(new JScrollPane(eventDisplay), BorderLayout.CENTER);

        // Panel for interactive components
        JPanel panel = new JPanel();
        actionButton = new JButton("Click Me");
        itemCheckBox = new JCheckBox("Check Me");
        String[] listItems = {"Item 1", "Item 2", "Item 3"};
        list = new JList<>(listItems);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add components to panel
        panel.add(actionButton);
        panel.add(itemCheckBox);
        panel.add(new JScrollPane(list));
        add(panel, BorderLayout.SOUTH);

        // Add event listeners
        actionButton.addActionListener(this);
        itemCheckBox.addItemListener(this);
        list.addListSelectionListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(this);

        // Frame settings
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Helper method to display event messages
    private void displayEvent(String eventMessage) {
        eventDisplay.append(eventMessage + "\n");
    }

    // ActionListener method (Button Click)
    @Override
    public void actionPerformed(ActionEvent e) {
        displayEvent("Action Event: " + e.toString());
    }

    // ItemListener method (Checkbox Toggle)
    @Override
    public void itemStateChanged(ItemEvent e) {
        displayEvent("Item Event: " + e.toString());
    }

    // ListSelectionListener method (List Selection Change)
    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            displayEvent("List Selection Event: " + e.toString());
        }
    }

    // MouseListener methods
    @Override
    public void mouseClicked(MouseEvent e) {
        displayEvent("Mouse Clicked: " + e.toString());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        displayEvent("Mouse Pressed: " + e.toString());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        displayEvent("Mouse Released: " + e.toString());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        displayEvent("Mouse Entered: " + e.toString());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        displayEvent("Mouse Exited: " + e.toString());
    }

    // MouseMotionListener methods
    @Override
    public void mouseDragged(MouseEvent e) {
        displayEvent("Mouse Dragged: " + e.toString());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        displayEvent("Mouse Moved: " + e.toString());
    }

    // KeyListener methods
    @Override
    public void keyTyped(KeyEvent e) {
        displayEvent("Key Typed: " + e.toString());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        displayEvent("Key Pressed: " + e.toString());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        displayEvent("Key Released: " + e.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EventDisplay::new);
    }
}


