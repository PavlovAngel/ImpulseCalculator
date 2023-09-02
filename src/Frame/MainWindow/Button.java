package Frame.MainWindow;

import Web.WebSite;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Button extends JButton implements ActionListener {
    static final int WIDTH = 100;
    static final int HEIGHT = 40;
    static final int X = 320;
    static final int Y = 200;

    String[] quantity;

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
                quantity = (WebSite.getDocument().getElementsByClass(
                        "mdc-layout-grid__cell mdc-layout-grid__cell--span-1-tablet mdc-layout-grid__cell--span-2-desktop mdc-layout-grid--align-right").html().split("\\n"));
            } catch (IOException | java.lang.ArrayIndexOutOfBoundsException ex) {
                QuantityTextArea.textField.setText("");

            }
            try {

                System.out.println(quantity[1]);
                QuantityTextArea.textField.setText(quantity[quantity.length - 1]);

            } catch (java.lang.ArrayIndexOutOfBoundsException ex) {
                QuantityTextArea.textField.setText("Empty");


            }
        }
    }
}
