package MainWindow;

import javax.swing.*;

public class Frame extends JFrame {
    static final int WIDTH = 450;
    static final int HEIGHT = 300;
    static final int LOCATIONX = 1200;
    static final int LOCATIONY = 300;
    static final String mainWindowsName = "Main Window";
    public static StartingWindow.Frame frame;
        public Frame(){
            this.setBounds(LOCATIONX,LOCATIONY,WIDTH,HEIGHT);
            this.setTitle(mainWindowsName);
            this.setVisible(true);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

}
