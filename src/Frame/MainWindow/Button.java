package Frame.MainWindow;

import Data.Details;
import Web.User;
import Web.WebSite;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Arrays;

public class Button extends JButton implements ActionListener {
    static final int WIDTH = 100;
    static final int HEIGHT = 40;
    static final int X = 320;
    static final int Y = 200;

    Button() {
        this.setBounds(X, Y, WIDTH, HEIGHT);
        this.addActionListener(this);
        this.setText("Click");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {
            try {
                User.loginToSite();
            } catch (IOException | ArrayIndexOutOfBoundsException ex) {
                QuantityTextArea.textArea.setText("");

            }
            try {

                if (Details.getID().length > 9){
                    System.out.println(Details.getID()[Details.getID().length-1].substring(89,94));
                }
                else   {
                    System.out.println(Details.getID()[Details.getID().length-1].substring(88,93));
                }
            } catch (java.lang.ArrayIndexOutOfBoundsException ex) {
                QuantityTextArea.textArea.setText("Empty");


            }
        }
    }
}
