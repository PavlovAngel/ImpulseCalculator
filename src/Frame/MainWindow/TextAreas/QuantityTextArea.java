package Frame.MainWindow.TextAreas;

import Data.Details;

import javax.swing.*;
import java.awt.*;

public class QuantityTextArea extends JTextArea {
    static final int WIDTH = 100;
    static final int HEIGHT = 30;
    static final int X = 330;
    static final int Y = 15;
    public static QuantityTextArea textArea = new QuantityTextArea();

    QuantityTextArea() {
        this.setBounds(X, Y, WIDTH, HEIGHT);
        this.setFont(new Font("Consolas", Font.BOLD, 18));
        this.setEditable(false);


    }
}
