import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class itemevent {
    private Checkbox checkbox1, checkbox2;
    private Label resultLabel;

    public itemevent() {
        Frame frame = new Frame("ItemEvent Demo");
        frame.setLayout(new FlowLayout());

        checkbox1 = new Checkbox("Option 1");
        checkbox2 = new Checkbox("Option 2");
        resultLabel = new Label("Selected Options: ");

        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(resultLabel);

        checkbox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                updateResultLabel();
            }
        });

        checkbox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                updateResultLabel();
            }
        });

        frame.setSize(500, 200);
        frame.setVisible(true);
    }

    private void updateResultLabel() {
        String result = "Selected Options: ";
        if (checkbox1.getState()) {
            result += "Option 1 ";
        }
        if (checkbox2.getState()) {
            result += "Option 2";
        }
        resultLabel.setText(result);
    }

    public static void main(String[] args) {
        new itemevent();
    }
}

