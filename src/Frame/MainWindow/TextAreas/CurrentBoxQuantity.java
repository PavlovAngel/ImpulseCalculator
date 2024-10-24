package Frame.MainWindow.TextAreas;

import javax.swing.*;
import java.awt.*;

public class CurrentBoxQuantity extends JTextArea {

    static final int WIDTH = 100;
    static final int HEIGHT = 30;
    static final int X = 330;
    static final int Y = 100;
    public static CurrentBoxQuantity textArea = new CurrentBoxQuantity();

    CurrentBoxQuantity() {
        this.setBounds(X, Y, WIDTH, HEIGHT);
        this.setFont(new Font("Consolas", Font.BOLD, 18));
        this.setEditable(false);


    }
}