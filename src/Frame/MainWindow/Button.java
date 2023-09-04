package Frame.MainWindow;

import Data.Calculator;
import Data.Details;
import Frame.MainWindow.TextAreas.DescriptionTextArea;
import Frame.MainWindow.TextAreas.IdTextArea;
import Frame.MainWindow.TextAreas.QuantityTextArea;
import Web.User;

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

    Button() {
        this.setBounds(X, Y, WIDTH, HEIGHT);
        this.addActionListener(this);
        this.setText("Click");
        this.setBackground(Color.WHITE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {
            try {
                User.loginToSite();
                Details.setDescription();
                Details.setId();
                Details.setName();
                Details.setQuantity();
                System.out.println(Details.getQuantity());
                Calculator.calculate();
            } catch (IOException | ArrayIndexOutOfBoundsException ex) {
                ex.printStackTrace();
                IdTextArea.textArea.setText("");


            }
            try {
                DescriptionTextArea.textArea.setText(Details.getName());
                QuantityTextArea.textArea.setText(Details.getQuantity());
                IdTextArea.textArea.setText(Details.getId());

            } catch (StringIndexOutOfBoundsException | java.lang.ArrayIndexOutOfBoundsException ex) {
                ex.printStackTrace();
                QuantityTextArea.textArea.setText("Empty");


            }
        }
    }
}
