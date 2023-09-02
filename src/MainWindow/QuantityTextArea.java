package MainWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class QuantityTextArea extends JTextArea implements KeyListener {
    static final int WIDTH = 150;
    static final int HEIGHT = 50;
    static final int X = 2;
    static final int Y = 4;
    public static QuantityTextArea textField = new QuantityTextArea();

    QuantityTextArea() {
        this.setBounds(X, Y, WIDTH, HEIGHT);
        this.setFont(new Font("Consolas", Font.BOLD, 18));
        this.addKeyListener(this);
        this.setEditable(false);
    }

    public static void setTextFieldText(String text) {
        textField.setText(text);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == KeyEvent.VK_ENTER) {
            OrderTextArea.textArea.setText(QuantityTextArea.textField.getText());

        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
