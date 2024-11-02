package Frame.ErrorWindow;

import Frame.MainWindow.TextAreas.IdTextArea;

import javax.swing.*;
import java.awt.*;

public class ErrorText extends JTextArea {
    static final int WIDTH = 220;
    static final int HEIGHT = 150;
    static final int X = 0;
    static final int Y = 0;
    public static ErrorText errorText = new ErrorText();

    ErrorText() {

        this.setBounds(X, Y, WIDTH, HEIGHT);
        this.setFont(new Font("Consolas", Font.BOLD, 18));
        this.setEditable(false);

    }
}
