package Frame.StartingWindow;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

import Web.User;
import Web.WebSite;

public class TextFieldURL extends JTextField implements MouseListener, KeyListener {
    public static TextFieldURL textField = new TextFieldURL();

    TextFieldURL() {
        this.setBounds(-1, -1, 350, 70);
        //this.setBackground(new Color(191, 191, 191));
        this.setToolTipText("Enter URL!");
        this.setFont(new Font("Consolas", Font.BOLD, 18));
        this.setText("Enter URL here!"); // todo "Enter URL here"
        this.setEditable(true);
        this.setBackground(new Color(255, 255, 255));
        this.addKeyListener(this);
        this.addMouseListener(this);

    }

    public static void setDefaultText() {
        textField.setText("Enter URL here!");
       // textField.setText("Enter");
    }

    public static void setErrorText() {
        textField.setText("Wrong URL!");
    }

    public static void changeColor(Color color) {
        textField.setForeground(color);
    }

    public static String getUrlTextField() {
        return textField.getText();
    }

    public static void clearTextField() {
        textField.setText("");
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!TextFieldURL.getUrlTextField().equals("Enter")){

                User.enterURL();
                User.tryURL();
                if (WebSite.getIsRealUrl()) {

                    try {
                        StartingFrame.openMainWindow();
                    } catch (UnsupportedLookAndFeelException ex) {
                        ex.printStackTrace();
                    }
                }
            }
            else {
                TextFieldURL.setDefaultText();
                try {
                    StartingFrame.openMainWindow();
                } catch (UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }
            }

        }
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
        TextFieldURL.changeColor(Color.BLACK);

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