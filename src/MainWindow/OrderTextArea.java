package MainWindow;

import javax.swing.*;

public class OrderTextArea extends JTextArea {
    static final int WIDTH = 150;
    static final int HEIGHT = 50;
    static final int X = 2;
    static final int Y = 60;
   public static OrderTextArea textArea = new OrderTextArea();
    OrderTextArea(){
        this.setBounds(X,Y,WIDTH,HEIGHT);
       this.setEditable(false);
    }
}
