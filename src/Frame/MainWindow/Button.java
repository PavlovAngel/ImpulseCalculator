package Frame.MainWindow;

import Data.Calculator;
import Data.Products;
import Frame.MainWindow.TextAreas.NameTextArea;
import Frame.MainWindow.TextAreas.IdTextArea;
import Frame.MainWindow.TextAreas.QuantityTextArea;
import Frame.MainWindow.TextAreas.WeightTextArea;
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
    int weight1 = 0;

    Button() {
        this.setBounds(X, Y, WIDTH, HEIGHT);
        this.addActionListener(this);
        this.setText("Click");
        this.setBackground(Color.WHITE);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == this) {
            try {
                User.loginToSite();


                Products.setDescription();
                Products.setId();
                Products.setName();
                Products.settUrl();
                Products.setWeight();
                Products.setOrderQuantity();
                Calculator.calculate();


            } catch (IOException | ArrayIndexOutOfBoundsException ex) {
                ex.printStackTrace();
            }
            try {
                NameTextArea.textArea.setText(Products.getName());
                QuantityTextArea.textArea.setText(Products.getOrderQuantity());
                IdTextArea.textArea.setText(Products.getId());

            } catch (StringIndexOutOfBoundsException | java.lang.ArrayIndexOutOfBoundsException ex) {
                ex.printStackTrace();
                QuantityTextArea.textArea.setText("Empty");


            }
        }

        weight1 = 0;
    }

}
