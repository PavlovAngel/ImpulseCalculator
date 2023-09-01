package MainWindow;
import javax.swing.*;

public class Frame extends JFrame {
    static final int WIDTH = 450;
    static final int HEIGHT = 300;
    static final int LOCATIONX = 1200;
    static final int LOCATIONY = 300;
    static final String mainWindowsName = "Main Window";
    public static Frame mainframe ;

    public Frame() {
        this.setBounds(LOCATIONX, LOCATIONY, WIDTH, HEIGHT);
        this.setTitle(mainWindowsName);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.add(new Button());
        this.setVisible(true);
    }
    

    public static void closeWindow() {
        mainframe.setVisible(false);
    }
    public static void showWindow(){
        mainframe.setVisible(true);
    }

    public static void openWindow() {
       mainframe = new Frame();

    }
}
