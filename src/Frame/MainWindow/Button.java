package Frame.MainWindow;

import Data.Details;
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
                Web.User.loginToSite();
            } catch (IOException | java.lang.ArrayIndexOutOfBoundsException ex) {
                QuantityTextArea.textField.setText("");

            }
            try {

                System.out.println(Arrays.toString(Details.QUANTITYARRAY));
                QuantityTextArea.textField.setText(Details.QUANTITYARRAY[Details.QUANTITYARRAY.length - 1]);

            } catch (java.lang.ArrayIndexOutOfBoundsException ex) {
                QuantityTextArea.textField.setText("Empty");


            }
        }
    }
}
