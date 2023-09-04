package Frame.MainWindow.TextAreas;

import javax.swing.*;
import java.awt.*;

public class DescriptionTextArea extends JTextArea {
    static final int WIDTH = 190;
    static final int HEIGHT = 30;
    static final int X = 120;
    static final int Y = 15;
    public static DescriptionTextArea textArea = new DescriptionTextArea();

    DescriptionTextArea() {
        this.setBounds(X, Y, WIDTH, HEIGHT);
        this.setFont(new Font("Consolas", Font.BOLD, 18));
        this.setEditable(false);


    }
}