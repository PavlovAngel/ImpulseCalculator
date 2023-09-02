package MainWindow;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    static final int WIDTH = 450;
    static final int HEIGHT = 300;
    static final int LOCATIONX = 0;
    static final int LOCATIONY = 0;
    Panel(){
        this.setBounds(LOCATIONX, LOCATIONY, WIDTH, HEIGHT);
        this.add(QuantityTextArea.textField);
        this.setBackground(new Color(0, 212, 212));
        this.add(new Button());
        this.add(OrderTextArea.textArea);
        this.setLayout(null);


    }
}
