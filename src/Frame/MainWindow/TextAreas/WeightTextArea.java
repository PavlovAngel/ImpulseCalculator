package Frame.MainWindow.TextAreas;

import Web.WebSite;

import javax.swing.*;
import java.awt.*;

public class WeightTextArea extends JTextArea {
    static final int WIDTH = 100;
    static final int HEIGHT = 30;
    static final int X = 2;
    static final int Y = 100;
 public static   WeightTextArea textArea = new WeightTextArea();
    WeightTextArea(){
        this.setBounds(X, Y, WIDTH, HEIGHT);
        this.setFont(new Font("Consolas", Font.BOLD, 18));
        this.setEditable(false);

    }
}
