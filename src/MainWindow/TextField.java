package MainWindow;

import StartingWindow.Frame;
import Web.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TextField extends JTextField implements KeyListener {
    public static TextField textField = new TextField();

    TextField() {
        this.setBounds(0,0,150,30);
        this.setFont(new Font("Consolas", Font.BOLD, 18));
        this.addKeyListener(this);
    }

public static void setTextFieldText(String text){
        textField.setText(text);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == KeyEvent.VK_ENTER) {
           setTextFieldText("click");

        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
