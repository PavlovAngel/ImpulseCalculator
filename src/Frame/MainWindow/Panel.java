package Frame.MainWindow;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    static final int WIDTH = 450;
    static final int HEIGHT = 300;
    static final int X = 0;
    static final int Y = 20;


    Panel() {
        this.setBounds(X, Y, WIDTH, HEIGHT);
        this.add(QuantityTextArea.textArea);
        this.add(new Button());
        this.add(OrderTextArea.textArea);
        this.setBackground(new Color(0, 0, 0, 44));
        this.setLayout(null);




    }



}
