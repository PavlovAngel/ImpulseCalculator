package Frame.MainWindow.TextAreas;

import javax.swing.*;
import java.awt.*;

public class IdTextArea extends JTextArea {
    static final int WIDTH = 100;
    static final int HEIGHT = 30;
    static final int X = 2;
    static final int Y = 15;
    public static IdTextArea textArea = new IdTextArea();

    IdTextArea() {

        this.setBounds(X, Y, WIDTH, HEIGHT);
        this.setFont(new Font("Consolas", Font.BOLD, 18));
        this.setEditable(false);
    }
}
