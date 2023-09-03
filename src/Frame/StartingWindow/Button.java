package Frame.StartingWindow;

import Web.User;
import Web.WebSite;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Button extends JButton implements ActionListener {
    static final int WIDTH = 90;
    static final int HEIGHT = 70;

    Button() {
        this.setText("Confirm");
        this.setSize(WIDTH, HEIGHT);
        this.setLocation(350, 0);
        this.setBorderPainted(false);
        this.setFont(new Font("Consolas", Font.BOLD, 14));
        this.setBackground(Color.WHITE);
        this.setFocusable(false);
        this.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {
            User.enterURL();
            User.tryURL();

           if (WebSite.getIsRealUrl()){
               try {
                   StartingFrame.openMainWindow();
               } catch (UnsupportedLookAndFeelException ex) {
                   ex.printStackTrace();
               }
           }


        }

    }

}
