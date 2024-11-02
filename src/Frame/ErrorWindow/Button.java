package Frame.ErrorWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton implements ActionListener {
    Button() {
        this.setText("OK");
        this.setSize(WIDTH, HEIGHT);
        this.setLocation(100, 0);
        this.setBorderPainted(false);
        this.setFont(new Font("Consolas", Font.BOLD, 14));
        this.setBackground(Color.WHITE);
        this.setFocusable(false);
        this.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this)){

        }
    }
}
