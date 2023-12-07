import java.awt.*;
import javax.swing.*;

public class grid_layout {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("GridLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a panel with a GridLayout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2)); // 3 rows and 2 columns

        // Create and add components to the panel
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        panel.add(new JButton("Button 5"));
        panel.add(new JButton("Button 6"));

        // Add the panel to the frame
        frame.add(panel);

        frame.setVisible(true);
    }
}

