package StartingWindow;

import Web.User;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Button extends JButton implements ActionListener {
    static final int WIDTH = 98;
    static final int HEIGHT = 72;

    Button() {
        this.setText("Confirm");
        this.setSize(WIDTH, HEIGHT);
        this.setLocation(345, 0);
        this.setBorderPainted(true);
        this.setBackground(new Color(218, 218, 218));
        this.setForeground(new Color(0, 0, 0));
        this.setFont(new Font("Consolas", Font.BOLD, 14));
        this.setFocusable(false);
        this.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) { 
          User.enterURL();
          User.tryURL();
          StartingWindow.Frame.closeWindow();
          MainWindow.Frame.openWindow();

          
        }

    }

}
