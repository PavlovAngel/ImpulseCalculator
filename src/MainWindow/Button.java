package MainWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton implements ActionListener {
    Button() {
        this.setBounds(300, 0, 100, 40);
        this.addActionListener(this);
        this.setText("Click");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {
          OrderTextArea.textArea.setBackground(Color.BLUE);
          QuantityTextArea.textField.setBackground(Color.RED);

        }
    }
}
