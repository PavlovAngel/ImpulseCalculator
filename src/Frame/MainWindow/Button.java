package Frame.MainWindow;

import Data.Details;
import Frame.MainWindow.TextAreas.IdTextArea;
import Frame.MainWindow.TextAreas.QuantityTextArea;
import Web.User;
import Web.WebSite;

import javax.swing.*;
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

                Details.setQuantityLine();
                Details.setQuantityArray();
                Details.setidLine();
                Details.setID();
            } catch (IOException | ArrayIndexOutOfBoundsException ex) {
                ex.printStackTrace();
                IdTextArea.textArea.setText("");


            }
            try {
                String test  = Arrays.toString(WebSite.getDocument().getElementsByClass("mdc-layout-grid__cell mdc-layout-grid__cell--span-6-tablet mdc-layout-grid__cell--span-8-desktop").html().split("\\("));

                String[] aray = test.split("<span style=\"margin-right:20px;min-width:16px\">5</span><span style=\"padding-right:20px\">");

                String[] array2 = aray[1].split(",");
                System.out.println(test);
                System.out.println(aray[1].substring(6));
                System.out.println(array2[0].substring(6));
                QuantityTextArea.textArea.setText(Details.quantityArray[Details.quantityArray.length-1]);
                if (Details.getID().length > 10) {
                    IdTextArea.textArea.setText(Details.getID()[Details.getID().length - 1].substring(89, 94));

                } else {
                    IdTextArea.textArea.setText(Details.getID()[Details.getID().length - 1].substring(88, 93));

                }

            } catch (StringIndexOutOfBoundsException | java.lang.ArrayIndexOutOfBoundsException ex) {
                ex.printStackTrace();
                QuantityTextArea.textArea.setText("Empty");


            }
        }
    }
}
