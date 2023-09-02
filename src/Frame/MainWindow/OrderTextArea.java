package Frame.MainWindow;

import javax.swing.*;

public class OrderTextArea extends JTextArea {
    static final int WIDTH = 140;
    static final int HEIGHT = 40;
    static final int X = 2;
    static final int Y = 4;
   public static OrderTextArea textArea = new OrderTextArea();

    OrderTextArea(){

        this.setBounds(X,Y,WIDTH,HEIGHT);
       this.setEditable(false);
    }
}
