package StartingWindow;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;

public class TextFieldURL extends JTextField implements MouseListener, KeyListener {
    public static TextFieldURL textField = new TextFieldURL();

    TextFieldURL() {
        this.setBounds(-2, -1, 350, 68);
        this.setBackground(new Color(191, 191, 191));
        this.setToolTipText("Enter URL!");
        this.setFont(new Font("Consolas", Font.BOLD, 18));
        this.setText("Enter URL here");
        this.setEditable(true);
        this.addKeyListener(this);
        this.addMouseListener(this);

    }

    public static String getUrlTextField() {
        return textField.getText();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

        this.setText("");

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}