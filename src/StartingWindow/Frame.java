package StartingWindow;

import javax.swing.*;

public class Frame extends JFrame {
    static final int WIDTH = 450;
    static final int HEIGHT = 100;
    static final int LOCATIONX = 1200;
    static final int LOCATIONY = 300;
    static final String startingWindowsName = "URL Window";
    private static Frame frame;

    public Frame() {
        this.setBounds(LOCATIONX, LOCATIONY, WIDTH, HEIGHT);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle(startingWindowsName);
        this.add(new Button());
        this.add(TextFieldURL.textField);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);

    }

    public static void closeWindow() {
        frame.setVisible(false);;
    }
    public static void showWindow (){
        frame.setVisible(true);
    }

    public static void openWindow() {
       frame = new Frame();
      

    }
}
