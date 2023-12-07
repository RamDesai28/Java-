import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButton {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Radio Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // Create a panel to hold the radio buttons
        JPanel panel = new JPanel();

        // Create a label to display the selected option
        JLabel label = new JLabel("Selected Option: ");
        label.setHorizontalAlignment(JLabel.CENTER);

        // Create radio buttons
        JRadioButton option1 = new JRadioButton("Option 1");
        JRadioButton option2 = new JRadioButton("Option 2");
        JRadioButton option3 = new JRadioButton("Option 3");

        // Create a button group to ensure exclusive selection
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);

        // Add action listeners to radio buttons
        option1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Selected Option: Option 1");
            }
        });

        option2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Selected Option: Option 2");
            }
        });

        option3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Selected Option: Option 3");
            }
        });

        // Add components to the panel
        panel.add(option1);
        panel.add(option2);
        panel.add(option3);

        // Create a layout for the panel
        panel.setLayout(new GridLayout(3, 1));

        // Add the panel and label to the frame
        frame.add(panel, BorderLayout.WEST);
        frame.add(label, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
