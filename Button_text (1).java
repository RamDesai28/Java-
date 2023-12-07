import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class button_text {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a text field
        JTextField textField = new JTextField();
        textField.setBounds(20, 20, 200, 30);

        // Create a text area
        JTextArea textArea = new JTextArea();
        textArea.setBounds(20, 60, 350, 150);
        textArea.setEditable(false);

        // Create a button
        JButton button = new JButton("Click Me");
        button.setBounds(230, 20, 120, 30);

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText(); // Get text from the text field
                textArea.append(text + "\n"); // Append text to the text area
                textField.setText(""); // Clear the text field
            }
        });

        // Add components to the frame
        frame.add(textField);
        frame.add(textArea);
        frame.add(button);

        // Set the layout to null (absolute positioning)
        frame.setLayout(null);

        frame.setVisible(true);
    }
}
